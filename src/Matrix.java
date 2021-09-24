public class Matrix
{
    public static void main(String[] arga)
    {
        int Arr[][] = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        int i, k;
        for (i = 0; i < 3; i++)
        {
            for (k = 0; k < 3; k++)
                System.out.print(Arr[i][k]+" ");
            System.out.println();

        }
    }
}