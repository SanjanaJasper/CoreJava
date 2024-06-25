//Program to demonstrate Encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	private int serialNum;//Data Variables
	private String name;
	private int age;
	
	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
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

	void show()//Member Function
	{
		System.out.println("serialNum"+serialNum+"\t name"+name+"\t age"+age);
	}

}
