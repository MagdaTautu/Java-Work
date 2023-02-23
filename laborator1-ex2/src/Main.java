public class Main {
    public static void main(String[] args) {
//        String str=args[0];
//        int n=Integer.parseInt(str);
        //create latin square n
        int[][] matrix;
        int i,j,k=6;
        matrix = new int[6][6];
        for(i=1; i<=5; i++)
        {
            int x = k;
            while (x<= 5)
            {
              System.out.print(x + " ");
                x++;
            }
            for (j=1; j<k; j++)
               System.out.print(j + " ");
            k--;
            System.out.println();
        }
    }
}