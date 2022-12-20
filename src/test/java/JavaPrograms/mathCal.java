package JavaPrograms;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class mathCal {
	
	
	public static int mathVal(String s)
	{
		int result=0;
		int signindex=0;
		int equalindex=0;
		
		for(int i=0;i<s.length();i++)
		{
			int index=s.indexOf('x');
			
			if(s.charAt(index-1)=='=')
			{

				if(s.contains("+"))
				{
					 signindex=s.indexOf("+");
					int s1=Integer.parseInt(s.substring(0,signindex));
					int s2=Integer.parseInt(s.substring(signindex+1,index-1));
					result=s1+s2;
				}
				if(s.contains("-"))
				{
					 signindex=s.indexOf("-");
					int s1=Integer.parseInt(s.substring(0,signindex));
					int s2=Integer.parseInt(s.substring(signindex+1,index-1));
					result=s1-s2;
				}
				if(s.contains("*"))
				{
					 signindex=s.indexOf("*");
					int s1=Integer.parseInt(s.substring(0,signindex));
					int s2=Integer.parseInt(s.substring(signindex+1,index-1));
					result=s1*s2;
				}
				if(s.contains("/"))
				{
					 signindex=s.indexOf("/");
					int s1=Integer.parseInt(s.substring(0,signindex));
					int s2=Integer.parseInt(s.substring(signindex+1,index-1));
					result=s1/s2;
				}
			}
			else
			{
				if(s.contains("+"))
				{
					 signindex=s.indexOf("+");
					 equalindex=s.indexOf("=");
					if(index>signindex)
					{
						int coeeff=Integer.parseInt(s.substring(signindex+1,index));
						int s1=Integer.parseInt(s.substring(0,signindex));
						int s2=Integer.parseInt(s.substring(equalindex+1));
						int tempresult=s2-s1;
						 result=tempresult/coeeff;
						
					}
					else
					{
						int coeeff=Integer.parseInt(s.substring(0,index));
						int s1=Integer.parseInt(s.substring(signindex+1,equalindex));
						int s2=Integer.parseInt(s.substring(equalindex+1));
						int tempresult=s2-s1;
						 result=tempresult/coeeff;	
					}
				}
					if(s.contains("-"))
					{
						 signindex=s.indexOf("-");
						 equalindex=s.indexOf("=");
						if(index>signindex)
						{
							int coeeff=Integer.parseInt(s.substring(signindex+1,index));
							int s1=Integer.parseInt(s.substring(0,signindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s1-s2;
							 result=tempresult/coeeff;
							
						}
						else
						{
							int coeeff=Integer.parseInt(s.substring(0,index));
							int s1=Integer.parseInt(s.substring(signindex+1,equalindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s2+s1;
							 result=tempresult/coeeff;	
						}
				}
					if(s.contains("*"))
					{
						 signindex=s.indexOf("*");
						 equalindex=s.indexOf("=");
						if(index>signindex)
						{
							int coeeff=Integer.parseInt(s.substring(signindex+1,index));
							int s1=Integer.parseInt(s.substring(0,signindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s2/s1;
							 result=tempresult/coeeff;
							
						}
						else
						{
							int coeeff=Integer.parseInt(s.substring(0,index));
							int s1=Integer.parseInt(s.substring(signindex+1,equalindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s2/s1;
							 result=tempresult/coeeff;	
						}
				}
					if(s.contains("/"))
					{
						 signindex=s.indexOf("/");
						 equalindex=s.indexOf("=");
						if(index>signindex)
						{
							int coeeff=Integer.parseInt(s.substring(signindex+1,index));
							int s1=Integer.parseInt(s.substring(0,signindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s1/s2;
							 result=tempresult/coeeff;
							
						}
						else
						{
							int coeeff=Integer.parseInt(s.substring(0,index));
							int s1=Integer.parseInt(s.substring(signindex+1,equalindex));
							int s2=Integer.parseInt(s.substring(equalindex+1));
							int tempresult=s1*s2;
							 result=tempresult/coeeff;	
						}
				}
				
			}
			}
		
		System.out.println(result);
		return result;
	}
	
	@Test
	public void run1()
	{
		String s1="44-2x=14";
		int x=mathVal(s1);
		Assert.assertEquals(15, x);
	}
	
	
	@Test
	public void run2()
	{
		String s1="3x+13=46";
		int x=mathVal(s1);
		Assert.assertEquals(11, x);
	}
	
	@Test
	public void run3()
	{
		String s1="3x*2=36";
		int x=mathVal(s1);
		Assert.assertEquals(6, x);
	}
	
	@Test
	public void run4()
	{
		String s1="7-3=x";
		int x=mathVal(s1);
		Assert.assertEquals(4, x);
	}
	 
	
	@Test
	public void run5()
	{
		String s1="7x/3=7";
		int x=mathVal(s1);
		Assert.assertEquals(3, x);
	}


}
