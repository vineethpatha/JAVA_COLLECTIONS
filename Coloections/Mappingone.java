  

//by source
package Coloections;

public class Mappingone {
     int key;
     String value;
	public String getKey() {
		return key+value;
	}
	public void setKey(int key,String value) {
		this.key = key;
		this.value=value;
	}
//	public String getValue() {
//		return value;
//	}
//	public void setValue(String value) {
//		this.value = value;
//	}
	
	@Override
	public String toString() {
		return "Mappingone [key=" + key + ", value=" + value + "]";
	}
     
}
