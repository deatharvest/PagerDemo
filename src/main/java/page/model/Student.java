package page.model;

import java.io.Serializable;
import java.util.Map;

public class Student implements Serializable {

	private static final long serialVersionUID = -7476381137287496245L;
	
	private int id; //学生记录id
	
	private String stuName;//学生姓名
	
	private int age; //学生年龄
	
	private int gender; //学生性别
	
	private String address;//学生住址
	
	public Student() {
		super();
	}

	public Student(int id, String stuName, int age, int gender, String address) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	public Student(Map<String, Object> map){
		this.id = (int)((Student)map.get("id")).getId();
		this.stuName = (String)((Student)map.get("stu_name")).getStuName();
		this.age = (int)((Student)map.get("age")).getAge();
		this.gender = (int)((Student)map.get("gender")).getGender();
		this.address = (String)((Student)map.get("address")).getAddress();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	
}
