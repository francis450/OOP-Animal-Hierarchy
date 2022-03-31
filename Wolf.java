public class Wolf extends Canine{

	public void makeNoise(){
		System.out.println("I'm a woooolf!!");
	}

	public void eat(){
		if(getHunger() > 5){
			System.out.println("Can I get some hare-meat");
		}else{
			System.out.println("I think I will pass!!");
		}
	}

	public void sleep(){
		System.out.println("I sleep on a Tree!");
	}
}