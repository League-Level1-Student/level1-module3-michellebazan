

public class Athlete {

     static int nextBibNumber=1;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;
      

     Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
     bibNumber = nextBibNumber;
}

public static void main(String[] args) {
    //create two athletes     
	Athlete jo = new Athlete("Jo", 2);
	Athlete mo = new Athlete("Mo", 4);
	
	
	//print their names, bibNumbers, and the location of their race. 
	
	System.out.println(raceLocation);
	System.out.println(raceStartTime);
	
	System.out.println(mo.name);
	System.out.println(mo.name + "'s bibnumber is " + nextBibNumber++);
	
	System.out.println(jo.name);
	System.out.println(jo.name + "'s bibnumber is " + nextBibNumber++);
	}
}
