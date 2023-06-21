package it.unicam.cs.ids.loyaltyplatform.controller;

import it.unicam.cs.ids.loyaltyplatform.service.CustomerService;
import it.unicam.cs.ids.loyaltyplatform.entity.users.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value = "/addCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        this.customerService.addCustomer(customer);
    }

    @DeleteMapping(value = "/deleteCustomerById")
    public void deleteCustomerById(@PathVariable("id") Integer id) {
        this.customerService.deleteCustomerById(id);
    }

    @PutMapping(value = "/updateCustomer")
    public void updateCustomer(@RequestBody Customer customer) {
        this.customerService.updateCustomer(customer);
    }

    @GetMapping(value = "/getCustomerById")
    public Customer getCustomerById(@PathVariable("id") Integer id) {
        return this.customerService.getCustomerById(id);
    }

    @GetMapping(value = "/getAllCustomer")
    public List<Customer> getAllAgencies() {
        return this.customerService.getAllCustomers();
    }

}
