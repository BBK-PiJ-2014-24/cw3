package tests;

import cw3.List;
import cw3.SampleableList;
import cw3Impl.ArrayList;
import cw3Impl.SampleableListImpl;

public class SampleableListTest {

	public static void main(String[] args) {
		// Initializations And Declarations
		// --------------------------------
		
		List l = new ArrayList();
		SampleableList s = new SampleableListImpl(l);
		SampleableList t;
		
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
		
		
		// Test remove()
		// -------------
		
		s.remove(6);
		
		// Test sample()
		// -------------
		
		System.out.println("\nTest sample()");
		t = s.sample();
		t.add(100);
		
	}

}
