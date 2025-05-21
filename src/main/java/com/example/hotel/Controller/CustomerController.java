package com.example.hotel.Controller;

import com.example.hotel.Service.CustomerService;
import com.example.hotel.api.CustomersApi;
import com.example.hotel.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomersApi {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @Override
    public ResponseEntity<List<CustomerDto>> customersGet() {
        List<CustomerDto> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }


}
