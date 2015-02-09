// Git collaborative COP-2805 (Java II) project.

package mypkg;

/**
 * COP-2805 - Project 2: Using Git and GitHub
 * @author Wayne Pollock
 */
public class Main {

	public static void main(String[] args) {
		int counter = 0;

		// (1) Add your own output below that includes your name.
		// (2) Place "counter++;" command after your contribution, to keep count.
		// (3) Keep the last println statement at the very end.

		System.out.println( "Howdy!  My name is Wayne Pollock." );
		counter++;
                System.out.println( "This is 17. My name is Jair Garcia-Varela." );
		counter++;
		
		System.out.println("The Dead have Risen! My name is Chris Howard.");
		// Just added my name and a small sentence.
		counter++;
                
                System.out.println("Hope I did this right. -Jason Kerby");
                counter++;
                
                System.out.println("David Blocher here.");
                counter++;
		
		System.out.println( "Hello, mortals. This is Kish Moore." );
		counter++;
                
                //A convoluted way to add my name...
                    String[] myName = new String[5];
                    myName[0] = "My ";
                    myName[1] = "name ";
                    myName[2] = "is ";
                    myName[3] = "Corey ";
                    myName[4] = "Gunter!";          
                                
                    for (String myName1 : myName) {
                        System.out.print(myName1);
                    }
                    System.out.print("\n");
            
                counter++;
                //Ending of the convolution...  
                
                System.out.println( "Hello everyone - Chris Maxey" );
		counter++;
                
                System.out.println ("Hello. This is Liezyl Pintac. Yay!");
                counter++;
                        

		System.out.println( "Number of people who edited this file: "
				+ counter );
               
	}
}
