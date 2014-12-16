package cw3Impl;

import cw3.AbstractStack;
import cw3.List;
import cw3.ReturnObject;


public class StackImpl extends AbstractStack{

	public StackImpl(List list) {
		super(list);
	}

	@Override
	public boolean isEmpty() {
		return super.internalList.isEmpty();
	}

	@Override
	public int size() {
		return super.internalList.size();
	}

	@Override
	public void push(Object item) {
		super.internalList.add(item);
	}

	@Override
	public ReturnObject top() {
		int topList = super.internalList.size() - 1; 
		return super.internalList.get(topList);
	}

	@Override
	public ReturnObject pop() {
		int topList = super.internalList.size() - 1; 
		return super.internalList.remove(topList);
	}
}  // end class
