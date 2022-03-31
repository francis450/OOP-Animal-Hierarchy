public class AnimalTest{

	public static void main(String [] args){
		Hippo hippo1 = new Hippo();

		hippo1.setLocation("River Side");
		hippo1.setHunger(8);
		hippo1.setPicture(4);
		hippo1.setBoundaries("Savannah");

		System.out.println(hippo1.getHunger());
		hippo1.makeNoise();
		hippo1.eat();
		//System.out.println(hippo1.makeNoise());
	}
	
}