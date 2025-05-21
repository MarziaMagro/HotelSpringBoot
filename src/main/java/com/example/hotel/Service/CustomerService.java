package com.example.hotel.Service;

import com.example.hotel.Entity.Customer;
import com.example.hotel.Mapper.CustomerMapping;
import com.example.hotel.Repository.CustomerRepository;
import com.example.hotel.model.CustomerDto;
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

    //TODO: POST /customer
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapping.convToEntity(customerDto);
        customer = customerRepo.save(customer);
        return CustomerMapping.convToDto(customer);
    }

    //TODO: GET /customers
    public List<CustomerDto> getAllCustomers() {
        return CustomerMapping.listDto(customerRepo.findAll());
    }
}
