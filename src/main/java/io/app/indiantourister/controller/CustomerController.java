package io.app.indiantourister.controller;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Customer;
import io.app.indiantourister.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
@Tag(name = "CustomerController", description = "Customer Management API.")
public class CustomerController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    @Operation(method = "POST", description = "Creates the customer to be registered on the application.")
    public ResponseEntity<Customer> createUser(@RequestBody CustomerDto dto) {
        Customer customer = userService.processUser(dto);
        return  ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}
