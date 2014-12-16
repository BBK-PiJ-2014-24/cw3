package cw3Impl;

import cw3.ErrorMessage;
import cw3.FunctionalList;
import cw3.ReturnObject;
import cw3Impl.ReturnObjectImpl;

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	// Fields
	// ------
	
	
	// Constructors
	// ------------
	public FunctionalLinkedList(){
		super();
	}
	
	
	// head()
	// ------
	@Override
	public ReturnObject head() {
		if(super.head==null){
			Object o = null;
			ErrorMessage m = ErrorMessage.EMPTY_STRUCTURE;
			return new ReturnObjectImpl(o,m);
		}
		else{
			Object o = super.head.obj;
			ErrorMessage m = ErrorMessage.NO_ERROR;
			return new ReturnObjectImpl(o,m);
		}
	} // end head

	// rest()
	// ------
	@Override
	public FunctionalList rest() {
		if(super.head==null){
			LinkedList l = new LinkedList();
			FunctionalList f = new FunctionalLinkedList();
			f.add(l);
			return f;
		}
		else{
			Node h = head.nextLink;
			FunctionalList f = new FunctionalLinkedList();
			while(h.nextLink!=null){
				f.add(h.obj);
				h=h.nextLink;
			}  // end while
			return f;
		} // end else
	} // end rest

}  // end class
