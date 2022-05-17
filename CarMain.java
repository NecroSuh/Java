package lambdacar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*; // Predicate, Consumer, Supplier, Function, Operator

public class CarMain {
	private static List<Car> findCars(List<Car> cars, Predicate<Car> cp) {
		// private static List<Car> findCars(List<Car> cars, CarPredicate cp) {
		List<Car> dcars = new ArrayList<>();
		for (Car car : cars)
			if (cp.test(car))
				dcars.add(car); // gasoline 값이 false인 Car 객체를 리스트에 추가하기
		return dcars;
	}

	public static void print(List<Car> cars, CarConsumer cc) {
		for (Car car : cars)
			cc.accept(car);
	}

	public static void main(String[] args) {
		// 람다식으로 익명클래스 정의
		// CarPredicate diesel = (c) -> !c.isGasoline(); 
		Predicate<Car> diesel = (c) -> !c.isGasoline(); // test 추상메소드 구현해서 객체생성을 하고 diesel에 주소 저장.
		List<Car> dieselCars = findCars(Car.cars, diesel);
		print(dieselCars, c -> System.out.printf("%s : %d : %d\n", c.getModel(), c.getAge(), c.getMileage()));

		// CarPredicate old = c -> c.getAge() > 10;
		Predicate<Car> old = c -> c.getAge() > 10;
		List<Car> oldCars = findCars(Car.cars, old);
		CarConsumer consumer = c -> System.out.printf("%s : %d : %d\n", c.getModel(), c.getAge(), c.getMileage());
		print(oldCars, consumer);

		Supplier<Double> supp = () -> Math.random() * 100;
		System.out.println(supp.get());
	}
}
