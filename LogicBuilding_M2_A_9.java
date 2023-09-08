
class LogicBuilding_M2_A_9
{
  public static void main(String args[])
  {
    String s=possibleString("Fi_er","Fever:Fiber:Fiter:Finger:Figer");
    System.out.println("Possible strings: "+s);
  }
  public static String possibleString(String input1,String input2)
  {

	// Write code here...
        input1=input1.toUpperCase();
        input2=input2.toUpperCase();
        String str[]=input2.split(":");
        String res="";

        for(int i=0;i<str.length;i++)
        {
           if(str[i].length()==input1.length())
          { 
            if(isPossible(str[i],input1))
             res+=str[i]+":";
          }
        }
        if(res=="") return "ERROR-009";
        String result="";
        for(int i=0;i<res.length()-1;i++)
         result+=res.charAt(i);
        return result;	
	}

    public static boolean isPossible(String str,String s)
    {
        
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            Character dh=s.charAt(i);
            if(ch!=dh && dh!='_') return false;    
        }
        return true;  
    }
}