import java.util.*;

public class Amusmentpark 
{
    public static void main(String[] args) 
    {
        int[][] grid = 
        {
            {1, 8, 21, 7},
            {19, 17, 10, 20},
            {2, 18, 23, 22},
            {14, 25, 4, 13}
        };

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        dp[0][0] = grid[0][0];

        // First row
        for (int j = 1; j < m; j++) 
        {
            dp[0][j] = Math.max(dp[0][j-1], grid[0][j]);
        }

        // First column
        for (int i = 1; i < n; i++) 
        {
            dp[i][0] = Math.max(dp[i-1][0], grid[i][0]);
        }

        // Fill rest
        for (int i = 1; i < n; i++) 
            {
            for (int j = 1; j < m; j++) 
            {
                int minPrev = Math.min(dp[i-1][j], dp[i][j-1]);
                dp[i][j] = Math.max(minPrev, grid[i][j]);
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}