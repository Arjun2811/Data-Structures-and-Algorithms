package SubsetSum;

public class dp {

}
//ans
// boolean [] dp = new boolean [n + 1][ sum + 1] :
// //If sum is l, then answer is true,
// for (int i = 0; i <= n; i++)
// {
// dp[i][0] = true;
// }
// //If sum is not l and set is empty, then answer is false
// for (int i - 1; i <= sum; i++)
// dpl0][i] = false;
// //Fill the table in bottom up manner
// for (int i = 1; i < n; i++)
// {
// for (int j = 1; j< sum; j++)
// {
// if
// （j＜arr[i] -1］）
// dp[i][j] =dp[i- 1][j];
// }
// else
// dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i- 1]];
// }
// }
// }
// boolean result. = dp[n] [sum];
// return result;