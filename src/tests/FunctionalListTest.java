package tests;

import cw3.List;
import cw3.*;
import cw3Impl.*;
import cw3Impl.ArrayList;
import cw3Impl.FunctionalArrayList;

public class FunctionalListTest {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		ReturnObject rObj;
		FunctionalList f = new FunctionalLinkedList();
		f.add(0);
		f.add(1);
		f.add(2);
		f.add(3);
		f.add(4);
		f.add(5);
		
		
		// Test head()
		// -----------
		 rObj = f.head();
		 int h = (int) rObj.getReturnValue();
		 System.out.println("head: " + h);
		 
		 // Test Rest()
		 // -----------
		 
		 FunctionalList b = f.rest();
		 for(int i=0;i<b.size();i++){
			 rObj = b.get(i);
			 int j = (int) rObj.getReturnValue();
			 System.out.println("Arr[" + i + "]:" + j);
		 }	 
		
		// Test Remove()
		// -------------
		 System.out.println("\nTest Remove()");
		 f.remove(0);
		 rObj = f.head();
		 h = (int) rObj.getReturnValue();
		 System.out.println("head: " + h);
		 
		b = f.rest();
		 for(int i=0;i<b.size();i++){
			 rObj = b.get(i);
			 int j = (int) rObj.getReturnValue();
			 System.out.println("Arr[" + i + "]:" + j);
		 }
		
	}

}
