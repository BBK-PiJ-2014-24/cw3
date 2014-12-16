package cw3Impl;

import cw3.ErrorMessage;
import cw3.FunctionalList;
import cw3.ReturnObject;

public class FunctionalArrayList extends ArrayList implements FunctionalList {

	// private ArrayList arrList;
	
	
	// Constructor
	// -----------
	public FunctionalArrayList(){
		super();
	}
	
	
	// head()
	// ------
	
	@Override
	public ReturnObject head() {
		if(isEmpty()){
			ErrorMessage m = ErrorMessage.EMPTY_STRUCTURE;
			Object o = null;
			return new ReturnObjectImpl(o,m);
		}
		else{
			ErrorMessage m = ErrorMessage.NO_ERROR;
			return get(0);
		}
	}

	// rest()
	// ------
	
	@Override
	public FunctionalList rest() {
		FunctionalList f;
		if(isEmpty()){
			f = new FunctionalArrayList();
			return f;
		}
		else{
			FunctionalList copy = new FunctionalArrayList();
			for(int i=1;i<this.sizeArr;i++){
				Object o = this.obj[i];
				copy.add(o);
			}
			return copy;	
		} // end else	
	}// end rest

}  // end class
