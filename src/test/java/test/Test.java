package test;

public class Test {	
	Test(){}	
	Test(int i, int j){}	
	public static void main(String[] args) {
		Test t1= new Test();
		Test t2= new Test(1,2);
		Test t3= new Test();
		
				
		int i=0;
		int j=1;
		
		System.out.println(i);
		System.out.println(j);	
			for(int k=0;k<6;k++)	
			{
				int l=i+j;
				System.out.println(l);
				i=j;
				j=l;				
			}			
			String str="Prateek Kanwal";			
			str =str.replace(" ", "");			
System.out.println(str);
for(char c:str.toCharArray()) {
	
	if(c!=' ') {
	System.out.print(c);
}
}
System.out.print("hello");
	}
	
	
}
