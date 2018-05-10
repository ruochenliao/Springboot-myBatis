package com.john.controller;


import com.john.domain.City;
import com.john.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by bysocket on 07/02/2017 .
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/getCity")
    public City findOneCity(String cityName) {
        cityName = "shenzhen";
        return cityService.findCityByName(cityName);
    }
    @RequestMapping(value = "/getCityByCityName")
    public City getCityByCityName(HttpServletRequest request) {
        String cityName = request.getParameter("cityName");
        if( cityName == null || cityName.length() == 0 ){
            return null;
        }
        return cityService.findCityByName(cityName);
    }
}
