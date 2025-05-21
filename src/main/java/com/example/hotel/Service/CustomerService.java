package com.example.hotel.Service;

import com.example.hotel.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }
//
//    //POST /customer
//    public CustomerDto createCustomer(CustomerDto customerDto) {
//        Customer customer = CustomerMapping.convToEntity(customerDto);
//        customer = customerRepo.save(customer);
//        return CustomerMapping.convToDto(customer);
//    }
//
//    //GET /customers
//    public List<CustomerDto> getAllCustomers() {
//        return CustomerMapping.listDto(customerRepo.findAll());
//    }
}
