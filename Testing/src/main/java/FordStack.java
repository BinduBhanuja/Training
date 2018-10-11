

import java.util.List;

public class FordStack<T> implements Stack<T>{

	private T[] data = (T[]) new Object[5];
	private int count=0;
	
	public T getData(T i) {
		return data[(int) i];
	}

	public void setData(T[] data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
		this.data[count++]=data;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return data[--count];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	
	public static Number getSum(List<? extends Number> list)
	{
		double sum = 0.0;
		for(Number number : list)
		{
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Stack<Integer> fs = new FordStack();  //Better to use the contract on the left side
		fs.push(10);
		fs.push(20);
		System.out.println("Size : "+ fs.size());
		System.out.println(fs.pop());
	}

}
