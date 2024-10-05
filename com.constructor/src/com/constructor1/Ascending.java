package com.constructor1;

import java.util.Arrays;

public class Ascending {
	public static void main(String[] args) {
		int nums[]= {3,4,5,2,6,7,7,8,89};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
