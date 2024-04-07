public class TargetInmountainArray {
    public static int PeakElement(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,4,5,7,6,5,4,3,1};
        int idx=PeakElement(arr);
        int target=7;
        if(findTarget1(arr,target,idx)!=-1)
        {
            System.out.println(findTarget1(arr,target,idx));
        }
        else{
            System.out.println(findTarget2(arr,target,idx));
        }
    }
    public static int findTarget1(int[] arr,int t,int peak)
    {
        int start=0;
        int end=peak;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<t)
            {
                start=mid+1;
            }
            else if(arr[mid]>t)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static int findTarget2(int[] arr,int t,int peak)
    {
        int start=peak;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>t)
            {
                start=mid+1;
            }
            else if(arr[mid]<t)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
