package old;

import cw3.List;
import cw3.ReturnObject;
import cw3.ErrorMessage;
import cw3Impl.ReturnObjectImpl;

public class LinkedListOld implements List {

	// Fields
	// ------
	private Object obj;
	private LinkedListOld nextLink;
	private static int countNodes=0;
	private ReturnObject rObj;
	private ErrorMessage m;
	
	// Constructors
	// ------------
	
	public LinkedListOld(Object obj){
		this.obj = obj;
		nextLink = null;
		countNodes++;
	}
	
	
	// getter/setter
	// -------------
	
	
	
	// isEmpty()
	// ---------
	
	@Override
	public boolean isEmpty() {

		if(obj!=null)
			return false;
		else
			if(nextLink!=null)
				nextLink.isEmpty();
			else
				return true;
		return false;
	} // end isEmpty

	
	// Size()
	// ------
	
	@Override
	public int size() {
		return countNodes;
	}
	
	// get()
	// -----
	
	@Override
	public ReturnObject get(int index) {
		if(index > countNodes+1 || index < 0){
			m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		else{
			LinkedListOld l = this;
			for(int i=0;i<index;i++){
				l = l.nextLink;
			}
			Object o = l.obj;
			m = ErrorMessage.NO_ERROR;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}	
	} // end get()
	
	// remove()
	// --------

	@Override
	public ReturnObject remove(int index) {
		if(index > countNodes+1 || index < 0){
			m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			Object o = null;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
		else{
			rObj = get(index);
			LinkedListOld l = this;
			for(int i=0;i<index-2;i++){
				l = l.nextLink;
			}
			l.nextLink=l.nextLink.nextLink;	
			return rObj;
		}
	}

	// add(index, Object)
	// ------------------
	@Override
	public ReturnObject add(int index, Object item) {
		if(item==null){
			m = ErrorMessage.EMPTY_STRUCTURE;
			rObj = new ReturnObjectImpl(item, m);
			return rObj;
		}
		if(index > countNodes+1 || index < 0){
			m = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			rObj = new ReturnObjectImpl(item,m);
			return rObj;
		}
		else{
			LinkedListOld n = new LinkedListOld(item);
			LinkedListOld l = this;
			for(int i=0;i<index-1;i++){
				l = l.nextLink;
			}
			n.nextLink = l.nextLink;
			l.nextLink = n;
			Object o = null;
			m = ErrorMessage.NO_ERROR;
			rObj = new ReturnObjectImpl(o,m);
			return rObj;
		}
	} // end add()

	
	// add(Object)
	// -----------
	@Override
	public ReturnObject add(Object item) {
		if(item==null){
			m = ErrorMessage.EMPTY_STRUCTURE;
			rObj = new ReturnObjectImpl(item, m);
			return rObj;
		}
		if(nextLink==null){
			nextLink = new LinkedListOld(item);
			m = ErrorMessage.NO_ERROR;
			Object o = null;
			rObj = new ReturnObjectImpl(o, m);
			return rObj;
		}
		else
			nextLink.add(item);
		return null;
	} // end add()

} // end Class
