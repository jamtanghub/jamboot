package com.jam.boot.jamboot.web;


import com.jam.boot.jamboot.data.ReContent;
import com.jam.boot.jamboot.model.User;
import com.jam.boot.jamboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/main")
public class HelloController extends BaseController {



    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ReContent hello(){
        ReContent re = new ReContent();


//        User user = userService.getOne();

//        re.setContent(user);

        re.setDebug("当前系统运行模式:" + this.sysModal);

        re.setCode(200);
        re.setMsg("操作成功");
        re.setStatus(true);


        return re;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public ReContent user(@Valid User user, BindingResult bindingResult){
        ReContent reContent = new ReContent();

        if(bindingResult.hasErrors()){
            reContent.setMsg(bindingResult.getAllErrors());
            reContent.setStatus(false);
        }else{
            reContent.setMsg("操作成功");
            reContent.setStatus(true);
        }


        return reContent;
    }


}
