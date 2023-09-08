class LogicBuilding_M2_A_7
{
	public static void main(String args[])
	{

		int n=sumOfPowerOfDigits(587799);
		System.out.println(n);

	}

	public static int sumOfPowerOfDigits(int input1)
	{
		int n=0,sum=0;
        while(input1!=0)
        {
            int r=input1%10;

            sum+=(int)Math.pow(r,n);
            n=r;
            input1/=10;
        }
        return sum;    
	}
	
}