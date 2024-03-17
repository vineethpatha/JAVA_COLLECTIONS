
package Coloections;

import java.util.ArrayList;

public class Wrapperarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]array={3,4,5,6};
		Integer[]array2= {7,8,9};
		ArrayList<Integer[]> combinearray=new ArrayList<Integer[]>();

		combinearray.add(array);
		combinearray.add(array2);
		
//		obj2 is empty array::
		ArrayList<ArrayList<Integer[]>> obj2=new ArrayList<ArrayList<Integer[]>>();
		ArrayList<ArrayList<Integer[]>> obj1=new ArrayList<ArrayList<Integer[]>>();
		obj1.add(combinearray);
		for(int i=0;i<obj1.size();i++) {
			for(int j=0;j<obj1.get(i).size();j++) {
				for(int k=0;k<obj1.get(i).get(j).length;k++) {
					System.out.print(obj1.get(i).get(j)[k]+",");
				
				}
			}
		}
//	ArrayList<ArrayList<ArrayList<Integer>>> obj=new ArrayList<ArrayList<ArrayList<Integer>>>();
		
//		System.out.println(combinearray.get(0)[1]);
		
		
 ArrayList<Integer> alist=new ArrayList<Integer>();
 ArrayList<Boolean> alist1=new ArrayList<Boolean>();
 ArrayList<String> alist2=new ArrayList<String>();
 int a=10;
alist.add(1);
alist.add(50);
alist.add(a);

alist1.add(true);
alist1.add(null);
alist1.add(false);

alist2.add("vineeth");
System.out.println(alist);
System.out.println(alist1);
System.out.println(alist2);

Testarray testarray= new Testarray();
ArrayList<Testarray> testarrays=new ArrayList<Testarray>();
//testarray.setA(100);
//testarray.setB(20);
System.out.println(testarray);


testarrays.add(testarray);
System.out.println(testarrays);

ArrayList<ArrayList<Testarray>> test=new ArrayList<ArrayList<Testarray>>();
test.add(testarrays);
System.out.println(test.get(0));

//to get only one element
for(int i=0;i<obj1.size();i++) {
	for( int j=0;j<obj1.size();j++) {
		System.out.println(test.get(i).get(j).getA());
	}
}

System.out.println(obj1.lastIndexOf(obj1));
System.out.println(obj2.isEmpty());

	}

}
