package com.example.hotel.Controller;
import com.example.customer.api.CustomersApi;
import com.example.customer.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomersApi {


    @Override
    public ResponseEntity<CustomerDto> addCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return null;
    }
}
