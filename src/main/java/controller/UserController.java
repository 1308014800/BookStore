package controller;

import bean.User;
import bean.testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@Controller
public class UserController implements Serializable {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(String username,  HttpServletRequest httpServletRequest){
       bean.User user = userService.login(username);
        httpServletRequest.getSession().setAttribute("user",user);
        return "/user/login_success";
    }

    @RequestMapping(value = "/zhuxiao")
    public String zhuxiao(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().removeAttribute("user");
        return "redirect:/";
    }

    @RequestMapping(value = "/zhuce")
    public  String zhuce(String uname,String pwd,String email){
          userService.zhuce(uname,pwd,email);
        return "/user/regist_success.html";
    }

    @RequestMapping(value = "/user/clear")
    @Transactional
    public String qingkong(HttpServletRequest request ){
        User user = (User) request.getSession().getAttribute("user");
        userService.RemoveCarts(user.getId());
        return "redirect:/user/cart";
    }


    @RequestMapping(value = "/test" ,method = RequestMethod.POST)
    @ResponseBody
    public String test(testbean testbean){
        System.out.println(testbean.toString());
        return "ok";
    }
}
