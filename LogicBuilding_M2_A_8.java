class LogicBuilding_M2_A_8
{
    public static void main(String args[])
    {
        int n=sumofSumOfDigits(567686);
        System.out.println(n);
    }
    public static int sumofSumOfDigits(int input1)
    {
        input1=reverse(input1);

        int sum=0;
        while(input1!=0)
        {
            sum+=digitSum(input1);
            input1/=10;
        }
        return sum;	
	}
    public static int reverse(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        return s;
    }
    public static int digitSum(int n)
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