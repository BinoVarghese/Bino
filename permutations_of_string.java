import java.util.*;
class permutations_of_string
{
  public static ArrayList<String> MET(String str) 
  {
      /* write your solution here */
      ArrayList<String> myList = new ArrayList<String>();
      ArrayList<String> myList1 = new ArrayList<String>();
      String s=Character.toString(str.charAt(0))+Character.toString(str.charAt(1));
      String s1 = Character.toString(str.charAt(1))+Character.toString(str.charAt(0));
      myList.add(s);
      myList.add(s1);
      for(int i = 2;i < str.length();i++){
          Iterator<String> itr = myList.iterator();
          while(itr.hasNext()){
              String k = itr.next();                        
              for(int m = 0;m<=k.length();m++){
                  String l=k;
                  l=new StringBuilder(l).insert(m,str.charAt(i)).toString();                  
                  myList1.add(l);
              }
              itr.remove();
          }
          myList.clear();
          for(String p : myList1){
              myList.add(p);
          }
          myList1.clear();
      }
      Collections.sort(myList);
      return myList;
  }
  public static void main(String args[])
  {
  		permutations_of_string p1=new permutations_of_string();
  		System.out.println("Enter any string : ");
  		Scanner s=new Scanner(System.in);
  		String b=s.nextLine();
  		ArrayList<String> res = new ArrayList<String>();
  		res=p1.MET(b);
  		System.out.println("\nThe possible permutations of "+b+" are : \n);
  		for(String g:res)
  		{
  			System.out.print(g+" ");
  		}
  }
}
