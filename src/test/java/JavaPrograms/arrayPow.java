package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class arrayPow {
	
	public static double max_pow=0;
	public static int[] max_arr=new int[3];
	static int count=0;
	public static void maxpow(int[] num)
	{
		
		List<Integer> list=new ArrayList<Integer>();
		//int[] perm_num=new int[num.length];
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<num.length-1;i++)
		{
		double	temp_pow= Math.pow(num[i+1],num[i]);
		
		System.out.println(temp_pow);
		if(temp_pow>max_pow)
		{
			max_pow=temp_pow;
			max_arr=num.clone();
			
		}
		}
	//	int[] perm=num;

		
		
	}
	public static void swap(int[] num,int x,int y)
	{
		int temp=num[x];
			num[x]=num[y];
			num[y]=temp;
			
			maxpow(num);
	}
		
		
	
	@Test
	public void run1()
	{
		int[] num= {2,1,3};
		while(count<=3)
		{
			for(int i=0;i<num.length-1;i++)
			{
				swap(num,i,i+1);
				count++;
			}
			
		}
		System.out.println("MAXIMUN POWER: "+max_pow);
		System.out.println("FOR PERMUTATION: "+Arrays.toString(max_arr));

}
	
	
	
	@Test
	public void run2()
	{
		int j=0;
		int[] ARR= {4,5,6};
		while(j<=3)
		{
			for(int i=0;i<ARR.length-1;i++)
			{
				swap(ARR,i,i+1);
				j++;
			}
			
		}
		System.out.println("MAXIMUN POWER: "+max_pow);
		System.out.println("FOR PERMUTATION: "+Arrays.toString(max_arr));
}
}
