package com.example.demo.cmm.util;

public class Custom {
	private Integer age;
	private String color;
	private Integer healty;
	
	Custom(final int age, final String color) {
		this.age = age;
		this.color = color;
	}

	Custom(final Integer age, final String color, final Integer healty) {
		this.age = age;
		this.color = color;
		this.healty = healty;
	}
	
	public Custom() {
		
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(final Integer age) {
		this.age = age;
	}
	
	String getColor() {
		return color;
	}
	
	public void setColor(final String color) {
		this.color = color;
	}
	
	Integer getHealty() {
		return healty;
	}
	
	void setHealty(final Integer healty) {
		this.healty = healty;
	}
	
	public void turnOnPc() {
		System.out.println("Computer turned on");
	}
	
	public void turnOffPc() {
		System.out.println("Computer turned off");
	}
	
	public Double calculateValue(Double initialValue) {
		return initialValue / 1.50;
	}

	@Override
	public int hashCode() {
		int result = age != null ? age.hashCode() : 0;
		result = 31 * result + (color != null ? color.hashCode() : 0);
		return result;
 	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		final Custom custom = (Custom) o;
		
		return (age != null ? age.equals(custom.age) : custom.age == null ) &&
				(color != null ? color.equals(custom.color) : custom.color == null);
	}

	@Override
	public String toString() {
		return "Computer{" + "age=" + age + ", color=' " + color + '\''  
				+ ", healty=" + healty + '}';
	}
	
	
}


