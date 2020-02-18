package practice;

public class findDuplicate {

	public String removeDuplicate(String s) {
		char ch[]=s.toCharArray();
		String str="";
		//String s1="";
		
		
		int j=0;
		int count=0;
		
		loop1:for(int i=0;i<s.length();i++) {
			loop2:for(int k=0;k<str.length();k++) {
			if(ch[i]==str.charAt(k)) {
				//System.out.println(ch[i]);
				int index=i;
				System.out.println(i);
				continue loop1;
			}
			else {
				continue loop2;
			}
			
			
		}
		str = str+ch[i];
	}	
				return str;
}
		
		
		
	

public static void main(String []args)
	{
	findDuplicate d=new findDuplicate();
	System.out.println("--------");
	System.out.println(d.removeDuplicate("abcdefga"));
}
}
