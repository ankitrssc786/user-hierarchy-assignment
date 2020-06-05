package com.user.hierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.hierarchy.dto.ApiResponse;
import com.user.hierarchy.dto.UserDto;
import com.user.hierarchy.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    public static final String SUCCESS = "success";
    @Autowired
    private UserService userService;

    @RequestMapping(value = { "", "/useraccess" }, method = RequestMethod.POST)
    public ApiResponse createUserAccess(@RequestBody UserDto user){
        return new ApiResponse(HttpStatus.OK, SUCCESS, userService.save(user));
    }
    
    @RequestMapping(value = { "", "/alluseraccess" }, method = RequestMethod.POST)
    public ApiResponse createAllUserAccess(@RequestBody UserDto user){
        return new ApiResponse(HttpStatus.OK, SUCCESS, userService.save(user));
    }


}
