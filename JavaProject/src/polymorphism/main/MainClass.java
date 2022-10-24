package polymorphism.main;


import polymorphism.beans.HelloWorld;
import polymorphism.beans.HelloWorldEn;
import polymorphism.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello1 = new HelloWorldKo();
		callMathod(hello1);
		
		HelloWorld hello2 = new HelloWorldEn();
		callMathod(hello2);

	}
	public static void callMathod(HelloWorld hello) {
		hello.sayHello();
	}

}
