public class cyclicSorting {
    public static void main(String[] args)
    {

        int[] arr={3,4,2,1,5};
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int t=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[arr[i]-1]=t;
            }
            else{
                i++;
            }
        }
        for(int j:arr)
        {
            System.out.print(i+" ");
        }
    }
}
