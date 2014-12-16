package cw3Impl;

import cw3.List;
import cw3.ReturnObject;
import cw3.ErrorMessage;
import cw3Impl.ReturnObjectImpl;

public class ArrayList implements List {

	// Fields
	// ------
	protected Object[] obj;
	protected int sizeArr;
	protected ReturnObject rObj;
	
	
	// Constructor
	// -----------
	
	public ArrayList(){
		obj = new Object[0];
		sizeArr = obj.length;
	}
	
	// increaseArraySize()  // If needed to Expand the Array Dynamically
	// -------------------
	 private void increaseArraySize(){
	 		 
	 	Object[] temp = new Object[sizeArr+1];
	 	for(int i=0;i<sizeArr;i++){
	 		temp[i] = obj[i];
	 	}
	 	this.obj = temp;
	 	sizeArr = obj.length; 
	}
	
	// is Empty()
	// ----------
	@Override
	public boolean isEmpty() {
		int i = 0;
		if(sizeArr == 0)
			return true;
		else{
			while(i<sizeArr){
			if(obj[i]==null)
				return true;
			else
				i++;;
			} // end while
		} // end else
		return false;
	}  // end isEmpty

	// size()
	// ------
	@Override
	public int size() {
		int countElements = 0;
		for(int i=0;i<sizeArr;i++){
			if(obj[i]!=null)
				countElements++;
		}
		return countElements;	
	}  // end size

	
	// get()
	// -----
	@Override
	public ReturnObject get(int index) {
		if(index>sizeArr || index<0){
			ErrorMessage m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		else{
			ErrorMessage m = ErrorMessage.NO_ERROR;
			rObj = new ReturnObjectImpl(obj[index],m);
			return rObj;
		}
	} // end get();

	// remove()
	// --------
	@Override
	public ReturnObject remove(int index) {
		if(index<=sizeArr){
			 Object o = get(index).getReturnValue();   // Need to get RetObj first, and then obj wrapped inside
			 ErrorMessage m = ErrorMessage.NO_ERROR;
			 Object[] temp = new Object[sizeArr-1];
			 for(int i=0;i<index;i++){
				 temp[i] = obj[i];
			 }
			 for(int i=index+1;i<sizeArr;i++){
				 temp[i-1] = obj[i];
			 }
			 obj = temp;
			 sizeArr = obj.length;
			 rObj = new ReturnObjectImpl(o,m);
			 return rObj;
		}
		else if(index>sizeArr + 1 || index < 0){
			ErrorMessage m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		return null;
	} // end remove()

	// add()
	// -----
	@Override
	public ReturnObject add(int index, Object item) {
		
		if(index<sizeArr){
			increaseArraySize();
			Object[] temp = obj.clone();  // Must use clone to prevent pointing at same object on heap
			for(int i=index;i<sizeArr-1;i++){
				Object x = obj[i];
				temp[i+1] = x;
			}
			temp[index] = item;
			obj = temp;
			ErrorMessage m = ErrorMessage.NO_ERROR;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		else if(index==sizeArr){
			increaseArraySize();
			obj[index] = item;
			ErrorMessage m = ErrorMessage.NO_ERROR;
			rObj = new ReturnObjectImpl(obj,m);
		}
		else if(index>sizeArr + 1 || index < 0){
			ErrorMessage m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		if(item == null){
			ErrorMessage m = ErrorMessage.EMPTY_STRUCTURE;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		return null;
	}  // end add()

	// add()
	// -----
	@Override
	public ReturnObject add(Object item) {
		ReturnObject r = add(sizeArr, item);
		return r;
	} // end add()
} // end class
