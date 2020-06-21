//Multiple Inheritance is a feature of object oriented concept, 
//where a class can inherit properties of more than one parent class. 

interface Vehicle
{ 

    default void show() 
    { 
        System.out.println("The Vehicle is Honda Accord"); 
    }

    void registered();
} 
  
interface Driver 
{ 
    default void show() 
    { 
        System.out.println("The Driver is Micheal Schumascher"); 
    }
    void licensed();
} 
   
class Drive implements Vehicle, Driver
{ 
    public void show() 
    { 
        Vehicle.super.show(); 

        Driver.super.show(); 
    }

    public void registered()
    {
    	System.out.println("This is a registered Vehicle under VehicleRegistrationAct 1887");
    } 

    public void licensed()
    {
    	System.out.println("This is a Licensed Driver under LegalDriverAct 1887");
    }
}

public class Que4
{
    public static void main(String args[]) 
    { 
        Drive d = new Drive(); 
        d.show(); 
        d.registered();
        d.licensed();
    } 
} 