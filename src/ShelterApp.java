
public class ShelterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat fluffy = new Cat("Fluffy","grey","persian",4,5);
		
		
		
		
		
		Cat whiskers = new Cat("Whiskers","mixed","sphinx",3,3);
		System.out.println("My cats' name are " + fluffy.getName() 
		+" and " + whiskers.getName()+".");
		System.out.println(fluffy.getName()+ " is "+fluffy.getAge()+ " years old.");
		fluffy.ageByOneYear();
		System.out.println(fluffy.getName()+ " is "+fluffy.getAge()+ " years old.");
		//System.out.println("My second cat's name is: " + whiskers.getName() );
	}

}
