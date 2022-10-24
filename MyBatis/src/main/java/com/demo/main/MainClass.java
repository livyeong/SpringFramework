package com.demo.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.JdbcBean;
import com.demo.config.BeanConfigClass;
import com.demo.mapper.MapperInterface;

public class MainClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);

		/*
		 * JdbcBean bean2 = new JdbcBean(); bean2.setInt_data(100);
		 * bean2.setStr_data("문자열200");
		 * 
		 * mapper.insert_data(bean2);
		 
		
		
		JdbcBean bean3 = new JdbcBean();
		bean3.setInt_data(100);
		bean3.setStr_data("문자열3");
		
		mapper.update_data(bean3);
		*/
		
		mapper.delete_data(100);
		
		List<JdbcBean> list = mapper.select_data();
		
		for(JdbcBean bean1 : list) {
			System.out.printf("int_data : %d\n", bean1.getInt_data());
			System.out.printf("str_data : %s\n", bean1.getStr_data());
			System.out.println("--------------------------------------");
		}
		
		
		ctx.close();
	}
}
