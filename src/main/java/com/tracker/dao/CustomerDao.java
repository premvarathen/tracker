package com.tracker.dao;

import java.util.List;
import com.tracker.domain.Customer;

public interface CustomerDao {
	void insert(Customer cus);
	void inserBatch(List<Customer> customers);
	List<Customer> loadAllCustomer();
	Customer findCustomerById(long CUSTID);
	String findNameById(long CUSTID);
	int getTotalNumberCustomer();
}
