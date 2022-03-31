public class AnimalTest{

	public static void main(String [] args){
		Hippo hippo1 = new Hippo();

		hippo1.setLocation("River Side");
		hippo1.setHunger(8);
		hippo1.setPicture(4);
		hippo1.setBoundaries("Savannah");

		System.out.println("My hunger Level is at "+hippo1.getHunger());
		System.out.println("I'm at "+hippo1.getLocation()+"\n");
		hippo1.makeNoise();
		hippo1.eat();

		System.out.println("\nLion object: ");
		//Test Lion class with Lion obejcts
		Lion lion1 = new Lion();

		lion1.setLocation("Savannah");
		lion1.setBoundaries("Reservation Fence");
		lion1.setPicture(7);
		lion1.setHunger(2);

		lion1.eat();
		lion1.roam();
		lion1.sleep();
		lion1.makeNoise();


		System.out.println("I'm at "+lion1.getLocation());
		System.out.println("My level of hunger is "+lion1.getHunger());
		System.out.println("I have "+lion1.getPicture()+" Pictures");
		System.out.println("I cant go through "+lion1.getBoundaries());


		System.out.println("\nTiger objects:");
		Tiger tiger1 = new Tiger();

		tiger1.setLocation("Jungle!");
		tiger1.setBoundaries("River");
		tiger1.setPicture(8);
		tiger1.setHunger(9);

		tiger1.eat();
		tiger1.roam();
		tiger1.sleep();
		tiger1.makeNoise();


		System.out.println("I'm at "+tiger1.getLocation());
		System.out.println("My level of hunger is "+tiger1.getHunger());
		System.out.println("I have "+tiger1.getPicture()+" Pictures");
		System.out.println("I cant go through "+tiger1.getBoundaries());


		System.out.println("\nCat objects:");
		Cat cat1 = new Cat();

		cat1.setLocation("Kitchen!");
		cat1.setBoundaries("the gate");
		cat1.setPicture(5);
		cat1.setHunger(5);

		cat1.eat();
		cat1.roam();
		cat1.sleep();
		cat1.makeNoise();


		System.out.println("I'm at "+cat1.getLocation());
		System.out.println("My level of hunger is "+cat1.getHunger());
		System.out.println("I have "+cat1.getPicture()+" Pictures");
		System.out.println("I can't go through "+cat1.getBoundaries());


		//Wolf Test
		System.out.println("\nWolf objects:");
		Wolf wolf1 = new Wolf();

		wolf1.setLocation("Surburbs!");
		wolf1.setBoundaries("Town");
		wolf1.setPicture(8);
		wolf1.setHunger(9);

		wolf1.eat();
		wolf1.roam();
		wolf1.sleep();
		wolf1.makeNoise();


		System.out.println("I'm at "+wolf1.getLocation());
		System.out.println("My level of hunger is "+wolf1.getHunger());
		System.out.println("I have "+wolf1.getPicture()+" Pictures");
		System.out.println("I cant go through "+wolf1.getBoundaries());

	}
	
}