package com.dreamguard.domain;

import java.io.Serializable;

//实现serializable,二级缓存开启步骤3
public class User implements Serializable{
	private int id;
	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
