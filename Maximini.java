import java.util.*;
class Maximini
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int x=1;
        if(n%2==0)
        {
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[(n)-x]+" ");
            System.out.print(a[i]+" ");
            x++;
        }
        }
        else
        {
            for(int i=0;i<n/2;i++)
        {
            System.out.print(a[(n)-x]+" ");
            System.out.print(a[i]+" ");
            x++;
            if(i==(n/2)-1)
            {
                System.out.print(a[(n)-x]+" ");
            }
        }
        }
    }
}
