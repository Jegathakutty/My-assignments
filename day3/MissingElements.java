package week1.day3;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] test = {1,3,4,5,6,7};
Arrays.sort(test);
int length = test.length;
for(int i=0;i<length;++i)
{if(i!= test[i])
{
	System.out.println(i);
}
}
	}
}

