
/**
 * Write a description of class FareShare here.
 *
 * @author (Rajesh Chandra)
 * @version (a )
 */
import java.util.Scanner;
public class FareShare
{
    public static void main(String[] args) {
    Scanner myObj1 = new Scanner(System.in);
    Scanner myObj2 = new Scanner(System.in);

    System.out.println("Enter Name,Amount of  first Roommate:");
    String firstr=myObj1.nextLine(); 
    int firsta=myObj1.nextInt();
    int n=1;
    System.out.println("Enter Name,Amount of  second Roommate:");
    String secondr=myObj2.nextLine(); 
    int seconda=myObj2.nextInt();
     n=2;

    

    // Numerical input
    int amount =firsta+seconda;
    int roommates=n;

    // Output input by user
    
    System.out.println("Amount: " + amount); 
    System.out.println("roommates: " + n); 
    int ex_per_head=expencePerHead(amount,roommates);
    int duea=ex_per_head-firsta;
    int dueb=ex_per_head-seconda;
    
    
    System.out.println("roommates have to pay: " + ex_per_head+"per head"); 
    
    System.out.println(firstr+" have to pay: " + duea);
    System.out.println(secondr+" have to pay: " + dueb);
    
  }
  

    
    public static int expencePerHead(int a,int r)
    {
        // put your code here
        return a/r;
    }
}
