package com.demo.test;

import java.util.Arrays;

public class ArrayRotate {
	
	public int[] solution(int[] A, int N, int K) {
		int realK = K % N;
		//Rotate the given array by realK times toward right    
        for(int i = 0; i < realK; i++)  {        
            //Stores the last element of array    
            int last = A[N - 1];           
            for(int j = N - 1; j > 0; j--){    
                //Shift element of array by one    
                A[j] = A[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            A[0] = last;    
        }
        return A;
	}
	
	public static void main(String args[]) {
		ArrayRotate ar = new ArrayRotate();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("original array: " + Arrays.toString(arr));
		System.out.println("rotated array: " + Arrays.toString(ar.solution(arr, arr.length, 3)));
	}
}
