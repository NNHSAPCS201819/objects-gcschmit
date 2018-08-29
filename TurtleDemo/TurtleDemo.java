import java.awt.Color;

public class TurtleDemo
{
    public static void makeAwesomeTurtlePattern()
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);
        crush.turnLeft();
        crush.forward(50);
    }
    
    public static void chapter2Notes()
    {
        /*
         * Objects are entities in a program.
         *      Objects have properties (attributes).
         *      Objects are manipulated by invoking methods.
         *  
         *  ocean and crush reference objects
         *  
         *  Classes describe a collection of objects.
         *      All objects of a class have the same behavior (methods).
         *          and they have the same types of properties
         *          (but may have different values).
         *  
         *  World and Turtle are classes.
         */
        World ocean = new World();
        
        /*
         * We use the new operator to construct (create, instantiate)
         *      an object.
         *  The class of the object is specified immediately after
         *      the new operator (e.g., Turtle).
         *  If we have to pass additional information to create the object,
         *      arguments are specified in parentheses after the class
         *      (e.g., ocean).
         *  A reference to the newly created object is returned by the
         *      new operator.
         */
        Turtle crush = new Turtle(ocean);
        
        /*
         * Variables store values to be used later.
         *      Variables have a type (e.g., int), a name (e.g., width),
         *          and a value (e.g., 20).
         */
        int width;      // declaring a variable
        width = 20;     // assigning a variable
        
        /*
         * Java has several primitive data types:
         *      boolean holds a value of true or false
         *      int holds an integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double taxRate = 0.075;
        
        // here is char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator to invoke a
         *      method on an object.
         *  Some methods take no arguments, but we still have parentheses
         *      (e.g., penDown).
         *  Some methods take one or more arugments (e.g., foward).
         *  
         *  Mutator methods modify the state (i.e., properties) of the
         *      object. penDown, forward, setPenColor are all mutator
         *      methods.
         */
        crush.penDown();
        crush.forward(50);
        crush.setPenColor( Color.RED );
        
        /*
         * Accessor methods return a property of the object.
         *  The state of the object does not change.
         *  
         *  getPenWidth is an accessor method.
         */
        int penWidth = crush.getPenWidth();
        
    }
}
