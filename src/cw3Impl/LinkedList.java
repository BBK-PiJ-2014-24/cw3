package cw3Impl;

import cw3.ErrorMessage;
import cw3.List;
import cw3.ReturnObject;

public class LinkedList implements List{
	// Fields
	// ------
	
		protected int countNodes;
		protected ReturnObject rObj;
		protected ErrorMessage m;
		protected Node head;
		
		// LinkedList Constructors
		// -----------------------
		public LinkedList(){
			head = new Node();
			countNodes = 0;
		}
		
		// Inner Class!
		// ============
		class Node{
			
			protected Object obj;
			protected Node nextLink;
			
			public Node(){
				obj = null;
				nextLink = null;
			}
			
			public Node(Object o){
				obj = o;
				nextLink = null;
			}
		}
		
		// isEmpty()
		// ---------
		
		@Override
		public boolean isEmpty() {	
			if(head==null)
				return false;
			else
				return true;
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
				Node n = head;
				for(int i=0;i<index;i++){
					n = n.nextLink;
				}
				Object o = n.obj;
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
			else if(index==0){
				rObj = get(index);
				head = head.nextLink;
				countNodes--;
				return rObj;
			}
			else{
				rObj = get(index);
				Node n = head;
				if(index>0){		
					for(int i=0;i<index-1;i++){
						n = n.nextLink;
					}
				}
				n.nextLink=n.nextLink.nextLink;	
				countNodes--;
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
			else if(index ==0){
				Node newHead = new Node(item);
				newHead.nextLink = head;
				head = newHead;
				countNodes++;
				Object o = null;
				m = ErrorMessage.NO_ERROR;
				rObj = new ReturnObjectImpl(o,m);
				return rObj;
			}
			else{
				Node n2 = new Node(item);
				Node n1= head;
				Node n3 = head;
				for(int i=0;i<index;i++){
					n1 = n3;
					n3 = n3.nextLink;
				}
				n1.nextLink = n2;
				n2.nextLink = n3;
				countNodes++;
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
			rObj = add(countNodes, item);
			return rObj;
			/*		if(item==null){
				m = ErrorMessage.EMPTY_STRUCTURE;
				rObj = new ReturnObjectImpl(item, m);
				return rObj;
			}
			
			Node n = head;
			while(n.nextLink!=null){
				n = n.nextLink;
			}
			n.nextLink = new Node(item);
			m = ErrorMessage.NO_ERROR;
			Object o = null;
			rObj = new ReturnObjectImpl(o, m);
			return rObj;	*/
		} // end add()

}
