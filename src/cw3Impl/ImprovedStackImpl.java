package cw3Impl;

import cw3.List;
import cw3.ImprovedStack;
import cw3.ReturnObject;

public class ImprovedStackImpl implements ImprovedStack, Cloneable {

	// Fields
	// ------
	
	List l;
	
	// Constructor
	// ------------
	
	public ImprovedStackImpl(List l){
		this.l = l;
	}
	
	
	// isEmpty()
	// ---------
	
	@Override
	public boolean isEmpty() {
		return l.isEmpty();
	}

	// size()
	// ------
	
	@Override
	public int size() {
		return l.size();
	}

	// push()
	// ------
	@Override
	public void push(Object item) {
		l.add(item);
	}

	// top()
	// -----
	@Override
	public ReturnObject top() {
		int topStack = size() - 1;
		return l.get(topStack);
	}

	
	// pop()
	// -----
	@Override
	public ReturnObject pop() {
		int topStack = size() - 1;
		return l.remove(topStack);
	}

	
	// reverse()
	// ---------
	@Override
	public ImprovedStack reverse() {
		
		List m = new ArrayList();   // Need to instantiate own new List
		
		for(int i=size()-1;i>=0;i--){
			Object o = l.get(i).getReturnValue();
			m.add(o);
		}
		ImprovedStackImpl copy = new ImprovedStackImpl(m);
		return copy;
	} // end reverse

	
	// remove()
	// --------
	@Override
	public void remove(Object object) {
		
		for(int i=0; i<l.size();i++){
			Object o = l.get(i).getReturnValue();
			if(object.equals(o))
				l.remove(i);
		} // end loop
		
	} // end remove
	
} // end class
