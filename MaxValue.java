package com.bl;

public class MaxValue
{
	
	 
			public static void main(String[] args) 
			{

				Integer aI = 10, bI = 20, cI = 30;
				Float aF = 2.2f, bF = 3.6f, cF = 7.3f;
				String aS = "Apple", bS = "Peach", cS = "Banana";

				/*
				 * calling methods for finding Maximum
				 */
				
				
				testMaximum(aI,bI,cI);
				testMaximum(aF,bF,cF);
				testMaximum(aS,bS,cS);
			}

			/*
			 * Generic method of Type Integer,Float,String for finding maximum of 3
			 */
			private static <S extends Comparable<S>> S testMaximum(S a, S b, S c)
			{
				S max;
				if (a.compareTo(b) == 1 && a.compareTo(c) == 1) {
					max = a;
				} else if (b.compareTo(a) == 1 && b.compareTo(c) == 1) {
					max = b;
				} else {
					max = c;
				}
				printMax(a, b, c, max);

				return max;
			}

			public static <T> void printMax(T x, T y, T z, T max) {
				System.out.printf("max of %s,%s and %s is :- %s\n", x, y, z, max);
			}

		  
		  
		}

