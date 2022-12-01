import java.util.Scanner; 
public class printStairpath
{
    public static void psp(int n ,String asf)
    {
        if(n==0)
        {
            System.out.println(asf);
            return;
        }
        if(n-1>=0)
        psp(n-1,asf+1);
        if(n-2>=0)
        psp(n-2,asf+2);
        if(n-3>=0)
        psp(n-3,asf+3);
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        psp(n,"");
    }
    
}
