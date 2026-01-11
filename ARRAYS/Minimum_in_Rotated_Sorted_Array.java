import java.util.*;

public class Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Minimum_in_Rotated_Sorted_Array obj = new Minimum_in_Rotated_Sorted_Array();
        System.out.println("Minimum element in the rotated sorted array is:");
        int ans = obj.findMin(arr);
        System.out.println(ans);
        sc.close();
    }
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            if(nums[start] < nums[end])  //already sorted!
            {
                return nums[start];
            }

            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end])  //minimum in right side!
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return nums[start];
    }
}
