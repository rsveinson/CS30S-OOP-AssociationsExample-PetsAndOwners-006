import java.util.ArrayList;

/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: OOPCat and Owner association example
 *
 * Description: owner class
 ***********************************************************************/

// import libraries as needed here

public class Owner {
    //*** Class Variables ***
    final static String nl = System.lineSeparator();
    
    //*** Instance Variables ***
    private String name;
    
    // association field
    ArrayList<Cat> cats;         // don't allocate the array list here
    
    //*** Constructors ***
    
    public Owner(){
        name = "unkown";
        cats = new ArrayList<Cat>();
    }// end no-arg
    
    public Owner(String n){
        name = n;
        cats = new ArrayList<Cat>();
    }// end full-arg
        
    //*** Getters ***
    
    public String getName(){
        return name;
    }// end get name
    
    public ArrayList<Cat> getCats(){
        return cats;
    }// end getCats
    
    //*** Setters ***
    
    public void setName(String n){
        this.name = n;
    }// end set name
    
    /* this one isn't used too much
     * you need to be careful because it 
     * will replace the current list
     * of cats with a new one if you're
     * not alert
     */
    public void setCats(ArrayList<Cat> cats){
        this.cats = cats;
    }// end setCats
    
    // ** utility methods
    
    public void addCat(Cat c){
        cats.add(c);
        
        // there's another way to take care of
        // of setting the associations between
        // cats and their owners
        //45c.setOwner(this);
    }// end add cat
    
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append(this.name + ":" + nl);
        st.append("Cats:");
        
        if(cats.size() == 0){
            st.append("no cats" + nl);
        }// end no cats
        
        for(Cat c : cats){
            st.append(c.getName() + ": ");
        }// end cats
        st.append(nl + "------------------------" + nl + nl);
        
        // potential hazards
        //String str = "Cats: " + cats;

        return st.toString();
    }
    
} // end of public class

    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
