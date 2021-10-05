
import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();//Creating arraylist
		
		arrayList.add("String1");//Adding object in arraylist
		arrayList.add("String2");

		//Traversing list through Iterator
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		 
	}

}
