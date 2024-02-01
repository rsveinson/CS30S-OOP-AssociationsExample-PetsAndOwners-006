import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Associations example
 * 
 *  Description:    set up an oop project with cats and owners
 *                  set up the association between the classes
 * 
 *************************************************************/

public class CatAndOwnerDriver {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Cat and Owner Association");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Main Processing *****
        
        // cats
        Cat cat = new Cat();
        Cat otherCat = new Cat(2, "Mittens");
        
        //System.out.println(cat);
        //System.out.println(otherCat);
        
        // use the utility output method
        System.out.println("My Cat: " + cat.getHandle());
        
        // owners
        Owner me = new Owner("Bob Marley");
        Owner you = new Owner("Peter Tosh");
        //System.out.println(me);
        
        // associations
        /* these two lines are not longer
         * needed since we wil be
         * using the static method to set the
         * associations
         */
        // me.addCat(cat);
        // me.addCat(otherCat);
        
        adoptACat(cat, me);
        adoptACat(otherCat, me);
        adoptACat(new Cat(5, "Rincewind"), you);
        Cat anotherCat = new Cat(4, "Emerson");
        adoptACat(anotherCat, you);
        
        System.out.println(me);
        System.out.println(you);
        
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        
    } // end main 
    
    // add the setAssociation() static method
    public static void adoptACat(Cat c, Owner o){
        c.setOwner(o);
        o.addCat(c);
    }// end adoptACat

} // end FormatTemplate
