package com.tracker.domain;

import java.io.Serializable;



public class Customer implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	private long id;
 
	private String name;
 
	private Integer age;
 
	public Customer() {
	}
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
 
	@Override
	public String toString() {
		return String.format("Customer[id=%d, name='%s', age='%s']", id, name, age);
	}
}
