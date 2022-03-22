package mav;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

	private static final ArrayList<Salesman> Salesman = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("hello");
		jsontolist();

		ArrayList<Salesman> mylist = jsontolist();
		printmylist(mylist);
		int c = london(mylist);
		System.out.println("total number of salesman living in london is : " + c);
		numlondon(mylist);
		twocities(mylist);
		
		
		int av = avgage(mylist);
		System.out.println("average age of salesman living in london is : " + av);
		
		int ava=avgageNewYork(mylist);
		System.out.println("average age of salesman living in NewYork is : " + ava);
		int avar =avgageBoston(mylist);
		System.out.println("average age of salesman living in Boston is : " + avar);
		hash(mylist);
		
		HashMap<String, Integer> details=hash(mylist);
		sorthash(details);

	}

	public static ArrayList<Salesman> jsontolist() {
		ArrayList<Salesman> mylist = new ArrayList<Salesman>();
		Salesman salesmanobj1 = new Salesman();

		salesmanobj1.Name = "Jones";
		salesmanobj1.City = "Boston";
		salesmanobj1.age = 34;
		mylist.add(salesmanobj1);

		Salesman salesmanobj2 = new Salesman();
		salesmanobj2.Name = "Kivell";
		salesmanobj2.City = "NewYork";
		salesmanobj2.age = 23;
		mylist.add(salesmanobj2);

		Salesman salesmanobj3 = new Salesman();
		salesmanobj3.Name = "Kivell";
		salesmanobj3.City = "London";
		salesmanobj3.age = 54;
		mylist.add(salesmanobj3);

		Salesman salesmanobj4 = new Salesman();
		salesmanobj4.Name = "Gill";
		salesmanobj4.City = "London";
		salesmanobj4.age = 23;
		mylist.add(salesmanobj4);

		Salesman salesmanobj5 = new Salesman();
		salesmanobj5.Name = "Sorvino";
		salesmanobj5.City = "NewYork";
		salesmanobj5.age = 41;
		mylist.add(salesmanobj5);

		Salesman salesmanobj6 = new Salesman();
		salesmanobj6.Name = "Andrews";
		salesmanobj6.City = "Boston";
		salesmanobj6.age = 27;
		mylist.add(salesmanobj6);

		Salesman salesmanobj7 = new Salesman();
		salesmanobj7.Name = "Thompson";
		salesmanobj7.City = "London";
		salesmanobj7.age = 32;
		mylist.add(salesmanobj7);

		Salesman salesmanobj8 = new Salesman();
		salesmanobj8.Name = "Howard";
		salesmanobj8.City = "NewYork";
		salesmanobj8.age = 22;
		mylist.add(salesmanobj8);

		Salesman salesmanobj9 = new Salesman();
		salesmanobj9.Name = "Parent";
		salesmanobj9.City = "Boston";
		salesmanobj9.age = 31;
		mylist.add(salesmanobj9);

		Salesman salesmanobj10 = new Salesman();
		salesmanobj10.Name = "Andrews";
		salesmanobj10.City = "London";
		salesmanobj10.age = 40;
		mylist.add(salesmanobj10);

		return mylist;
	}

	public static void printmylist(ArrayList<Salesman> mylist) {
		for (int i = 0; i < mylist.size(); i++) {
			Salesman a = mylist.get(i);
			System.out.println(
					"Name of salesman: " + a.Name + " City of Salesman: " + a.City + " Age of Salesman: " + a.age);

		}

	}

	// 2.1
	public static int london(ArrayList<Salesman> mylist) {
		int x = 0;
		for (int i = 0; i < mylist.size(); i++) {
			Salesman a = mylist.get(i);
			if (a.City == "London") {
				x = x + 1;

			}
		}

		return x;
	}

	// 2.2
	public static ArrayList<String> numlondon(ArrayList<Salesman> mylist) {
		ArrayList<String> nameLondon = new ArrayList<String>();
		for (int i = 0; i < mylist.size(); i++) {
			if (mylist.get(i).City == "London") {
				nameLondon.add(mylist.get(i).Name);
			}
		}

		return nameLondon;
	}

	// 2.3
	public static int avgage(ArrayList<Salesman> mylist) {
		ArrayList<Integer> avgageLondon = new ArrayList<Integer>();
		int avg = 0;
		for (int i = 0; i < mylist.size(); i++) {
			if (mylist.get(i).City == "London") {
				avgageLondon.add(mylist.get(i).age);
			}
		}
		int total = avgageLondon.size();
		for (int i = 0; i < total; i++) {
			avg = avgageLondon.get(i) + avg;
		}
		int average = avg / total;
		return average;
	}
	
	public static int avgageNewYork(ArrayList<Salesman> mylist) {
		ArrayList<Integer> avgagenewyork = new ArrayList<Integer>();
		int avg = 0;
		for (int i = 0; i < mylist.size(); i++) {
			if (mylist.get(i).City == "NewYork") {
				avgagenewyork.add(mylist.get(i).age);
			}
		}
		int total = avgagenewyork.size();
		for (int i = 0; i < total; i++) {
			avg = avgagenewyork.get(i) + avg;
		}
		int average = avg / total;
		return average;
	}
	
	public static int avgageBoston(ArrayList<Salesman> mylist) {
		ArrayList<Integer> avgageboston = new ArrayList<Integer>();
		int avg = 0;
		for (int i = 0; i < mylist.size(); i++) {
			if (mylist.get(i).City == "Boston") {
				avgageboston.add(mylist.get(i).age);
			}
		}
		int total = avgageboston.size();
		for (int i = 0; i < total; i++) {
			avg = avgageboston.get(i) + avg;
		}
		int average = avg / total;
		return average;
	}
	// 2.4

	/*
	 * public static ArrayList<Salesman> sortage(ArrayList<Salesman> mylist){
	 * 
	 * // ArrayList<Salesman> sorte = new ArrayList<Salesman>();
	 * 
	 * Collections.sort(mylist, new Salesman.ager()); for(int
	 * i=0;i<mylist.size();i++) { System.out.println(mylist.get(i)); }
	 * 
	 * for(int i=0;i<mylist.size();i++) { for(int j=i+1;j<mylist.size();j++) { if
	 * (mylist.get(i).age>mylist.get(j).age) { sorte.add(mylist.get(i).age);
	 * mylist.get(i).age mylist.get(j).age;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return mylist; }
	 */

	// 2.9
	public static ArrayList<String> twocities(ArrayList<Salesman> mylist) {
		ArrayList<String> loncit = new ArrayList<String>();
		ArrayList<String> bostocit = new ArrayList<String>();
		ArrayList<String> bothcity = new ArrayList<String>();

		for (int i = 0; i < mylist.size(); i++) {

			if (mylist.get(i).City == "London") {
				loncit.add(mylist.get(i).Name);
			}

			if (mylist.get(i).City == "Boston") {
				bostocit.add(mylist.get(i).Name);
			}

		}

		for (int i = 0; i < loncit.size(); i++) {
			for (int j = 0; j < bostocit.size(); j++) {

				if (loncit.get(i) == bostocit.get(j)) {
					bothcity.add(loncit.get(i));
				}
			}
		}

		for (int i = 0; i < bothcity.size(); i++) {
			System.out.println(bothcity.get(i));
		}

		return bothcity;
	}
	public static HashMap<String,Integer> hash(ArrayList<Salesman> mylist){
		ArrayList<String> cities = new ArrayList<String>();
		ArrayList<String> averageAge = new ArrayList<String>();
		int avi = avgage(mylist);
		int aviny= avgageNewYork(mylist);
		int avibos=avgageBoston(mylist);
		//System.out.println("average age of salesman living in london is : " + av);

		HashMap<String, Integer> details =new HashMap<String, Integer>();

		for(int i=0;i<mylist.size();i++) {
			cities.add(mylist.get(i).City);
		}
		/*
		 * for(int i=0;i<cities.size();i++) { System.out.println(cities.get(i)); }
		 */
		for(int i=0;i<cities.size()-1;i++) {
			for(int j=1;j<cities.size();j++) {
				if(cities.get(i)==cities.get(j))
				{
					cities.remove(j);
				}
			}
			
		}
		
		
		for(int i=0;i<cities.size();i++)
		{
			
			System.out.println(cities.get(i));
		}
		

		for(int i=0;i<cities.size();i++)
		{
			details.put(cities.get(i),1);
		}
		for(Map.Entry m : details.entrySet())
		 {    
			if(m.getKey()=="London")
			{
				details.replace("London",avi);
			}
			if(m.getKey()=="NewYork")
			{
				details.replace("NewYork",aviny);
			}
			if(m.getKey()=="Boston")
			{
				details.replace("Boston",avibos);
			}
			//System.out.println(m.getKey()+" "+m.getValue());    
		 }  
		
		 for(Map.Entry m : details.entrySet())
		 {    
			    System.out.println(m.getKey()+" "+m.getValue());    
		 }  
		return details;
	}
	
	public static TreeMap<String, Integer> sorthash(HashMap<String, Integer> details)
	{
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(details);
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue()); 
		}
		
		return sorted;
	}
	
	

}
