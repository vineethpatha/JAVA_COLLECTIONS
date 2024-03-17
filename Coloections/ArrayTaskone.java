package Coloections;

import java.util.ArrayList;
import java.util.List;

public class ArrayTaskone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(55);
		obj.add(6);
		obj.add(1);
		obj.add(1);
		obj.add(1);
		obj.add(15);
		obj.add(15);
		obj.add(15);
		obj.add(55);
		obj.add(6);
		obj.add(100);
		ArrayList<Integer> obj1=new ArrayList<Integer>();
obj1.add(1);
obj1.add(10);
obj1.add(3);
obj1.add(6);
		
removeduplicate(obj);
sorting(obj);
missing(obj1);
	}
	 public static void removeduplicate(ArrayList<Integer> obj) {
		 for(int i=0;i<obj.size();i++) {
			 for(int j=i+1;j<obj.size();j++) { 
				 if(obj.get(i)==obj.get(j)) {
                     obj.remove(j);		
                     j--;
                     }
			 }
		}
		 System.out.println("Removing duplicate elements=="+obj);
}
	 static void sorting(ArrayList<Integer> obj) {
		 for(int i=0;i<obj.size();i++) {
			 for(int j=i+1;j<obj.size();j++) {
				 if(obj.get(i)>obj.get(j)) {
					 int a=obj.get(i);
					 int b=obj.get(j);
					 int c=a;
					 a=b;
					 b=a;
					 obj.set(i, b);
					 obj.set(j, c);
		 }
			 }
		 }
		 System.out.println("Sorted array=="+obj);
		 System.out.println("second largest number in array:::"+(obj.get(obj.size()-2))); 
	 }
		static void missing(ArrayList<Integer> obj1) {
			for(int i=0;i<obj1.size();i++) {
				for(int j=i+1;j<obj1.size();j++) {
					int []array1= {};
					
				}
			}
		}

		 

	}
