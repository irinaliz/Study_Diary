package com.irinaliz.study_diary.b06_jun.day9;
class Person2{
	int age;
	public String name;
	protected int height;
	private int weight;
	
}
public class Student_Main extends Person2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student leebomin = new Student();
		leebomin.setAge(25);
		leebomin.setName("이보민");
		leebomin.setHeight(172);
		leebomin.setWeight(85);
		
		System.out.println(leebomin.getAge());
		System.out.println("test1");
		
		
	}
	public void dataset() {
		age = 1;
		name = "qq";
		height = 170;
//		weight = 12;
	}

}
