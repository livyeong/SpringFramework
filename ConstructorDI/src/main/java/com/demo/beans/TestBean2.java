package com.demo.beans;

public class TestBean2 {
	
	//클래스 DataBean타입
	private DataBean data1;
	private DataBean data2;
	
	public TestBean2( DataBean data1,  DataBean data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void printData() {
		//객체의 주소값이 출력됨
		System.out.printf("data : %s\n", data1);
		System.out.printf("data : %s\n", data2);
	}
}