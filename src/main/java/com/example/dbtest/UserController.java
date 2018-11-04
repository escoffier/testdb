package com.example.dbtest;

import com.example.dbtest.service.MyBatisUserService;
//import com.example.dbtest.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/xxuser")
public class UserController {

    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @GetMapping()
    @ResponseBody
    public User getUser(Long id) {
        return myBatisUserService.getUser(id);
}

}
