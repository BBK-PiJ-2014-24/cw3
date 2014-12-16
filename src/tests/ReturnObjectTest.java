package tests;

import cw3.ErrorMessage;
import cw3.ReturnObject;
import cw3Impl.ReturnObjectImpl;

public class ReturnObjectTest {

	public static void main(String[] args) {
		
		
		// Initializations & Declarations
		// ------------------------------
		
		int[] objIntArr = new int[10];
		objIntArr[1] = 1;
		Object copyObj1;    // N.b. Returned Types Must be Object
		Object copyObj2;
		

		ErrorMessage m;
		
		// Test for NO ERROR
		// -----------------
		System.out.println("Test for NO ERROR");
		m = ErrorMessage.NO_ERROR;
		ReturnObjectImpl r = new ReturnObjectImpl(objIntArr,m);
		System.out.println("hasError(): " + r.hasError());
		
		copyObj1 = r.getReturnValue();  // Return Object
		int[] a = (int[]) copyObj1;     // ReCast Object to int[]
		System.out.println("a[1] = " + a[1]);
		
		
		// Test for ERROR
		// --------------
		System.out.println("\nTest for ERROR");
		m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		ReturnObjectImpl r2 = new ReturnObjectImpl(objIntArr,m);
		System.out.println("hasError(): " + r2.hasError());
		System.out.println("getError(): " + r2.getError());
		
		copyObj2 = r2.getReturnValue();     // Check Null Output
		if(copyObj2==null)
			System.out.println("Null Output");
		else{
			int[] b = (int[]) copyObj2;     // ReCast Object to int[]
			System.out.println("b[1] = " + b[1]);
		}

	}

}
