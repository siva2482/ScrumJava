package JavaPrograms;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class maxarray {
	
	public static int[] maximunOf(int[] num)
	{
		if(num.length==1||num.length==0)
			
		{
			return num;
		}
		else
		{
		int n=0;
		while(n<num.length)
		{
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]<num[i+1])
         {
	int temp=num[i];
	num[i]=num[i+1];
	num[i+1]=temp;
          }
			n++;
		}
		
	}
		}
		System.out.println(Arrays.toString(num));
		return num;
	}
	
	@Test
	public void run1()
	{
		int[] num= {4,5,6};
		int[] expected= {6,5,4};
		int[] result=maximunOf(num);
		Assert.assertEquals(result, expected);
	}
	
	@Test
	public void testrun2()
	{
		int[] num1= {1,2};
		int[] expected= {2,1};
		int[] result=maximunOf(num1);
		Assert.assertEquals(result, expected);
	}
	@Test
	public void testrun3()
	{
		int[] num1= {1};
		int[] expected= {1};
		int[] result=maximunOf(num1);
		Assert.assertEquals(result, expected);
	}
	
	@Test
	public void testrun4()
	{
		int[] num1= {};
		int[] expected= {};
		int[] result=maximunOf(num1);
		Assert.assertEquals(result, expected);
	}


}
