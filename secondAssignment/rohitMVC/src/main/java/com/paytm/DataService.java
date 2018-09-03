package com.paytm;

public interface DataService <E , I> {

	void remove(I id);
	void add(E emp);
	void view();	
}
