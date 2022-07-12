package com.codezone.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		int[] arreglo = {1,2,3};
		runningSum(arreglo);
		for (int i : arreglo) {
			System.out.println(i);
		}
	}

	public static int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];

		//result[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			//result[i] = result[i - 1] + nums[i];
			nums[i] += nums[i -1];
		}
		return result;

	}

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
}
