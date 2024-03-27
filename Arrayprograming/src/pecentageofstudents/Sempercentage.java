package pecentageofstudents;

import java.util.Scanner;

public class Sempercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of sem");
int sem=sc.nextInt();
float percentage=sc.nextFloat();
float []arr=new float[sem];

for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the percentage in sem"+(i+1)+"is");
arr[i]=sc.nextFloat();
	
}
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("the percentage in sem "+i+"is"+arr[i]);
}
	
}

}
