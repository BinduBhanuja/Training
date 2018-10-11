package com.ford.generics;

class Generics1 {
	
	public <T> T print(T value)
	{
		System.out.println(String.valueOf(value));
		return value;
	}	
}

class TwoGenerics<T1, T2> {
	
	private T1 data1;
	private T2 data2;   // Generics variables cannot be static
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	public void print1() {
		System.out.println("T1 : "+ String.valueOf(data1) + " T2 : "+ String.valueOf(data2));
	}
	
}
public class Generics<T> {

	private T data;
	
	public void setData(T data)
	{
		this.data=data;
	}
	public T getData()
	{
		return data;
	}
	public static <T3> void staticMethod(T3 t3)  //cannot use T1,T2
	{
		System.out.println(t3);
	}
	public static void main(String[] args)
	{
		Generics genericsN = new Generics();    //Generalized
		
		Generics<Integer> generics = new Generics<Integer>();  //Specified for integers class only
		generics.setData(new Integer(10));
		System.out.println(generics.getData());
		
		Generics<String> test = new Generics<String>();  //Specified for String class only
		test.setData(new String("10"));
		System.out.println(test.getData());
		
		System.out.println(generics.getClass());   //prints which class generics belongs to
		
		genericsN.setData(10);
		Object dataN1 = generics.getData();
		System.out.println(dataN1.getClass());
		
		genericsN.setData("10");
		Object dataN2 = generics.getData();
		System.out.println(dataN2.getClass());
		
		Generics1 generics1 = new Generics1();
		Object G1 = generics1.print("Inside generics method");  //Generics method, not generic class
		System.out.println(G1.getClass());
		
		TwoGenerics<Integer, String> twoGenerics = new TwoGenerics();
		twoGenerics.setData1(10);
		twoGenerics.setData2("Bindu");
		twoGenerics.print1();
		
		Generics.staticMethod("10 string");
		
	}
	
}


