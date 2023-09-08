

class LogicBuilding_M2_A_2
{
  public static void main(String args[])
  {
    int n=findCode("Wipro Technologies");
    System.out.println("Code: "+n);
  }
  public static int findCode(String input1)
  {
        String str[]=input1.split(" ");
        int sum=0;
        for(int i=0;i<str.length;i++)
        {
            sum+=str[i].length();
        }
        
        return findSum(sum);
	}

    public static int findSum(int n)
    {
        while(true)
        {
            n=findDigitSum(n);
            if(n<=9) return n;
        }
    }

    public static int findDigitSum(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }

}