package backlogs;

import java.util.Scanner;

public class Numberofbacklogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the num of sem");
int sem=sc.nextInt();
int arr[]=new int[sem];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("do u have any backlogs in"+(i+1));

boolean res=sc.nextBoolean();
if(res==true)
{
	System.out.println("enter the num of backlogs in sem"+(i+1)+"is");
			arr[i]=sc.nextInt();
}
else
{
	arr[i]=0;
}}
	


for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("backlogs in sem"+(i+1)+"is"+arr[i]);
}
}
}