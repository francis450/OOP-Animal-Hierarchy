public class Tiger extends Feline{

	//Override abstract parent methods(Animal and Feline)
	public void sleep(){
		System.out.println("I sleep on a tree!");
	}

	public void eat(){
		if(getHunger() > 5){
			System.out.println("May I have some Antelope Please!");
		}else{
			System.out.println("Oh! Please I have had enough meat already!");
		}
	}

	public void makeNoise(){
		System.out.println("Wuuuuuuh!!!");
	}
}