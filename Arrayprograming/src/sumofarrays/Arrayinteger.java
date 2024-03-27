package sumofarrays;

import java.util.Scanner;

public class Arrayinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of arrays");
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the sum value"+(i+1));
	arr[i]=sc.nextInt();
	
}
int sum=0;
for(int i=0;i<=arr.length-1;i++)
{
	sum=sum+arr[i];
	System.out.println(sum);
}
	}

}
