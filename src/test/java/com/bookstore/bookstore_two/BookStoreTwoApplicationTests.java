package com.bookstore.bookstore_two;

import bean.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.bookstore.bookstore_two.Mapper.tMapper;
import com.bookstore.bookstore_two.Mapper.testBeanMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.*;

@SpringBootTest
class BookStoreTwoApplicationTests {


    static User user;

    @Autowired
    tMapper mapper;

    @Autowired
    testBeanMapper testBeanMapper;



    @BeforeEach
    void newUSer(){
        user=new User();
        String str= RandomStringUtils.randomAlphabetic(10);
        user.setUserName(str);
        user.setId(1);
        user.setEmail("1308014800@qq.com");
        user.setPassWord("123456");
        user.setRole(0);

    }

    @Test
    @Transactional
    void contextLoads() {
        mapper.insert(user);
        System.out.println(user.getId());
    }

        @Test
    @Transactional
    void


        testdelete(){
//            HashMap<String, Object> stringObjectHashMap = new HashMap<>();
//            stringObjectHashMap.put("id",1);
//            stringObjectHashMap.put("uname","lina");

            mapper.delete(new QueryWrapper<>());

        }
    @Test
    @Transactional
    void testselect(){

        //除了通过id查询的其他方法全部可以参数为空，查全部
    }

    @Test
    @Transactional
    void testupdate(){
        user.setEmail(null);
        mapper.updateById(user);
//        mapper.update(new UpdateWrapper<User>().set("email","lili"));
    }

    @Test
    @Transactional
    void testWrapper(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<User> lambda = userQueryWrapper.lambda();

        lambda.select(User::getId,User::getUserName);
        List<Map<String, Object>> maps = mapper.selectMaps(lambda);
        maps.forEach(System.out::println);
//                userQueryWrapper.like("username", "a")
//                .gt("age", 20)
//                .or(i->{i.isNull("email").eq("uname","lina");});
//                userQueryWrapper.select(User.class,i -> i.getProperty().equals("email"));
////            |    userQueryWrapper.select()
////                .isNull("email");
////        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
////        objectObjectHashMap.put("uname","lina");
////        objectObjectHashMap.put("email",null);
////        userQueryWrapper.allEq(objectObjectHashMap,false);
////        mapper.selectMaps(userQueryWrapper);
//        List<Map<String, Object>> maps = mapper.selectMaps(userQueryWrapper);
//        maps.forEach(System.out::println);


//        mapper.selectMaps(userQueryWrapper.or(i->{
//            if(i!=null)
//                i.or();
//            else i.eq();
//        }));
    }

    @Test
    void testBean(){
//
        bean.Test test = new bean.Test();
        test.setUser(user);
//        testBeanMapper.insert(new bean.Test());
//        this.testBeanMapper.insert(test);
        System.out.println(testBeanMapper.selectById(3));
    }
    @Test
    void testbeandelete(){
        testBeanMapper.deleteById(2);
    }
}
