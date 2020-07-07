package com.github.estorsk;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(value = "/")
    public BaseResponse root(){
        return new BaseResponse(HttpStatus.OK.name());
    }

    @PostMapping(value = "/user")
    public BaseResponse createUser(@RequestBody UserRequest userRequest){
        return new BaseResponse(userRequest.toString());
    }
}
