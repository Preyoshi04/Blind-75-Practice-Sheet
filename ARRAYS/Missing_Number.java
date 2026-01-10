import java.util.*;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Missing_Number obj = new Missing_Number();
        int ans = obj.missingNumber(arr);
        System.out.println("The missing number is: " + ans);
        sc.close();
    }

    public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}
