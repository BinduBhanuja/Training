package com.ford.generics;

public interface Stack<T> {

	void push(T data);
	T pop();
	boolean isEmpty();
	int size();
}
