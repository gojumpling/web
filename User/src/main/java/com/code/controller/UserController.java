package com.code.controller;


import com.code.pojo.User;
import com.code.service.UserService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaoshuai
 * @since 2023-06-28
 */
@RestController
public class UserController {


    @Resource
    UserService userService;

    static int code;
    static String email;
    @Resource
    JavaMailSender sender;

    @RequestMapping(value = "/User",method = RequestMethod.POST)
    public Boolean addUser(@RequestBody User user){

        user.setUserId(userService.getUserID()+1);
        return userService.save(user);

    }


    @RequestMapping(value = "/User",method = RequestMethod.DELETE)
    public Boolean deleteUser(@RequestParam("User_id") int id){
        return userService.deleteUser(id);
    }


    @RequestMapping(value = "/User",method = RequestMethod.PUT)
    public Boolean updateUser(@RequestBody User user){

        return userService.saveOrUpdate(user);
    }


    @RequestMapping(value = "/User",method = RequestMethod.GET)
    public User getUserByID(@RequestParam("User_id") int id){

        return userService.getById(id);

    }


    @RequestMapping(value = "/User/getAllUser",method = RequestMethod.GET)
    public List<User> getAllUser(){

        return userService.list(null);


    }

    @RequestMapping(value = "/User/Login",method = RequestMethod.POST)
    public User Login(@RequestBody User user){

        return userService.login(user);

    }



    @RequestMapping(value = "/User/sendMail",method = RequestMethod.GET)
    public void sendMail(@RequestParam("mail") String mail){

        //SimpleMailMessage是一个比较简易的邮件封装，支持设置一些比较简单内容
        SimpleMailMessage message = new SimpleMailMessage();
        //设置邮件标题
        message.setSubject("邮箱验证码");
        Random random = new Random();
        code = random.nextInt(899999)+100000;
        email = mail;
        //设置邮件内容
        message.setText("您的注册验证码为:"+code+"，三分钟内有效，请及时完成注册！如果不是本人操作，请忽略。");
        //设置邮件发送给谁，可以多个，这里就发给你的QQ邮箱
        message.setTo(mail);
        //邮件发送者，这里要与配置文件中的保持一致
        message.setFrom("495096496@qq.com");
        //OK，万事俱备只欠发送
        sender.send(message);
    }


    @RequestMapping(value = "/User/register",method = RequestMethod.POST)
    public Boolean register(@RequestBody Map<String, Object> map){

        String account = map.get("userAccount").toString();
        String pwd = map.get("userPwd").toString();
        String userEmail = map.get("userEmail").toString();
        int number = Integer.parseInt(map.get("code").toString());



        if (code==number && email.equals(userEmail)){
            User user = new User();
            user.setUserAccount(account);
            user.setUserPwd(pwd);
            user.setUserEmail(userEmail);
            user.setUserId(userService.getUserID()+1);
            userService.save(user);
            return true;
        }
        else
            return false;

    }








}

