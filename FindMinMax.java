package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {22, 3981, -19, 82, 0, 45, 37};
Arrays.sort(nums);
int length2 = nums.length;
for(int i=0;i<= nums.length-1;i++)
	System.out.println(nums[i]);
System.out.println("The min value is "+nums[0]);
System.out.println("The max value is "+nums[length2-1]);
	}

}
