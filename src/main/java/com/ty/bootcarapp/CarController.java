package com.ty.bootcarapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@PostMapping("/savecar")
	public Car saveCar() {
		Car car= new Car();
		car.setId(2);
		car.setBrand("Tayota");
		car.setCost(900000);
		return car;
	}
	
	@GetMapping("/getallcar")
	public List<Car> getAllCars(){
		List<Car> cars = new ArrayList<Car>();
		Car car = new Car();
		car.setId(101);
		car.setBrand("Suzuki");
		car.setCost(500000);
		
		Car car2 = new Car();
		car2.setId(102);
		car2.setBrand("Kia");
		car2.setId(1000000);
		
		Car car3 = new Car();
		car3.setId(103);
		car3.setBrand("Ford");
		car3.setCost(4600000);
		
		cars.add(car);
		cars.add(car2);
		cars.add(car3);
		return cars;
	}
	
	@GetMapping("/carbyid/{id}")
	public String getCarId(@PathVariable Car car) {
		return car.getBrand();
	}
	
	
}
