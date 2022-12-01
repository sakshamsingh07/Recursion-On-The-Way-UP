import java.util.Scanner; 
public class printEncoding
{
    public static void pe(String str ,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;

        }
        if(str.charAt(0)=='0')
        {
            return;
        }
        char ch = str.charAt(0); //char 6
        int s = ch -'0'; // int ka 6
        String ros = str.substring(1);
        pe(ros, asf + (char)(s+'a'-1));
        if(str.length()>1)
        {
            char ch1 = str.charAt(1);
            int s1 = ch1-'0';
            int num = s*10+s1;
            String ros1 =str.substring(2);
            if(num<=26)
            {
            pe(ros1, asf + (char)(num +'a'-1));
            }

        }
       
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        String s = scn.next();
        pe(s,"");
        
    }
    
}
