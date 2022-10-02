package com.test;

public class Demo2 
{
	
	
	
	

	
	
public static void main(String[] args) {

int no=153;

int sum=0;

while(no>0) {
	
	int a=no%10;
	a=a*a*a;
	
	sum=sum+a;
	no=no/10;
	
}

System.out.println(sum);


}

}
