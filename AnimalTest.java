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


	}
	
}