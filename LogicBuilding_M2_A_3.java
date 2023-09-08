

class LogicBuilding_M2_A_3
{
  public static void main(String args[])
  {
    String str=findSum("1256","56");
    System.out.println("Addtion: "+str);
  }
  public static String findSum(String input1,String input2)
  {
        int len_1=input1.length();
        int len_2=input2.length();
        if(len_1<len_2)
        {
            for(int i=0;i<len_2-len_1;i++)
                input1="0"+input1;
        }
         else
        {
            for(int i=0;i<len_1-len_2;i++)
                input2="0"+input2;    
        }
        int remainder=0,sum=0;
        String result="";

        for(int i=input1.length()-1;i>=0;i--)
        {
            Character ch=input1.charAt(i);
            Character dh=input2.charAt(i);
            int n=ch-'0';
            int m=dh-'0';

            sum=n+m+remainder;
            result+=sum%10;
            remainder=sum/10;
        }
        if(remainder!=0) result+=remainder;
        return reverse(result);
		
	}

    public static String reverse(String str)
    {
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
         rev+=str.charAt(i);

         return rev;
    }
}