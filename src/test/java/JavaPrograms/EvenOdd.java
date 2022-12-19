package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOdd {
	
	
	public static List<Integer> sumof(int num)
	{
		System.out.println(num);
		List<Integer> evenlist=new ArrayList<Integer>();
		List<Integer> oddlist=new ArrayList<Integer>();
		List<Integer> sumlist=new ArrayList<Integer>();
		
	int evensum=0;
	int oddsum=0;
	int j=0;
	int k=0;
		while(num>0)
		{
			
		int n=num%10;
		
		num=num/10;
		
		if(n%2==0)
		{
		

			evenlist.add(n);
			evensum=evensum+evenlist.get(j);
			j++;
		}
		else
		{
			oddlist.add(n);
			oddsum=oddsum+oddlist.get(k);
			k++;
		
		}
		}
		sumlist.add(evensum);
		sumlist.add(oddsum);
		System.out.println(sumlist);
		return sumlist;
		
	}
	@Test
	public void testrun()
	{
		int num=1234;
		Integer[] n= {6,4};
		//String[] s1= {"asd","sdf"};
	//	List<String> actuallist=new ArrayList<String>(Arrays.asList(s1));
		List<Integer> expectedlist=new ArrayList<Integer>(Arrays.asList(n));
		List<Integer> actuallist=new ArrayList<Integer>();
		
		actuallist=sumof(num);
		Assert.assertEquals(actuallist,expectedlist);
	}
	
	@Test
	public void testrun1()
	{
		int num=552245;
		Integer[] n= {8,15};
		List<Integer> expectedlist=new ArrayList<Integer>(Arrays.asList(n));
		List<Integer> actuallist=new ArrayList<Integer>();
		actuallist=sumof(num);
		Assert.assertEquals(actuallist,expectedlist);
	}

}
