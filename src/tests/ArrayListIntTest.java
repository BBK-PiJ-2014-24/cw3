package tests;

import cw3.ReturnObject;
import cw3.List;
import cw3Impl.ArrayList;
import cw3Impl.ReturnObjectImpl;
import cw3.ErrorMessage;

public class ArrayListIntTest {

	public static void main(String[] args) {
		// Initializations & Declarations
		// ------------------------------
		
		
		List intArray = new ArrayList();
	
		int a = 2;
		int x = 5;
		int y = 6;
		int z = 7;
		int w = 8;
		int m = 100;
		
		
		// Test isEmpty
		// ------------
		System.out.println("Test isEmpty\n");
		boolean empty = intArray.isEmpty();
		System.out.println("intArr empty: "+ empty);
		System.out.println("Size of Array: " + intArray.size());
		
		intArray.add(0,a);
		empty = intArray.isEmpty();
		System.out.println("intArr empty: "+ empty);
		System.out.println("Size of Array: " + intArray.size() + "\n");
		
		// Test add(index, object) - Addition at List End
		// -----------------------
		
		System.out.println("\nTest add()\n");
		intArray.add(1, x);
		intArray.add(2,y);

		
		ReturnObject retX = intArray.get(0);
		int aa = (int) retX.getReturnValue();
		System.out.println("intArr[0]:" + aa);
		
		retX = intArray.get(1);
		int xx = (int) retX.getReturnValue();
		System.out.println("intArr[1]:" + xx);
		
		retX = intArray.get(2);
		int yy = (int) retX.getReturnValue();
		System.out.println("intArr[2]:" + yy);
	
	
		// test add(item)
		// --------------
		
		intArray.add(z);
		retX = intArray.get(3);
		int zz = (int) retX.getReturnValue();
		System.out.println("intArr[3]:" + zz);
		
		intArray.add(w);
		retX = intArray.get(4);
		int ww = (int) retX.getReturnValue();
		System.out.println("intArr[4]:" + ww);
		
		// test add() - Bad Entries
		// ------------------------
		intArray.add(10, a);
		retX = intArray.get(10);
		if(retX.hasError())
			System.out.println(retX.getError());
		
		// Test add(index, object) - Addition in Middle of List
		// -----------------------
		
		intArray.add(3, m);
		retX = intArray.get(3);
		int mm = (int) retX.getReturnValue();
		System.out.println("New intArr[3]: " + mm);
		
		System.out.println("\nFinal Test of Addition Methods");
		for(int i=0;i<6;i++){
			retX = intArray.get(i);
			int loop = (int) retX.getReturnValue();
			System.out.println("New intArr["+ i + "]: " + loop);
		}
		
		// Test size()
		// -----------
		System.out.println("\n Test size()");
		System.out.println("Size of Array: " + intArray.size());
		
		// Test Remove
		// -----------
		
		System.out.println("\n Test remove()");
		retX = intArray.remove(0);
		int r = (int) retX.getReturnValue();
		System.out.println("Remove intArr[0]: "+ r);
		
		for(int i=0;i<5;i++){
			retX = intArray.get(i);
			int loop = (int) retX.getReturnValue();
			System.out.println("New intArr["+ i + "]: " + loop);
		}
		
	}  // end Main

} // end Class
