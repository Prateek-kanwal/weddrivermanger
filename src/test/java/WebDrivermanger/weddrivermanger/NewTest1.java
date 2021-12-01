package WebDrivermanger.weddrivermanger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
	  String st="Prateek is automation";
	  String[] strSplit = st.split("");
	  List<String> list =new ArrayList<String>(Arrays.asList(strSplit));  
	  Set<String> set = new HashSet<String>(list);
      for (String s : set)
          System.out.println(s + ": " + Collections.frequency(set, s));
  }
  
  
  @Test
  public void f1() {
	  
	  ArrayList<String> names = new ArrayList<>(Arrays.asList("Bob", "Mary", "Dim", "Bob", "Bim", "Bob", "Mary"));
	  Set<String> set = new HashSet<String>(names);
      for (String s : set)
          System.out.println(s + ": " + Collections.frequency(names, s));
      
      for (String element : set){
    	    if (element.startsWith("B")){
    	        System.out.println(element);
    	    }
    	}
      
  }
}
