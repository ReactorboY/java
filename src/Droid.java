public class Droid {
	int batteryLevel;
//		Droid thatcan charge, hover and land
			
//	Constructor
	public Droid(){
		batteryLevel = 100;
	}
	
//	method
	public void activate(){
		System.out.println("Activated.How Can I help you?");
		batteryLevel = batteryLevel - 5;
		System.out.println("Battery level is " + batteryLevel + " percent");
	}
	
//	charge method
	public void charge(int hours){
		System.out.println("Droid is charging...");
		batteryLevel = batteryLevel + hours;
		if (batteryLevel > 100){
			batteryLevel = 100;
			System.out.println("Battery Level is " + batteryLevel + " percent");
		} else {
			System.out.println("Battery Level is " + batteryLevel + " percent");
		}
	}
	
//	 check battery level method
	public int checkBatteryLevel(){
		System.out.println("Battery level is " + batteryLevel + " percent");
		return batteryLevel;
	}
	
//	 hover method 
	public void hover(int feet){
		if (feet > 2) {
			System.out.println("Cannot hover above 2feet from ground");
		} else {
			System.out.println("Hovering....");
			batteryLevel = batteryLevel - 20;
			System.out.println("Battery Level is " + batteryLevel + " percent");
		}
	}
	
//	 main method
	public static void main(String[] args){
		Droid droid = new Droid();
		droid.activate();
		droid.charge(5);
		droid.hover(2);
	}
}