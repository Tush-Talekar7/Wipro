class LogicBuilding_M2_A_6
{
	public static void main(String args[])
	{
		int a[]={1237,462,666,140};
		int max=mostFrequentlyOccuringDigit(a,a.length);
		System.out.println(max);

	}

	public static int mostFrequentlyOccuringDigit(int[] input1,int input2)
	{
		int a[]=new int[10];
        for(int i=0;i<input1.length;i++)
        {
            int n=input1[i];
            while(n!=0)
            {
                int r=n%10;

                a[r]=a[r]+1;

                n/=10;
            }
        }
        int max=9;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>a[max]) max=i;
        }
        return max;
	}
	
}