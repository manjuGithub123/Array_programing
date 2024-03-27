package heightofplayers;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter num of teams");
int team=sc.nextInt();
System.out.println("enter num of players");
int players=sc.nextInt();
String [][] arr=new String[2][3];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.println("enter the team"+(i+1)+"having player height"+(j+1)+"is");
		arr[i][j]=sc.next();
	}
}
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.println("the team"+(i+1)+"of player"+(j+1)+"height is"+(arr[i][j]));
	}
}
	}

}
