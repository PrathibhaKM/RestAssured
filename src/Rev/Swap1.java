package Rev;

public class Swap1 {
public static void main(String[] args) {
	String s="my name is prathibha";
	String[] s1 = s.split(" ");
	String first = s1[0];
	String last = s1[s1.length-1];
	String temp=" ";
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i].equals(first)||s1[i].equals(last))
		{
			
		}
			
		else
		{
			temp=temp+s1[i];
		}
	}
	String t=last+temp+first;
	System.out.println(t);
}
}
