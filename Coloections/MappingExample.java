
package Coloections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> obj=new HashMap<Integer,String>();
//Map obj=new HashMap();
obj.put(101, "vineeth");
obj.put(102, "vineethpatha");
obj.put(103, "hellovineeth");
//obj.put(null, null);
for(Map.Entry m:obj.entrySet()) {
	System.out.println(m.getKey()+": "+m.getValue());
}
System.out.println(obj);

Mappingone object=new Mappingone();
object.setKey(1, "akshay");
Mappingone object1=new Mappingone();
object1.setKey(2, "bhavith");
Mappingone object2=new Mappingone();
object2.setKey(3, "vinith");

Map<Integer,Mappingone> obj1=new HashMap<Integer,Mappingone>();

obj1.put(1,object);
obj1.put(2, object1);
obj1.put(3, object2);
System.out.println(obj1);
System.out.println("To get only one key and value::"+obj1.get(2));

Map<Integer,ArrayList<Integer>> obj2=new HashMap<Integer,ArrayList<Integer>>();
ArrayList<Integer> obj3=new ArrayList<Integer>();
obj3.add(1);
obj3.add(2);
obj3.add(3);
ArrayList<Integer> obj4=new ArrayList<Integer>();
obj4.add(4);
obj4.add(5);
obj4.add(6);

obj2.put(1, obj3);
obj2.put(2, obj4);
System.out.println(obj2.get(1));
System.out.println(obj2.get(2));



Map<Integer,String> mapmonth=new HashMap<Integer,String>();
mapmonth.put(1,"january");
mapmonth.put(2, "febuary");
mapmonth.put(3, "march");
mapmonth.put(4, "april");
for(Map.Entry<Integer, String> mths:mapmonth.entrySet() ) {
	System.out.println(mths.getKey());
System.out.println(mths.getValue());
System.out.println(mapmonth.get(mapmonth));


}
Map<Integer,String> linkedmap=new LinkedHashMap<Integer,String>();
Map<Integer,String> treemap=new TreeMap<Integer,String>();
for(Map.Entry<Integer, String> trees:treemap.entrySet()) {
	System.out.println("NO key is present::"+trees.getKey());
}
	}

}
