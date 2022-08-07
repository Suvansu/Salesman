package currencyconvertor;

import java.util.*;
import java.util.Scanner;

public class conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<countries> calling = new ArrayList<countries>();
		calling =info();
		int c=1;
		for(int i=0;i<calling.size();i++)
		{	
			
			countries a = calling.get(i);
			System.out.println(c + " " + a.countryname + " "+a.currencyname);
			c++;					
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("which two countries yo want to convert currency in: ");
		
		System.out.println("enter your first choice ");
		int choice = sc.nextInt();
		System.out.println("enter your second choice ");
		int choice1= sc.nextInt();
		calculations(calling, choice, choice1);
		
		
	}
	
	public static ArrayList<countries> info()
	{
		ArrayList<countries> countryinfo = new ArrayList<countries>();
		
		countries countryobj = new countries();
		countryobj.countryname="Nepal";
		countryobj.currencyname="Rupee";
		countryinfo.add(countryobj);
		
		countries countryobj1 = new countries();
		countryobj1.countryname="India";
		countryobj1.currencyname="Rupee";
		countryinfo.add(countryobj1);
		
		countries countryobj2 = new countries();
		countryobj2.countryname="China";
		countryobj2.currencyname="Yuan";
		countryinfo.add(countryobj2);
		return countryinfo;
	}
	
	public static void calculations(ArrayList<countries> countryinfo,int choice, int choice2)
	{
		if (choice==1 & choice==2)
		{
			System.out.println("converting NC to IC");
			double x = nctoic();
			System.out.println("Converted amount is: " + x );
			
		}
		else if (choice==2 & choice==1)
		{
			System.out.println("converting IC to NC");
			//ictonc();
		}
	}
	
	public static double nctoic()
	{
		System.out.println("Input the Amount you want to convert");
		Scanner inp = new Scanner(System.in);
		double amount = inp.nextFloat();
		
		double total;
		total = (amount * 1.6);
		
		return total;
		
	}
	
}
