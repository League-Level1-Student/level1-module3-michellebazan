

public class Athlete {

     static int nextBibNumber;
     static String raceLocation = "New Yorkk";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
}

public static void main(String[] args) {
    //create two athletes     
	Athlete jo = new Athlete("Jo", 2);
	Athlete mo = new Athlete("Mo", 3);
	///check ----https://level1.jointheleague.org/Mod3Recipes/RunningRace.html
	jo.bibNumber = 1;
	mo.bibNumber = 2;
	//print their names, bibNumbers, and the location of their race. 
	
	System.out.println(raceLocation);
	System.out.println(raceStartTime);
	
	System.out.println(mo.name);
	System.out.println(mo.name + "'s bibnumber is " + mo.bibNumber);
	
	System.out.println(jo.name);
	System.out.println(jo.name + "'s bibnumber is " + jo.bibNumber);
	}
}
