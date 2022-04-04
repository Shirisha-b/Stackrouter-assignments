import java.util.*;
public class RectanglePerimeter {
	public static void main(String args[]) 
    {   
       
      	 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length and breadth of the Rectangle:");
         
	 double l= s.nextDouble();
         
	 double b= s.nextDouble();
          
         double  getvalues=2*(l+b);
      
	 System.out.println("perimeter of Rectangle is: " + getvalues);      
   }

}
