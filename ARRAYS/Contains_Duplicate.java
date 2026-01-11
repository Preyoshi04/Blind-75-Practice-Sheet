import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();   

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Contains_Duplicate obj = new Contains_Duplicate();
        boolean hasDuplicate = obj.containsDuplicate(arr);

        System.out.println("Contains duplicate: " + hasDuplicate);

        sc.close();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
