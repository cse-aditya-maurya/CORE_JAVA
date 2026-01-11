class Car {
	private String brand;
	private String color;
	private String make;
	private double price;

	public Car(String brand,String make,double price,String color){
		this.brand=brand;
		this.make=make;
		this.price=price;
		this.color=color;
	}
	// Car HAS-A Engine
	Engine engine=new Engine(500,4,1000);
	// Car HAS-A MediaPlayer
	MediaPlayer mediaPlayer; 

	public String getBrand(){
		return brand;
	}

	public double getPrice(){
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getMake(){
		return make;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
     this.color=color;
	}
	public Engine getEngine(){
		return engine;
	}
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}
	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}



	 public void displayCarInfo(){
	 	System.out.println("Display Car Info");
	 	System.out.println("----------------");
	 	System.out.println("Brand: "+getBrand());
	 	System.out.println("Price: "+getPrice());
	 	System.out.println("Make: "+getMake());
	 	System.out.println("Color: "+getColor());
	 	System.out.println();
	 }
	
}