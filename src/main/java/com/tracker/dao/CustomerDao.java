package com.tracker.dao;

import java.util.List;
import com.tracker.domain.Customer;

public interface CustomerDao {
	void insert(Customer cus);
	void inserBatch(List<Customer> customers);
	List<Customer> loadAllCustomer();
	Customer findCustomerById(long cust_id);
	String findNameById(long cust_id);
	int getTotalNumberCustomer();
}
