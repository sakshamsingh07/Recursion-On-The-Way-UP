import java.util.Scanner; 
public class printmazepathwithjump
{
    static int [][]dir={{0,1},{1,0},{1,1}};
    static String[]dirN={"h","v","d"};
    public static void pmpwj(int sr,int sc, int dr ,int dc,String ans)
    {
        if(sr==dr&&sc==dc)
        {
            System.out.println(ans);
            return;

        }
        for(int d =0;d<dir.length;d++)
        {
            for(int jump=1;jump<=Math.max(dr,dc);jump++)
            {
                int r =sr+(jump*dir[d][0]);
                int c =sc+(jump*dir[d][1]);
            
            if(r>=0 && r<=dr && c>=0 && c<=dc)
            {
                pmpwj(r,c,dr,dc,ans+dirN[d]+jump);
            }
        
            }
        }

    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();
        pmpwj(0,0,n-1,m-1,"");
    }
    
}
