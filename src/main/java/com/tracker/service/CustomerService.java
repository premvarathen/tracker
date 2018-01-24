package com.tracker.service;

import java.util.List;

import com.tracker.domain.Customer;

public interface CustomerService {
	void insert(Customer cus);
	void insertBatch(List<Customer> customers);
	void loadAllCustomer();
	Customer getCustomerById(long CUSTID);
	void getCustomerNameById(long CUSTID);
	Integer getTotalNumerCustomer();
}
