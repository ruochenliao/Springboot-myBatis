package com.john.controller;

import com.john.domain.City;
import com.john.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john on 5/7/18.
 */
@RestController
public class UserController {
    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
