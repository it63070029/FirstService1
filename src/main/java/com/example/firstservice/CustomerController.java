package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<>();
        customers.add(new Customer("1010","John","Male",25));
        customers.add(new Customer("1018","Peter","Male",24));
        customers.add(new Customer("1019","Sara","Female",23));
        customers.add(new Customer("1110","Rose","Female",23));
        customers.add(new Customer("1001","John","Female",30));

    }
    @RequestMapping(value = "/customers",method = RequestMethod.GET)
    public List<Customer> getCustomers() {


        return customers;
    }
    @RequestMapping(value = "/customers/{ID}",method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable String ID){
        for (Customer item:customers) {
            if(item.getID().equals(ID)){
                return item;
            }
        }
        return null;

    }
    @GetMapping(value = "/customerByname/{n}")
    public Customer getCustomerByName(@PathVariable String n){
        for (Customer item:customers){
            if(item.getName().equals(n)){
                return item;
            }
        }
        return null;


    }
    @DeleteMapping(value = "/customerDelByid/{ID}")
    public boolean delCustomerByID(@PathVariable String ID){
        for (Customer item:customers) {
            if(item.getID().equals(ID)){
                customers.remove(item);
                return true;

            }


        }
        return false;

    }
    @DeleteMapping(value = "/customerDelByname/{n}")
    public boolean delCustomerByName(@PathVariable String n){
        for (Customer item:customers) {
            if(item.getName().equals(n)){
                customers.remove(item);
                return true;
            }

        }
        return false;

    }
     @RequestMapping(value = "/addCustomer",method = RequestMethod.POST)
    public boolean addCustomer(@RequestParam("ID") String ID, @RequestParam("name") String n,@RequestParam("sex") String s,@RequestParam("age") int a){
        customers.add(new Customer(ID,n,s,a));
        return true;


    }
    @RequestMapping(value = "/addCustomer1",method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("ID") String ID, @RequestParam("name") String n,@RequestParam("sex") String s,@RequestParam("age") int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
}
