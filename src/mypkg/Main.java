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
                
                System.out.println("Hello Advanced Java! -John Silvey");
                counter++;
                
                System.out.println("Hi everybody, Alexis Herrera here!");
                counter++;
                
                System.out.println("Greetings!! From Alex Peterson");
                counter++;
                //This looks about right.
                System.out.println(	 "He"                +"llo everyo"
                +"n"  		+"e -"   +" "               +"J"         //
                +"a"		+"mie"   +" "              +"B"      
                +"a" 		+"na"    +"s"              );//
                //back left corner	 back		  left
                //ba		ck le	 ft c		  orne 
                //ba		ck lef	 t co		  rner
                //ba		ck left	 corn              er. 		b
                //ba		ck lef	 t corner. back     left       cor
                counter++;//back l	 eft corner. ba      ck left corn	
                
                //Displays output
                System.out.println("Yippy ki yay motha... er... um... "
                            + "my friends? lol sup (^_^) -Haven Brewer");
                //adds one to counter
                counter++;
                
                /*W.T.- Had trouble getting project to run. Eclipse stated a classpath error for java.lang.Object
                 * Fixed with Project->Properties ->Java Build Path ->Order and Export -> make sure all options are checked.
                 */
                 System.out.println("I am wonding who else had errors - William Thompson");
                 counter++;
                 
                System.out.println("Hi my name is Jordan Hart");
                counter++;
                
                System.out.println( "Hello, this is Steven from Java 2 YAY!!!." );
		counter++;
		
		System.out.println("Brannon Centeno trying to figure this out!!!!");
		counter++;         
                
		System.out.println( "Number of people who edited this file: "
				+ counter );
                  
	}
}
