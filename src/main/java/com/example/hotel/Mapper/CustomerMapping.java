package com.example.hotel.Mapper;

public class CustomerMapping {

//    public static CustomerDto convToDto(Customer customer) {
//        CustomerDto customerDto = new CustomerDto();
//        customerDto.setId(customer.getId());
//        customerDto.setFirstName(customer.getName());
//        customerDto.setLastName(customer.getSurname());
//        customerDto.setEmail(customer.getEmail());
//        return customerDto;
//    }
//
//    public static Customer convToEntity(CustomerDto customerDto) {
//        Customer customer = new Customer();
//        customer.setId(customerDto.getId());
//        customer.setName(customerDto.getFirstName());
//        customer.setSurname(customerDto.getEmail());
//        return customer;
//    }
//
//    public static List<Customer> listEntity(List<CustomerDto> listDto) {
//        List<Customer> listEntity = new ArrayList<>();
//        for (CustomerDto customerDto : listDto) {
//            Customer customer = CustomerMapping.convToEntity(customerDto);
//            listEntity.add(customer);
//        }
//        return listEntity;
//    }
//
//    public static List<CustomerDto> listDto(List<Customer> listEntity) {
//        List<CustomerDto> listDto = new ArrayList<>();
//        for (Customer customer : listEntity) {
//            CustomerDto customerDto = CustomerMapping.convToDto(customer);
//            listDto.add(customerDto);
//        }
//        return listDto;
//    }
}
