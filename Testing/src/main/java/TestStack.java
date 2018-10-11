import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStack {

	@Test	
	public void testPush()
	{
		Stack<Integer> fs = new FordStack();
		fs.push(new Integer(10));
		Integer i = ((FordStack<Integer>) fs).getData((((FordStack<Integer>)fs).getCount())-1);
		assertEquals((Integer) 10, i);
	}
	
	@Test
	public void testPop()
	{
		Stack<Integer> fs = new FordStack();
		fs.push(new Integer(10));
		fs.push(new Integer(20));
		int i = fs.pop();
		assertEquals(20, i);
		
		int j = ((FordStack<Integer>)fs).getCount();
		assertEquals(1, j);
	}
	
	@Test
	public void testEmpty()
	{
		Stack<Integer> fs = new FordStack();
		fs.push(new Integer(10));
		int i = fs.pop();
		boolean b = fs.isEmpty();
		assertEquals(true, b);
	}
	
	@Test
	public void testSize()
	{
		Stack<Integer> fs = new FordStack();
		fs.push(new Integer(10));
		fs.push(new Integer(20));
		int i = fs.size();
		assertEquals(2, i);
	}
}
