import java.util.Scanner; 
public class printMazepath
{
    public static void pmp(int sr ,int sc ,int dr , int dc, String asf)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(asf);
            return;
        }
        if(sr+1<=dr)
        pmp(sr+1,sc,dr,dc,asf+"v");
        if(sc+1<=dc)
        pmp(sr,sc+1,dr,dc,asf+"h");
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        pmp(0,0,n-1,m-1,"");
    }
    
}
