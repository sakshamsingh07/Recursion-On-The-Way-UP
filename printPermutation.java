import java.util.Scanner; 
public class printPermutation
{
    public static void pp(String str , String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;

        }
        for(int i =0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String ros = str.substring(0,i)+str.substring(i+1);
            pp(ros,ans+ch);
        }
        
        
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        String s= scn.next();
        pp(s,"");
    }
    
}
