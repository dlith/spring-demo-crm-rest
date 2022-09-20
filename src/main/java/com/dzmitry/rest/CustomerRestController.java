package com.dzmitry.rest;

import com.dzmitry.entity.Customer;
import com.dzmitry.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> customers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer customer(@PathVariable int customerId){
        return customerService.getCustomer(customerId);
    }
}
