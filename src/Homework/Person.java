package Homework;

public class Person {
	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Person() {
		super();
	}

	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n전화: " + hp + "\n회사: " + company ;
	}
	
	public void showInfo() {
		
	}
}

// 메소드 일반


