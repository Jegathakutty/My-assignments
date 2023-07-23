package week1.day3;
import java.util.Arrays;

public class Dublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks = {12,32,34,12,25,16,32,16,19,20};
int length = marks.length;
Arrays.sort(marks);
for(int i =0;i<=length;i++)
	if(marks[i]==marks[i+1])
	{
System.out.println(marks[i]);
	}
	}

}
