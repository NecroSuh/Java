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
				dcars.add(car); // gasoline ���� false�� Car ��ü�� ����Ʈ�� �߰��ϱ�
		return dcars;
	}

	public static void print(List<Car> cars, CarConsumer cc) {
		for (Car car : cars)
			cc.accept(car);
	}

	public static void main(String[] args) {
		// ���ٽ����� �͸�Ŭ���� ����
		// CarPredicate diesel = (c) -> !c.isGasoline(); 
		Predicate<Car> diesel = (c) -> !c.isGasoline(); // test �߻�޼ҵ� �����ؼ� ��ü������ �ϰ� diesel�� �ּ� ����.
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
