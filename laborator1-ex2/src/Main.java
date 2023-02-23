public class Main {
    public static void main(String[] args) {
//        String str=args[0];
//        int n=Integer.parseInt(str);
        //create latin square n
        int[][] matrix;
        int i,j;
        matrix = new int[6][6];
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1)
                {
                    matrix[i][j]=0+j;
                }
                else matrix[i][j]=0;
            }
        }
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
                System.out.println(matrix[i][j]);
        }
    }
}