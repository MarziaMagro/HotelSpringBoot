package com.example.hotel.Service;

import com.example.customer.model.CustomerDto;
import com.example.hotel.Entity.CustomerEntity;
import com.example.hotel.Mapper.CustomerMapping;
import com.example.hotel.Repository.CustomerRepository;
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
