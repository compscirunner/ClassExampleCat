
public class Cat {
	
	private int numOfLives;
	private String name;
	private String color;
	private String breed;
	private int numOfLegs;
	private int age;
	
	public Cat(String name, String color, String breed, int numOfLegs, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.numOfLegs = numOfLegs;
		this.age = age;
		this.numOfLives = 9;
	}
	
	public void talk() {
		System.out.println("Meow Meow");
		
	}

	public int getNumOfLives() {
		return numOfLives;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getBreed() {
		return breed;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public int getAge() {
		return age;
	}
	public void ageByOneYear() {
		age++;
	}
	
}
