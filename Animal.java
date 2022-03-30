public abstract class Animal{
	//Local Variables
	private int picture;
	private int hunger;
	private String boundaries;
	private String location;


	//Local Methods
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void sleep();
	public abstract void roam();

	//Setters
	public void setPicture(int pic){
		picture = pic;
	}


	public void setHunger(int anger){
		hunger = anger;
	}


	public void setBoundaries(String boundary){
		boundaries = boundary;
	}

	public void setLocation(String locale){
		location = locale;
	}

	//Getters
	public int getPicture(){
		return picture;
	}

	public int getHunger(){
		return hunger;
	}

	public String getBoundaries(){
		return boundaries;
	}

	public String getLocation(){
		return location;
	}
}