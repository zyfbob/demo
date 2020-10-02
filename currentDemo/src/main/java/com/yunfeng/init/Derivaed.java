package com.yunfeng.init;

public class Derivaed extends Base {
	private String name = "derivaed";
	public Derivaed() {
		System.out.println("子类无参构造方法");
		tellName();
		printName();
		otherMethod();
	}
	private void otherMethod() {
		System.out.println("子类other方法");
		
	}
	
	@Override
	public void tellName() {
		System.out.println("Derivaed tell name:"+ name);
	}
	@Override
	public void printName() {
		System.out.println("Derivaed print name:"+ name);
	}
	
	
	public static void main(String[] args) {
		new Derivaed();

	}
}

abstract class Base{
	protected String name = "base";
	public Base() {
		System.out.println("父类无参构造方法");
		tellName();
		printName();
		otherMethod();
	}
	private void otherMethod() {
		System.out.println("父类other方法");
	}
	public abstract void tellName();
	public void printName() {
		System.out.println("Base print name:" + name);
	}
}