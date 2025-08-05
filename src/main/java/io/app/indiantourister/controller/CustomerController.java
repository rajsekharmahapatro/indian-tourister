package io.app.indiantourister.controller;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Customer;
import io.app.indiantourister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class CustomerController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public Customer createUser(@RequestBody CustomerDto dto){
        return userService.processUser(dto);
    }
}
