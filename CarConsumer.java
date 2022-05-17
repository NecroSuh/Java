package lambdacar;

@FunctionalInterface
public interface CarConsumer {
	void accept(Car car);
}
