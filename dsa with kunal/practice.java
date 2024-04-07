import java.util.*;

public class practice {
    public static void main(String[] args)
    {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int t=41;
        System.out.println(Arrays.toString(search(arr,t)));
    }
    public static int[] search(int[][] matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target)
            {
                r++;
            }
            else if(matrix[r][c]>target){
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
