package com.example.hotel.controller;
import hotel.api.CustomerApi;
import hotel.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomerApi {


    @Override
    public ResponseEntity<CustomerDto> addCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return null;
    }
}
