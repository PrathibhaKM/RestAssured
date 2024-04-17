package Rev;

public class Occuranceofnumber {
public static void main(String[] args) {
	int i1=732864247;
	String a=String.valueOf(i1);
	//String a="sdhehfhs";
	 char[] ch = a.toCharArray();
	 boolean[] b=new boolean[ch.length];
	 for(int i=0;i<ch.length;i++)
	 {if(b[i]==false)
	 {
		 
		 int c=1;
		 for(int j=i+1;j<ch.length;j++)
		 {
			 if(ch[i]==ch[j])
			 {
				 c++;
				 b[j]=true;
			
			 }
		 }
		 System.out.println(ch[i]+"-->"+c);
	 }
}}
}
