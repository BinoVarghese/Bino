import java.util.*;
public class frequency_of_each_character
{
	public static void main(String args[])
	{
		int i;
		int a[]=new int[26];
		String st;
		System.out.println("Enter any string : ");
		Scanner s=new Scanner(System.in);
		st=s.nextLine();
		for(i=0;i<st.length();i++)
		{
			if(st.charAt(i)>=65&&st.charAt(i)<=90)
			{
				a[st.charAt(i)-65]++;
			}
			else if(st.charAt(i)>=97&&st.charAt(i)<=122)
			{
				a[st.charAt(i)-97]++;
			}
		}
		System.out.println("\nFREQUENCY OF EACH CHARACTER IS AS FOLLOWS\n");
		for(i=0;i<26;i++)
		{
			if(a[i]>0)
				System.out.println((char)(i+65)+" "+a[i]);
		}
	}
}