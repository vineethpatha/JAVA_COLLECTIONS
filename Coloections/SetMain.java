package Coloections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set newset=new HashSet();
		newset.add(1);
		newset.add("1");
		newset.add(10);
        newset.add('1');
        newset.add(2);
        System.out.println(newset);
 	Set newset1=new HashSet();
 	newset1.add(newset);
        newset1.add(55);
        newset1.add(25);
        newset1.add("abcd");
        newset1.add(58);
        newset1.add(55);
        newset1.add(25);
        System.out.println(newset1);
        Iterator newset2=newset1.iterator();
        while(newset2.hasNext()) {
            System.out.println(newset2.next());

        }


Set<String> object=new HashSet<String>();
object.add("hello ecllipse");
object.add("ecllipse");
object.add("hello ecllipse hii");
System.out.println(object);

//int array[]= {1,2,3,4,5,6,7};
//int array1[]= {8,9,10,11,12,13};
//Set<int[]> obj=new Set<int[]>();

Integer array[]= {1,2,3,4,5,6,7};
Integer array1[]= {12,13,8,9,10,11};

Set<Integer[]> obj=new HashSet<Integer[]>();
//obj.addAll(Arrays.asList(array));
obj.add(array);
obj.add(array1);
//System.out.println(obj);

//System.out.println(obj);
List l=new ArrayList<>();
l.add(55);
l.add(25);
l.add(58);
l.add(55);
l.add(25);
l.add(58);

Set objectone=new HashSet();
Set obj1=new TreeSet(l);

//objectone.addAll(Arrays.asList(array));
objectone.add(55);
objectone.add(22);
objectone.add(58);


System.out.println(objectone);
System.out.println(obj1);

Set<Integer> intersection=new HashSet<Integer>();



//intersection.retainAll(object);
//System.out.println(intersection);


//
// newset.iterator();
// 
// while( newset.iterator().hasNext()) {
////	 System.out.println( newset.iterator().next());
// }
//
//for(int i=0;i<newset.size();i++) {
//	System.out.println(newset.iterator());
//	
//}


	}

}
