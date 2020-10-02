package com.yunfeng.atguigu1.java8;

public interface MyInterface {
	
	default String getName(){
		return "呵呵呵";
	}
	
	static void show(){
		System.out.println("接口中的静态方法");
	}

}
