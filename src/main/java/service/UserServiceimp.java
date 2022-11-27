package service;


import bean.User;
import com.bookstore.bookstore_two.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String username) {
       return userMapper.login(username);
    }

    @Override
    public void zhuce(String uname, String pwd, String email) {
        userMapper.zhuce(uname,pwd,email);
    }

    @Override
    public void RemoveCarts(int id) {
        userMapper.ClearCarts(id);
    }

}
