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
        
        System.out.println(cat);
        
        // owners
        Owner me = new Owner("Bob Marley");
        Owner you = new Owner("Peter Tosh");
        System.out.println(me);
        
        // associations
        me.addCat(cat);
        me.addCat(otherCat);
        
        System.out.println(me);
        
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
