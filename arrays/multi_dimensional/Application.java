public class Application{
    public static void main(String[] args)
    {
        int[] values = {3, 5, 2343};

        int[][] grid = {
            {3, 5, 2343},
            {2, 4},
            {1, 2, 3, 4}
        };

            for(int row=0; row < grid.length; row++)
            {
                for(int col=0; col < grid[row].length; col++)
                {
                    System.out.print(grid[row][col] + " ");
                }
                System.out.println();
            }
        
        }
    }