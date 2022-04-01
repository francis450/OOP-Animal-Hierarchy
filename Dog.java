public class Dog extends Canine{
	//Override abstract parent methods(Animal and canine)
	public void sleep(){
		System.out.println("I sleep on a House!");
	}

	public void eat(){
		if(getHunger() > 5){
			System.out.println("May I have some Dog Food Please!");
		}else{
			System.out.println("Oh! Please I have had enough Dog-food already!");
		}
	}

	public void makeNoise(){
		System.out.println("Wooof!! Wooof!!");
	}
}