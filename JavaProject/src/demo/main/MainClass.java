package demo.main;

import demo.beans.HelloWorldEn;
import demo.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorldKo hello1 = new HelloWorldKo();
		callMathod(hello1);

	}
	public static void callMathod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
