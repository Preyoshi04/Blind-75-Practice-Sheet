import java.util.*;

public class Two_Sum_Both_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemetns of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int targetSum = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Two Pointer Approach (exists?): " + firstType(arr, targetSum));
        int[] res = secondType(arr, targetSum);
        System.out.println("HashMap Approach (indices): " + Arrays.toString(res));
        sc.close();
    }

    public static boolean firstType(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if ((arr[left] + arr[right]) > targetSum) {
                right--;
            } else if ((arr[left] + arr[right]) < targetSum) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int[] secondType(int[] nums, int targetSum) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqd = targetSum - nums[i];
            if (mpp.containsKey(reqd)) {
                return new int[] { mpp.get(reqd), i };
            }
            mpp.put(nums[i], i);
        }
        return new int[] { -1, -1 };

    }
}
