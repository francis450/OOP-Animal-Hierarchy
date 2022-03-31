public class Lion extends Feline{
	
	//Override abstract parent methods
	public void sleep(){
		System.out.println("I sleep in a cave!");
	}

	public void eat(){
		if(getHunger() > 5){
			System.out.println("May I have some Gazzele Please!");
		}else{
			System.out.println("Oh! Please I have had enough meat already!");
		}
	}

	public void makeNoise(){
		System.out.println("Roooaaaar!!!");
	}

}