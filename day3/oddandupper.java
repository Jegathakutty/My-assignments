package week1.day3;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class oddandupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String hello = "mine";
char[] word = hello.toCharArray();
int length = word.length;
for(int i=0;i<length;i++)
{
	if(i%2 !=0)
	{
	char c = word[i];
	
		System.out.println(c);
	}
}
	}

}
