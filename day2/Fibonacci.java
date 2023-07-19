package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f = 0;
int s = 1;
System.out.println("Fibonacci series numbers" );

for(int i=0;i<=6;++i)
{
	int sum = f + s;
	f = s;
     s = sum;
  
    
   System.out.println(f);
}
	}

}
