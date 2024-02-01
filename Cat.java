/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: OOPCat and Owner association example
 *
 * Description: Cat class 
 ***********************************************************************/

// import libraries as needed here

public class Cat {
    //*** Class Variables ***
    final static String nl = System.lineSeparator();
    private static int nextID = 1000;

    //*** Instance Variables ***

    private int age;
    private String name;
    private int id;

    // association instance fields
    Owner owner;        // the owner of the cat

    //*** Constructors ***

    public Cat(){
        age = 0;
        name = "Unknown";
        id = getNextId();
    }// end no-arg constructor

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
        id = getNextId();
    }// end full-arg constructor

    //*** Getters ***

    public int getAge(){
        return this.age;
    }// end getAge

    public String getName(){
        return this.name;
    }// end getname

    public int getId(){
        return this.id;
    }//end get id

    public Owner getOwner(){
        return owner;
    }// end get owner

    //*** Setters ***

    public void setAge(int a){
        this.age = a;
    }// end setAge

    public void setName(String n){
        this.name = n;
    }//end set name

    // set the association
    public void setOwner(Owner o){
        this.owner = o;
        //o.addCat(this);     // add this cat to the owner's list
    }// end setOwner

    // *** utilty methods ***
    public String getHandle(){
        return this.getName() + " " + this.getAge();
        
    }

    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        //String st = this.name + ": " + this.age + " years.";
        st.append("Name: " + this.name + nl);
        st.append("Age: " + this.age + nl);
        st.append("Owner: ");
        st.append(this.owner == null ? "No owner" : this.owner);
        st.append(nl + "------------------" + nl + nl);
        
        // hazard code
        //String str = this.owner.toString();
        
        return st.toString();
    }// end tostring

    private int getNextId(){
        return nextID++;
    }// end next id

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


