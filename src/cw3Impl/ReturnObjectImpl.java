

package cw3Impl;

import cw3.ErrorMessage;
import cw3.ReturnObject;

public class ReturnObjectImpl implements ReturnObject {

	// Fields
	// ------
	private ErrorMessage errMsg;
	private Object obj;
	
	// Constructor
	// -----------
	
	public ReturnObjectImpl(Object obj, ErrorMessage errMsg){
		this.errMsg  = errMsg;
		this.obj = obj;
	}
	
	// hasError()
	// ----------
	@Override
	public boolean hasError() {
		if(errMsg.equals(ErrorMessage.NO_ERROR))
			return false;
		else
			return true;
	} // end hasError
 
	// getError()
	// ----------
	@Override
	public ErrorMessage getError() {
		return errMsg;		
	}
	

	// getReturnValue()
	// ----------------
	@Override
	public Object getReturnValue() {
		if(errMsg.equals(ErrorMessage.NO_ERROR))
			return obj;
		else
			return null;
	}
	
}
