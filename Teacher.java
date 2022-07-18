package day03;

public class Teacher extends Person {
	private String teacherID;
	private int monthSalary;
	private int WorkdedYear;

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public int getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	public int getWorkdedYear() {
		return WorkdedYear;
	}

	public void setWorkdedYear(int WorkdedYear) {
		this.WorkdedYear = WorkdedYear;
	}

	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int WorkdedYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.WorkdedYear = WorkdedYear;
	}

	public void show() {
		System.out.println("------------------------------");
		System.out.println("���� �̸�: " + getName());
		System.out.println("���� ����: " + getAge());
		System.out.println("���� Ű: " + getHeight());
		System.out.println("���� ������: " + getWeight());
		System.out.println("���� ��ȣ: " + getTeacherID());
		System.out.println("���� ����: " + getMonthSalary());
		System.out.println("���� ����: " + getWorkdedYear());
	}

}
