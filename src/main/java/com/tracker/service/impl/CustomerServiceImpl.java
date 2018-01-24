package com.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.dao.CustomerDao;
import com.tracker.domain.Customer;
import com.tracker.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired CustomerDao customerDao;
	
	@Override
	public void insert(Customer cus) {
		customerDao.insert(cus);
	}
	
	@Override
	public void insertBatch(List<Customer> customers) {
		customerDao.inserBatch(customers);
	}	
	
	public void loadAllCustomer(){
		List<Customer> listCust = customerDao.loadAllCustomer();
		for(Customer cus: listCust){
			System.out.println(cus.toString());
		}
	}

	@Override
	public Customer getCustomerById(long CUSTID) {
		Customer cust = customerDao.findCustomerById(CUSTID);
		System.out.println(cust);
		return cust;
	}

	@Override
	public void getCustomerNameById(long CUSTID) {
		String name = customerDao.findNameById(CUSTID);
		System.out.println("Customer's name = " + name);
	}

	@Override
	public Integer getTotalNumerCustomer() {
		int totalNumberCustomer = customerDao.getTotalNumberCustomer();
		System.out.println("Total Number Customer is: " + totalNumberCustomer);
		return totalNumberCustomer;
	}

}
