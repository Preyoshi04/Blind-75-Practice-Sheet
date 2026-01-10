import java.util.*;

public class Search_in_Rotated_sorted_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        Search_in_Rotated_sorted_Array obj = new Search_in_Rotated_sorted_Array();
        int ans = obj.search(arr, target);
        System.out.println(ans);
        sc.close();
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            
            if(nums[mid] == target)
            {
                return mid;
            }

            //check if left sorted?
            if(nums[start] <= nums[mid])
            {
                if(nums[start] <= target && target < nums[mid]) //target in left side
                {
                    end = mid-1;
                }
                else  //target in right side
                {
                    start = mid+1;
                }
            }
            else  //right side sorted?
            {
                if(nums[mid] < target && target <= nums[end])  //target in right side
                {
                    start = mid+1;
                }
                else   //target in left side
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}

