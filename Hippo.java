public class Hippo extends Animal{

	//Hippos Local Methods
	//A hippos Noise
	public void makeNoise(){
		System.out.println("I am a Hippooooooooo!!!!!!");
	}

	//Hippos food
	public void eat(){
		if(getHunger() >= 7){
			int hun = getHunger();
			hun--;
			System.out.println("Lemme get myself some grass");
		}else{
			System.out.println("I am full!!");
		}
	}

	//Where a Hippo sleeps
	public void sleep(){
		System.out.println("Ffffh! Ffffh!");
	}

	//How Does a Hippo roam
	public  void roam(){
		System.out.println("I am roaming at the "+getLocation());
	}
}