package com.github.estorsk;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/task1")
    public Task1 task1(){
        return new Task1();
    }

    @GetMapping(value = "/task2")
    public Task2 task2(){
        return new Task2();
    }

    @GetMapping(value = "/task3")
    public Task3 task3(){
        return new Task3();
    }

    @GetMapping(value = "/task4")
    public Task4 task4(){
        return new Task4();
    }

    @GetMapping(value = "/task5")
    public Task5 task5(){
        return new Task5();
    }

    @GetMapping(value = "/task7")
    public Task7 task7(){
        return new Task7();
    }

    @GetMapping(value = "/task8")
    public Task8 task8(){
        return new Task8();
    }
}
