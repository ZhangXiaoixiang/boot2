package com.xz.boot2.api;

import com.xz.boot2.entity.Authentication;
import com.xz.boot2.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
    @Autowired
    private AuthenticationService authenticationService;
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public String getUser(@PathVariable("id") Integer id){
        Authentication authentication = authenticationService.getById(id);
        System.out.println(authentication);
        return "spring boot2 is ok!"+authentication;
    }
}
