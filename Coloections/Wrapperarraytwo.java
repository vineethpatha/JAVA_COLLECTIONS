package Coloections;

import java.util.ArrayList;

public class Wrapperarraytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]array={3,4,5,6};
		Integer[]array2= {7,8,9};
		
		ArrayList<Integer[]> combinearray=new ArrayList<Integer[]>();

		combinearray.add(array);
		combinearray.add(array2);
ArrayList<ArrayList<Integer[]>> object=new ArrayList<ArrayList<Integer[]>>();
object.add(combinearray);
ArrayList<ArrayList<ArrayList<Integer[]>>> object1=new ArrayList<ArrayList<ArrayList<Integer[]>>>();
object1.add(object);
for(int l=0;l<object1.size();l++) {
for(int i=0;i<object1.get(l).size();i++) {
	for(int j=0;j<object1.get(l).get(i).size();j++) {
		for(int k=0;k<object1.get(l).get(i).get(j).length;k++) {
			System.out.print(object1.get(l).get(i).get(j)[k]+",");
		
		
		}
	}
}
}
}

}
