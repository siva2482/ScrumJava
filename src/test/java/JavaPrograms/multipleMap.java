package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class multipleMap {

	
	public static void multiValue(String key,ArrayList<String> list)
	{
		Map<String,ArrayList<String>> hmap=new HashMap<String,ArrayList<String>>();
		 hmap.put(key,list);
		 System.out.println(hmap);
		
	}
	
	@Test
	public void run1()
	{
		String k="fruit";
		String[] s= {"apple","mango"};
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(s));
		multiValue(k,list);
	}
	
	@Test
	public void run2()
	{
		String k="car";
		String[] s= {"ford","honda","benz"};
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(s));
		multiValue(k,list);
	}
}
