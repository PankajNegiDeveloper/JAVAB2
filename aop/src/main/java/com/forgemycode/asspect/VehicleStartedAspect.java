package com.forgemycode.asspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class VehicleStartedAspect {

	@Before("execution(* com.forgemycode.service.*.*)&&args(vehicleStarted,...)")
	public void isVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {

		if (!vehicleStarted) {
			throw new RuntimeException("Vehicle not started");
		}
	}
}
