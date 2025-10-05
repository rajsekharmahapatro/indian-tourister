package io.app.indiantourister.service;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.mapping.CustomerMapper;
import io.app.indiantourister.model.Customer;
import io.app.indiantourister.repository.CustomerRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Customer processUser(CustomerDto customerDto) {
        return customerRepo.save(customerMapper.toEntity(customerDto));
    }
}
