package io.app.indiantourister.service;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Customer processUser(CustomerDto customerDto);
}
