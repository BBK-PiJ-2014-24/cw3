package tests;

import cw3.List;
import cw3.ReturnObject;
import cw3Impl.ArrayList;

public class ArrayListStrTest {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		List strArray = new ArrayList();
		
		String s = "hello";
		String t = "world";
		String u = "this";
		String v = " is a ";
		String w = "Java";
		String x = "test";
		String y = "program";
		String m = "BIG";
		
		// Test isEmpty
		// ------------
		boolean empty = strArray.isEmpty();
		System.out.println("strArr empty: "+ empty);
		
		// Test add(index, object) - Addition at List End
		// -----------------------
		strArray.add(0, s);
		strArray.add(1, t);
		strArray.add(2, u);
		
		ReturnObject retS = strArray.get(0);
		String ss = (String) retS.getReturnValue();
		System.out.println("\nstrArr[0]:" + ss);
		
		retS = strArray.get(1);
		String tt = (String) retS.getReturnValue();
		System.out.println("strArr[1]:" + tt);
		
		retS = strArray.get(2);
		String uu = (String) retS.getReturnValue();
		System.out.println("strArr[2]:" + uu);
		

		// test add(item)
		// --------------
		
		strArray.add(v);
		retS = strArray.get(3);
		String vv = (String) retS.getReturnValue();
		System.out.println("strArr[3]:" + vv);
		
		strArray.add(w);
		retS = strArray.get(4);
		String ww = (String) retS.getReturnValue();
		System.out.println("strArr[4]:" + ww);
		
		// test add() - Bad Entries
		// ------------------------
		strArray.add(10, v);
		retS = strArray.get(10);
		if(retS.hasError())
			System.out.println(retS.getError());
		
		// Test add(index, object) - Addition in Middle of List
		// -----------------------
		
		strArray.add(4, m);
		retS = strArray.get(4);
		String mm = (String) retS.getReturnValue();
		System.out.println("New strArr[4]: " + mm);
		
		System.out.println("\nFinal Test of Addition Methods");
		for(int i=0;i<6;i++){
			retS = strArray.get(i);
			String loop = (String) retS.getReturnValue();
			System.out.println("New strArr["+ i + "]: " + loop);
		}
		
		// Test size()
		// -----------
		System.out.println("\n Test size()");
		System.out.println("Size of Array: " + strArray.size());
		
		// Test Remove
		// -----------
		
		System.out.println("\n Test remove()");
		retS = strArray.remove(4);
		String r = (String) retS.getReturnValue();
		System.out.println("Remove strArr[4]: "+ r);
		
		for(int i=0;i<5;i++){
			retS = strArray.get(i);
			String loop = (String) retS.getReturnValue();
			System.out.println("New strArr["+ i + "]: " + loop);
		}
	} // end main

}
