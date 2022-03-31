public class Cat extends Feline{
	//Override abstract parent methods
	public void sleep(){
		System.out.println("I sleep in the couch!");
	}

	public void eat(){
		if(getHunger() > 5){
			System.out.println("May I have some milk Please!");
		}else{
			System.out.println("Oh! Please I have had enough milk already!");
		}
	}

	public void makeNoise(){
		System.out.println("Meeeeeooooow!!!");
	}
}