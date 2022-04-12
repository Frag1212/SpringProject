package com.sp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("start");
		var context = new AnnotationConfigApplicationContext(SpringConfigClass.class);
		Car car = context.getBean(Car.class);
		//Car car = (Car)context.getBean("car");
		System.out.println(car.getEngine());
		context.close();
	}

}
