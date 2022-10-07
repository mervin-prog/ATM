package Banking_Application;
import java.util.HashMap;
import java.util.Scanner;

public class UserAccount {
	public static HashMap<Integer,Integer> h =new HashMap<>();
		long acc_no;
		String name;
		int pin_no;
		Scanner sc = new Scanner(System.in);
	    public boolean details()
		{
	    h.put(1, 123456);
	    h.put(2, 1234);
	    boolean ans = false;
		System.out.println("Enter the Account no:");
		acc_no=sc.nextLong();
		System.out.println("Enter Your Secret no:");
		pin_no=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
	    if(acc_no==h.get(1)&& pin_no==h.get(2)) 
	    {
	    	ans=true;
	    }
	    return ans;
		}
		public void display()
		{
		System.out.println("******************************************************************************");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Account no:"+acc_no+"\n"+"Name:"+name+"\n");
		System.out.println("-----------------------------------------------------------------");
		}
}
			 
 




