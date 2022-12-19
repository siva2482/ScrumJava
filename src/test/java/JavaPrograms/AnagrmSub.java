package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AnagrmSub {
	
	
	public static List<Integer> findAnagram(String str,String ptr)
	{
		char[] strch=str.toCharArray();
		char[] ptrch=ptr.toCharArray();
		char[] substr=new char[ptr.length()];
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<strch.length && (i+ptr.length()<strch.length);i++)
		{
			System.arraycopy(strch, i, substr, 0,ptr.length());
			Arrays.sort(ptrch);
			Arrays.sort(substr);
			if(Arrays.equals(ptrch,substr))
			{
				list.add(i);
			}
			
		}
		System.out.println(list);
		return list;
	}
	
	
	@Test
	public static void testrun1()
	{
		
		String str="cabebabacd";
		String ptr="abc";
		List<Integer> list1=new ArrayList<Integer>();
		list1=findAnagram(str,ptr);
	}
	
	@Test
	public static void testrun2()
	{
		
		String str="eeeeehgtji";
		String ptr="abc";
		List<Integer> list1=new ArrayList<Integer>();
		list1=findAnagram(str,ptr);
	}
	@Test
	public static void testrun3()
	{
		
		String str="abadb";
		String ptr="ab";
		List<Integer> list1=new ArrayList<Integer>();
		list1=findAnagram(str,ptr);
	}


}
