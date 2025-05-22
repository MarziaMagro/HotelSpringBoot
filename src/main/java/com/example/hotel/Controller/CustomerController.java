package com.example.hotel.Controller;

import com.example.customer.api.CustomersApi;
import com.example.customer.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController implements CustomersApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return CustomersApi.super.getRequest();
    }

    @Override
    public ResponseEntity<CustomerDto> addCustomer(CustomerDto customerDto) {
        return CustomersApi.super.addCustomer(customerDto);
    }

    @Override
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return CustomersApi.super.getAllCustomers();
    }
}
