package com.java.assignmentnine.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericHashMap {

	public static BufferedReader br ;
	public static HashMap<Object, Object> hm ;
	public static Integer empCode ;
	public static String empName , input ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();    
		 getEmpName();
	}
	
	private static void getEmpName() {
		// TODO Auto-generated method stub
		Set<Entry<Object,Object>> s = hm.entrySet(); 
		Iterator<Entry<Object,Object>> itr=s.iterator();  
		  while(itr.hasNext()){  
		   Map.Entry<Object,Object> m=(Map.Entry<Object,Object>)itr.next();  
		   System.out.println(" "+m.getValue());  
		  }  
	}
	
	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		hm = new HashMap<Object , Object>();
		for (int i = 0; i < Long.SIZE; i++) {
			System.out.println("Enter Name : ");
			try {
				input = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			empName = input ;
			
			System.out.println("Enter EmpCode :");
			try {
				input = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			empCode = Integer.parseInt(input) ;
			
			hm.put(empCode, empName);
		}
		
	}

}
