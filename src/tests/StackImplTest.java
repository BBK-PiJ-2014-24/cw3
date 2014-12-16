package tests;

import cw3.*;
import cw3Impl.*;

public class StackImplTest {

	public static void main(String[] args) {
		// Initializations & Declarations
		// -------------------------------
		
		List l = new ArrayList();
		StackImpl s = new StackImpl(l);
		
		
		// Test isEmpty()
		// --------------
		System.out.println("Test isEmpty()");
		boolean empty = s.isEmpty();
		System.out.println("Empty: " + empty);
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);

		empty = s.isEmpty();
		System.out.println("Empty: " + empty);
		
		// Test size()
		// -----------
		
		System.out.println("\nTest size()");
		int sze = s.size();
		System.out.println("Size: " + sze);
		
		// Test push()
		// -----------
		
		s.push(80);
		
		// Test top()
		// ----------
		System.out.println("\nTest top()");
		 ReturnObject rObj = s.top();
		 int x = (int) rObj.getReturnValue();
		 System.out.println("top: " + x);
		 
		 // test pop()
		 // ----------
		 System.out.println("\nTest pop()");
		 rObj = s.pop();
		 int y = (int) rObj.getReturnValue();
		 System.out.println("pop: " + y);
		 
		 rObj = s.top();
		 int z = (int) rObj.getReturnValue();
		 System.out.println("New top: " + z);
	 
	
	

	}  // end main

} // end class
