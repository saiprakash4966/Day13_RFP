package com.bl;

public class MaxValue
{
	
	 
			// determines MaxValue 
		  public static <S extends Comparable<S>> S maximum(S a, S b, S c) 
		  {
		    S max = a; //  a is  Max

		    if (b.compareTo(max) > 0)
		      max = b; // b is Big

		    if (c.compareTo(max) > 0)
		      max = c; // c is Max

		    return max; // returns Max value
		  } // end Max method

		  public static void main(String args[]) 
		  {
		    System.out.printf("MaxValue of  string of %s, %s and %s is %d\n\n", "Apple", "Peach","Banana", maximum("Apple", "Peach", "Banana"));
		   
		  }
		}

