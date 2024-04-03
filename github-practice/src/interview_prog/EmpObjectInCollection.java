package interview_prog;

import java.util.ArrayList;

public class EmpObjectInCollection {
	String name;
	int id;
	double sal;

    public EmpObjectInCollection(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new EmpObjectInCollection("chinni",1,20000));
		a.add(new EmpObjectInCollection("prani",2,30000));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
