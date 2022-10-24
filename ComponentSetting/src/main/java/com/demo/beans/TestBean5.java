package com.demo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//getBean 메서드를 호출할 때 마다 새로운 객체를 생성해 반환한다.
@Component
@Lazy
public class TestBean5 {

	public TestBean5() {
		System.out.println("TestBean5의 생성자");
	}

	@PostConstruct
	public void init() {
		System.out.println("init 메서드가 호출되었습니다.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy 메서드가 호출되었습니다.");
	}

}