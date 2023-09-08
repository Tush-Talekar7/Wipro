	
class LogicBuilding_M2_A_1
{
  public static void main(String args[])
  {
	int n=findCode("World Wide Web");
	System.out.println("Code: "+n);
  }
  public static int findCode(String input1)
  {
	// Write code here...
        String str[]=input1.split(" ");
        String s="";
        for(int i=0;i<str.length;i++)
        {    
            s+=findSum(str[i]);
        }
        return Integer.parseInt(s);    	
	}

    public static int findSum(String s)
    {
        s=s.toUpperCase();
        int i=0,j=s.length()-1,sum=0;

        while(i<j)
        {
            Character ch=s.charAt(i);
            Character dh=s.charAt(j);

            sum+=Math.abs((int)ch-(int)dh);
            i++;
            j--;
        }
        if(i==j) sum+=(int)s.charAt(i)-64;
        return sum;
    }
}