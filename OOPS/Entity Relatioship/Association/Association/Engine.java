public class Engine {
	private double cc;
	private int cylinderCount;
	private int hp;
	public Engine(double cc,int cylinderCount,int hp){
        this.cc=cc;
        this.cylinderCount=cylinderCount;
        this.hp=hp;
	}
	public double getCc(){
		return cc;
	}
	public int getCyclinderCount(){
		return cylinderCount;
	}
	public int getHp(){
		return hp;  
	}
	public void displayEngineInfo(){
		System.out.println("Display Engine Info");
		System.out.println("--------------------");
		System.out.println("CC: "+getCc());
		System.out.println("cylinderCount: "+getCyclinderCount());
		System.out.println("Hp: "+getHp());
	}
}