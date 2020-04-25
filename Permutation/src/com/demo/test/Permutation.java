package com.demo.test;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	
	public int solution(int[] A, int N) {
		if(A.length != N) {
			return 0;
		}
		
		Set<Integer> intSet = new HashSet<>();
		for(int i = 0; i < A.length; i++) {
			intSet.add(A[i]);
		}
		
		for(int j = 1; j <= N; j++) {
			if(!intSet.contains(j)) {
				return 0;
			}
		}
		
		return 1;
	}
	
	public static void main(String args[]) {
		Permutation pm = new Permutation();
		int[] arr1 = {2, 4, 1, 5, 6};
		System.out.println(pm.solution(arr1, arr1.length));
		int[] arr2 = {1, 4, 2, 5, 6, 3, 7};
		System.out.println(pm.solution(arr2, arr2.length));
	}
}
