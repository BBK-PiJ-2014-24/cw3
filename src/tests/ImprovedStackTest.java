package tests;

import cw3.List;
import cw3.ImprovedStack;
import cw3.ReturnObject;
import cw3Impl.*;

public class ImprovedStackTest {

	public static void main(String[] args) {
		// Initializations and Declarations
		// --------------------------------
		
		List l = new ArrayList();
		ImprovedStack s = new ImprovedStackImpl(l);
		ImprovedStack t;
		
		// Test isEmpty()
		// --------------
		System.out.println("Test isEmpty()");
		boolean empty = s.isEmpty();
		System.out.println("Empty: " + empty);
		l.add(0);
		l.add(1);
		l.add(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		empty = s.isEmpty();
		System.out.println("Empty: " + empty);
		
		// Test size()
		// -----------
		
		System.out.println("\nTest size()");
		int sze = s.size();
		System.out.println("Size: " + sze);
		
		
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
		 
		 // test reverse()
		 // --------------
		 
		 t=s.reverse();
		 
	 
		 // test remove()
		 // -------------
		System.out.println("\nTest remove()");
		 s.push(2);
		 s.push(2);
		 s.push(2);
		 s.push(2);
		 s.push(2);
		sze = s.size();
		System.out.println("Size: " + sze);
		s.remove(2);
		sze = s.size();
		System.out.println("Size: " + sze);
		 
		 
		 
		
	}

}
