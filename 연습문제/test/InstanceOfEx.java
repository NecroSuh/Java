package test;

class P {
}

class S extends P {
}

class R extends P {
}

class Pr extends R {
}

public class InstanceOfEx {
	static void print(P p) {
		if (p instanceof P)
			System.out.print("Person ");
		if (p instanceof S)
			System.out.print("Student ");
		if (p instanceof R)
			System.out.print("Researcher ");
		if (p instanceof Pr)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Studnet() ->\t");
		print(new S());
		System.out.print("new Researcher() ->\t");
		print(new R());
		System.out.print("new Professor() ->\t");
		print(new Pr());
	}
}
