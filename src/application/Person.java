package application;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private int toLoseWeight;
	private int toGainWeight;
	private String personsActivityLevel;
	private Date startingDate;
	private Date endingDate;

	public Person() {
	}

	public Person(String name, int age, int height, int weight, int toLoseWeight, int toGainWeight,
			String personsActivityLevel, Date startingDate, Date endingDate) {
		super();
			
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight= weight;
		this.toLoseWeight = toLoseWeight;
		this.toGainWeight = toGainWeight;
		this.personsActivityLevel = personsActivityLevel;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
	}

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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getToLoseWeight() {
		return toLoseWeight;
	}

	public void setToLoseWeight(int toLoseWeight) {
		this.toLoseWeight = toLoseWeight;
	}

	public int getToGainWeight() {
		return toGainWeight;
	}

	public void setToGainWeight(int toGainWeight) {
		this.toGainWeight = toGainWeight;
	}

	public String getPersonsActivityLevel() {
		return personsActivityLevel;
	}

	public void setPersonsActivityLevel(String personsActivityLevel) {
		this.personsActivityLevel = personsActivityLevel;
	}

	public Date getStartingDate() {
		return new Date(startingDate.getTime());
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = new Date(startingDate.getTime());
	}

	public Date getEndingDate() {
		return new Date(endingDate.getTime());
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = new Date(endingDate.getTime());
	}

}
