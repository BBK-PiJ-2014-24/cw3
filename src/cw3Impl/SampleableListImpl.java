package cw3Impl;

import cw3.List;
import cw3.ReturnObject;
import cw3.SampleableList;

public class SampleableListImpl implements SampleableList{

	// Fields
	// ------
	
	private List l;
	
	
	// Constructors
	// ------------
	
	public SampleableListImpl(){
		l = null;
	}
	
	
	public SampleableListImpl(List l){
		this.l = l;
	}
	
	
	
	
	// isEmpty()
	// ---------
	@Override
	public boolean isEmpty() {
		if(l.isEmpty())
			return true;
		else
			return false;
	}

	// size()
	// ------
	@Override
	public int size() {
		return l.size();
	}

	// get()
	// ------
	@Override
	public ReturnObject get(int index) {
		return l.get(index);
	}

	
	// remove()
	// --------
	@Override
	public ReturnObject remove(int index) {
		return l.remove(index);
	}


	@Override
	public ReturnObject add(int index, Object item) {
		return l.add(index, item);
	}

	// add()
	// -----
	@Override
	public ReturnObject add(Object item) {
		return l.add(item);
	}

	// sample()
	// --------
	@Override
	public SampleableList sample() {
		
		SampleableList sample = new SampleableListImpl(l);
		int length = sample.size();
		
		for(int i=length-1;i>=0;i-=2){
			sample.remove(i);
		}
		return sample;
	} // end sample

} // end class
