class LogicBuilding_M2_A_4
{
   static  class Result
    {
        final int a,b;
        Result (int p,int q)
        {
            a=p;
            b=q;
        }
    }
    public static void main(String[] args) 
    {
      int a[]={10,23,43,12,3};
      Result rs=findArray(a,a.length); 
      System.out.println(rs.a+" "+rs.b); 
    }
	
	public static Result findArray(int input1[],int input2)
	{
		 for(int i=input1.length-2;i>=0;i--)
        {
            input1[i]=input1[i]-input1[i+1];
        }
        int s=0;
        for(int i=0;i<input1.length;i++)
        {
            s+=input1[i];
        }
        Result rs=new Result(input1[0],s);
        return rs;
	}
}