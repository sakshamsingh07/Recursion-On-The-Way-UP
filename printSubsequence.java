import java.util.Scanner; 
public class printSubsequence
{
    public static void pss(String str ,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;

        }
        char ch =str.charAt(0);
        String ros=str.substring(1);
        pss(ros, asf+ch);
        pss(ros, asf);
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        String s = scn.next();
        pss(s,"");
    }
    
}
