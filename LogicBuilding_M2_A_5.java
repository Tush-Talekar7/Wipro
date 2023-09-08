class LogicBuilding_M2_A_5
{

	static class Result
	{
		final int output1,output2;

		public Result(int out1,int out2)
		{
			output1=out1;
			output2=out2;
		}
	}
	public static void main(String args[])
	{
        int a[]={56,43,24,36,22,1,0};
		Result rs=decreasingSequence(a,a.length);
		System.out.println(rs.output1+" "+rs.output2);

	}

	public static Result decreasingSequence(int[] input1,int input2)
	{
		int cnt=0,a=0,max=0;
        boolean flag=false;
        for(int i=0;i<input1.length-1;i++)
        {
            if(input1[i]>input1[i+1])
            {
                if(flag==false)
                {
               
                    cnt++;
                    flag=true;
                }
                a++;
                max=Math.max(max,a);
            }
            else
            {
                
                flag=false;
                a=0;
            }
        }
        if(cnt!=0) max+=1;

        Result rs=new Result(cnt,max);
        return rs;
        
    }
}
