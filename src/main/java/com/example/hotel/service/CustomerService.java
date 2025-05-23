package com.example.hotel.service;

import hotel.model.CustomerDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.mapper.CustomerMapping;
import com.example.hotel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {

        this.customerRepo = customerRepo;
    }

    //POST /customer
    public CustomerDto createCustomer(CustomerDto customerDto) {
        CustomerEntity customer = CustomerMapping.convToEntity(customerDto);
        customer = customerRepo.save(customer);
        return CustomerMapping.convToDto(customer);
    }

    //GET /customers
    public List<CustomerDto> getAllCustomers() {
        return CustomerMapping.listDto(customerRepo.findAll());
    }
}
