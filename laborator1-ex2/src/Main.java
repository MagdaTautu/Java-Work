public class Main {
    public static void main(String[] args) {
        String str=args[0];
        int n=Integer.parseInt(str);
        System.out.println("n = " + n);
        //create latin square n
        int[][] a;
        int i,j,m,k=n+1;
        a = new int[n+1][n+1];
        for(i=1; i<=n; i++)
        {
            int x = k; m=1;
            while (x<= n)
            {
                a[i][m]=x;
                x++; m++;

            }
            for (j=1; j<k; j++)
                a[i][n-k+j+1]=j;
            k--;
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        StringBuilder s = new StringBuilder("");
        for(i=1;i<=n;i++) {
            s.setLength(0);
            s = new StringBuilder("");
            for (j = 1; j <= n; j++)
                s.append(String.valueOf( a[i][j]));
            System.out.println("linia " + i + ": " + s);
        }
    }
}