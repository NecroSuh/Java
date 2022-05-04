package unit;

public class UnitConverter {

	public static void main(String[] args) {
		// Unit.from = "cm";
		// Unit.to = "m";
		// Unit unit = new Unit();
		Unit unit = Unit.getInstance("cm", "m");
		double value = unit.convert(300);
		System.out.println(value);

		Unit unit2 = Unit.getInstance("cm", "inch");
		value = unit.convert(20);
		System.out.println(value);
	}

}
