package com.tracker.rest.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.domain.Customer;
import com.tracker.service.CustomerService;

@RestController
@RequestMapping("/tracker")
public class RestTrackerController {
	 @RequestMapping("/users")
	public Customer getUser()
	{
		  return customerService.getCustomerById(1);
		//return Collections.singletonMap("prem", "Hello World");
	}


		@Autowired
		private CustomerService customerService;
	    private Map<Integer, Customer> custStores = new HashMap<Integer, Customer>();
	 
	    @PostConstruct
	    public void initIt() throws Exception {
	      /*  Customer cust1 = new Customer(1, "Jack", 20);
	        Customer cust2 = new Customer(2, "Peter", 25);
	 
	        custStores.put((int) cust1.getCustId(), cust1);
	        custStores.put((int) cust2.getCustId(), cust2);*/
	    }
	 
	    //@GetMapping("/get")
	    @RequestMapping("/customer")
	    public int getMethod(@RequestParam("custId") int custId) {
	        //return custStores.get(custId);
	        return customerService.getTotalNumerCustomer();
	    }
	 
	  /*  @PostMapping("/post")
	    public Customer postMethod(@RequestBody Customer customer) {
	        Random r = new Random();
	        customer.setCustId(r.nextInt());
	 
	        // POST processing
	        custStores.put((int) customer.getCustId(), customer);
	 
	        // Log out custStores after POST
	        System.out.println("Customer Stores after POST:");
	        custStores.forEach((id, cust) -> System.out.println(cust.toString()));
	 
	        return customer;
	    }
	 
	    @PutMapping("/put/{custId}")
	    public Customer putMethod(@PathVariable int custId, @RequestBody Customer customer) {
	        // PUT processing
	        try{
	            custStores.remove(custId);
	            customer.setCustId(custId);
	            custStores.put(custId, customer);
	        }catch(Exception e){
	            System.out.println(e.getStackTrace());
	            return null;
	        }
	 
	        // Log out custStores after PUT
	        System.out.println("Customer Stores after PUT");
	        custStores.forEach((id, cust) -> System.out.println(cust.toString()));
	 
	        return customer;
	    }
	 
	    @DeleteMapping("/delete/{custId}")
	    public String deleteMethod(@PathVariable int custId) {
	        try {
	            // DELETE processing
	            custStores.remove(custId);
	        } catch (Exception e) {
	            return "Error";
	        }
	 
	        // Log out custStores after DELETE
	        System.out.println("Customer Stores after DELETE");
	        custStores.forEach((id, cust) -> System.out.println(cust.toString()));
	 
	        return "Done";
	    }
*/
}
