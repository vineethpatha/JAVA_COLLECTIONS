package Coloections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alist=new ArrayList();
		alist.add(1);
		alist.add("vineeth");
		alist.add("patha");
		alist.add(100.2f);
	System.out.println(alist);
for(int i=0;i<alist.size();i++) {
	System.out.print(alist.get(i));
}
System.out.println("");
	
		List list1=new ArrayList();
	list1.add(1);
	list1.add("ashok");
	list1.add("Dama");
list1.add(99.2f);

System.out.println(list1);
for(int i=0;i<list1.size();i++) {
	System.out.print(list1.get(i));
}
	
	}
}
