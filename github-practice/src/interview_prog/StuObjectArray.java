package interview_prog;

public class StuObjectArray {
	String name;
	int id;
	public StuObjectArray(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "student name:"+this.name+" "+"student id:"+this.id;
		}
	public static void main(String[] args) {
        StuObjectArray stu[]= {new StuObjectArray("chinni",1),new StuObjectArray("prani", 2)};
        for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}

}
