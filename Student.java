package Collection1;

public class Student {
	private String name;
	private int age;
	private String std;
	private String fatherName;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Student(String name, int age, String std, String fatherName, boolean isMale) {
		
		this.name = name;
		this.age = age;
		this.std = std;
		this.fatherName = fatherName;
		this.isMale = isMale;
	}
	
	public String toString() {
		return "name=" + name + ", age=" + age + ", std=" + std + ", fatherName=" + fatherName + ", isMale="+ isMale;
	}

	
	
	

}
