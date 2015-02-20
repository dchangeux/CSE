////////////////////////////////////////////////////////////////////////////////
//lab05-Space Exploration 
//Danelia Changeux 
//CSE 002
//02/20/2015
//
//This Program will output a timeline of significant space exploiration advances from 2000-2010
//first compile the program 
//      javac SpaceExploration.java
//run the program 
//  java SpaceExploration//

// define a class
public class SpaceExploration{
    
//add main method required for every Java program 
public static void main( String[] args) {
    
    int year =((int)(Math.random()*11 +2000));
    System.out.println("Here is a timeline from Year 2000 to year "+ year);
    switch( year){
        case 2010:
            System.out.println("Year 2010: SpaceX successfully sends spacecraft to orbit and back");
        case 2009:
            System.out.println("Year 2009:N/A");
        case 2008: 
            System.out.println("Year 2008: Kepler launched to study deep space");
        case 2007: 
            System.out.println("Year 2007: N/A");
        case 2006:
            System.out.println("Year 2006: Spacecraft returns with collections from a comet");
        case 2005:
            System.out.println("Year 2005: Spacecraft collides with comet");
        case 2004:
            System.out.println("Year 2004: N/A");
        case 2003:
            System.out.println("Year 2003:Largest infrared telescope");
        case 2002:
            System.out.println("Year 2002:N/A");
        case 2001:
            System.out.println("Year 2001:First spacecraft lands on asteroid");
        case 2000:
            System.out.println("Year 2000:First spacecraft orbits an asteroid");
                
    }
    
}   
}
