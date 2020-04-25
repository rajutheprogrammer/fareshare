
/**
 * Write a description of class FareShare here.
 *
 * @author (Rajesh Chandra)
 * @version (.02 )
 */
import java.util.Scanner;
public class FareShare
{
    public static void main(String[] args) {
    Scanner myObj1 = new Scanner(System.in);
    Scanner myObj2 = new Scanner(System.in);

    System.out.println("Enter Name,Expance of  first Roommate:");
    String firstr=myObj1.nextLine(); 
    float firsta=myObj1.nextFloat();
    
    System.out.println("Enter Name,Expance of  second Roommate:");
    String secondr=myObj2.nextLine(); 
    float  seconda=myObj2.nextFloat();
     

    

    // Numerical input
    float amount =firsta+seconda;
    

    // Output input by user
    
    System.out.println("Amount: " + amount); 
    
    float ex_per_head=expencePerHead(amount);
    float duea=ex_per_head-firsta;
    float dueb=ex_per_head-seconda;
    
    
    System.out.println("roommates have to pay: " + ex_per_head+"per head"); 
    if(duea<0)
    {
    System.out.println(firstr+" will receive: " + Math.abs(duea));
    System.out.println(secondr+" ows: " + Math.abs(dueb));
    }
    else
    {
    System.out.println(secondr+"will receive: " + Math.abs(dueb));
    System.out.println(firstr+" ows: " + Math.abs(duea));
    }
    
    
    
  }
  

    
    public static float expencePerHead(float a)
    {
        // put your code here
        return a/2;
    }
}
