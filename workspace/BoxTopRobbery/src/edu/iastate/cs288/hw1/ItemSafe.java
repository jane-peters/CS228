package edu.iastate.cs288.hw1;
import java.util.Arrays;


public class ItemSafe<T extends Comparable<? super T>> 
{
	int maxNum;
	T[] seedArr = (T[]) new Object[10];
	private Object isafe;
	
	public ItemSafe(int maxNum, T[] seedArr) {
		this.maxNum = maxNum;
		this.seedArr = seedArr;
		
		isafe = Arrays.copyOf(seedArr, maxNum);
	}

	public void add(T toBeAdded)
	{
		//TODO
	}
	
	public static void remove(int index)
	{
		//TODO
	}
	
	public static void getSortedArray()
	{
		//TODO
	}
	
	protected static void getIsafe()
	{
		//TODO
	}

}
