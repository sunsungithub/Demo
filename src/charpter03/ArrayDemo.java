package charpter03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k=in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n=in.nextInt();
		
		int[] numbers=new int[n];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;
		}
		
		int[] result=new int[k];
		for(int j=0;j<result.length;j++) {
			
			int r=(int)(Math.random()*n);
			result[j]=numbers[r];
			
			//move the last element int the random location
			numbers[r]=numbers[n-1];
			
			n--;
			
		}
		
		Arrays.sort(result);
		
		System.out.println("Bet the following combination. It will be make you rich!");
		//Arrays.toString()
		System.out.println(Arrays.toString(result));
		
		//Arrays.copyOf(type[] a, int length)
		int[] b =Arrays.copyOf(result, result.length);
		Arrays.toString(b);
		
		//Search  二分搜索算法查找, 如果找到值，则返回值的下标，否则返回负数
		int vIndex=Arrays.binarySearch(numbers,50 );
		System.out.println("After Arrays.binarySearch(), the index of 50 is "+vIndex);
		//或者 Arrays.binarySearch(type[] a, int startIndex, int endIndex, type v)
		
		//Arrays.fill(type[] a, type v) 将数组的所有数据元素值都设置为v
		Arrays.fill(b, 10);
		System.out.println("After Arrays.fill(). Collection b is "+Arrays.toString(b));
		
	}
	

}
