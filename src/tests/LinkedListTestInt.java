package tests;

import cw3.List;
import cw3.ReturnObject;
import cw3Impl.LinkedList;

public class LinkedListTestInt {

	public static void main(String[] args) {
		List myLinkList = new LinkedList();
		
		int a = 0;
		int x = 1;
		int y = 2;
		int z = 3;
		int w = 4;
		int m = 100;
		
		
		// Test isEmpty
		// ------------
		System.out.println("Test isEmpty\n");
		boolean empty = myLinkList.isEmpty();
		System.out.println("LinkList empty: "+ empty);
		System.out.println("Size of LinkList: " + myLinkList.size());
		
		myLinkList.add(0,a);
		empty = myLinkList.isEmpty();
		System.out.println("LinkList empty: "+ empty);
		System.out.println("Size of LinkList: " + myLinkList.size() + "\n");
		
		// Test add(index, object) - Addition at List End
		// -----------------------
		
		System.out.println("\nTest add()\n");
		myLinkList.add(1, x);
		myLinkList.add(2,y);

		
		ReturnObject retX = myLinkList.get(0);
		int aa = (int) retX.getReturnValue();
		System.out.println("LinkList[0]:" + aa);
		
		retX = myLinkList.get(1);
		int xx = (int) retX.getReturnValue();
		System.out.println("LinkList[1]:" + xx);
		
		retX = myLinkList.get(2);
		int yy = (int) retX.getReturnValue();
		System.out.println("LinkList[2]:" + yy);
	
	
		// test add(item)
		// --------------
		
		myLinkList.add(z);
		retX = myLinkList.get(3);
		int zz = (int) retX.getReturnValue();
		System.out.println("LinkList[3]:" + zz);
		
		myLinkList.add(w);
		retX = myLinkList.get(4);
		int ww = (int) retX.getReturnValue();
		System.out.println("LinkList[4]:" + ww);
		
		// test add() - Bad Entries
		// ------------------------
		System.out.println("\nTest Bad Argument");
		myLinkList.add(10, a);
		retX = myLinkList.get(10);
		if(retX.hasError())
			System.out.println(retX.getError());
		
		// Test add(index, object) - Addition in Middle of List
		// -----------------------
		
		myLinkList.add(0, m);
		retX = myLinkList.get(0);
		int mm = (int) retX.getReturnValue();
		System.out.println("LinkList[0]: " + mm);
		
		myLinkList.add(3, m);
		retX = myLinkList.get(3);
		int mmm = (int) retX.getReturnValue();
		System.out.println("LinkList[3]: " + mmm);
		
		System.out.println("\nFinal Test of Addition Methods");
		for(int i=0;i<myLinkList.size();i++){
			retX = myLinkList.get(i);
			int loop = (int) retX.getReturnValue();
			System.out.println("New LinkList["+ i + "]: " + loop);
		}
		
		// Test size()
		// -----------
		System.out.println("\n Test size()");
		System.out.println("Size of LinkList: " + myLinkList.size());
		
		// Test Remove
		// -----------
		
		System.out.println("\n Test remove()");
		retX = myLinkList.remove(0);
		int r = (int) retX.getReturnValue();
		System.out.println("Remove LinkList[0]: "+ r);
		
		retX = myLinkList.remove(2);
		int rr = (int) retX.getReturnValue();
		System.out.println("Remove LinkList[2]: "+ rr + "\n");
		
		for(int i=0;i<myLinkList.size();i++){
			retX = myLinkList.get(i);
			int loop = (int) retX.getReturnValue();
			System.out.println("New LinkList["+ i + "]: " + loop);
		}
		
		
	} // end main
} // end class
