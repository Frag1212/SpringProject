package com.sp;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	Car(Engine engine)
	{
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
}
