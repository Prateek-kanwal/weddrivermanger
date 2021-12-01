package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="Prateek Kanwal automation tester";

		test=test.replaceAll(" ","");

		String[] str=test.split("");

		List<String> list=new ArrayList<String>(Arrays.asList(str));

		Set<String> set=new HashSet<String>(list);

		for(String cha:set)
		{
		System.out.println("the Frequency of "+cha +" is " + Collections.frequency(set,cha));


		}
	}

}
