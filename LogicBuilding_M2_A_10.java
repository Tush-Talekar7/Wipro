class LogicBuilding_M2_A_10
{

        static class Result
        {
            String output1,output2,output3;
            public  Result(String input1,String input2,String input3)
            {

                output1=input1;
                output2=input2;
                output3=input3;

            }
        }
    public static void main(String args[])
    {
        
        Result rs=encodeThreeString("John","Johny","janaradhan");

        System.out.println(rs.output1+" "+rs.output2+" "+rs.output3);
    }

    public static Result encodeThreeString(String input1,String input2,String input3)
    {
        String a="",b="",c="";

        String str[]={input1,input2,input3};
        for(int i=0;i<str.length;i++)
        {
            String s=str[i];
            int n=s.length();
            if(n%3==2)
            {
                int k=n/3;
                a+=s.substring(0,k+1);
                b+=s.substring(k+1,n-k-1);
                c+=s.substring(n-k-1,n);
            }
            else
            {
                int k=n/3;
                a+=s.substring(0,k);
                b+=s.substring(k,n-k);
                c+=s.substring(n-k,n); 
            }
        }
        c=toggleCase(c);

        Result rs=new Result(a,b,c);
        return rs;
    }
    public static String toggleCase(String s)
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            int asci=(int)ch;

            if(asci>=65 && asci<=90)
            {
                asci+=32;
                str+=(char)asci;
            }
            else
            {
                asci-=32;
                str+=(char)asci;
            }
        }
        return str;
    }
}