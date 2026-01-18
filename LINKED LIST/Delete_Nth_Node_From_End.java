import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Delete_Nth_Node_From_End {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++; // calculate the length of LL
            temp = temp.next;
        }
        if (count == n) {
            return head.next; // condition where n is equlas to length of LL
        }
        int result = count - n;
        temp = head;
        while (temp != null) {
            result--;
            if (result == 0) {
                break;
            }
            temp = temp.next; // this will point to the node bfroe the targeted ndoe now
        }
        temp.next = temp.next.next; // deleting targeted node
        return head;
    }

    // public ListNode removeNthFromEnd(ListNode head, int n) {
    // ListNode fast = head;
    // for(int i=0;i<n;i++)
    // {
    // fast = fast.next;
    // }
    // if(fast == null)
    // {
    // return head.next; //condition where n==length of the list
    // }
    // ListNode slow = head;
    // while(fast.next != null)
    // {
    // slow = slow.next; //this will point at the node before the targeted node
    // fast = fast.next;
    // }
    // slow.next = slow.next.next; //deleting the targeted node
    // return head;
    // }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Original Linked List:");
        printList(head);

        System.out.println("Enter the target node :");
        int n = sc.nextInt();
        head = removeNthFromEnd(head,n);

        System.out.println("After deletion :  List:");
        printList(head);

    }
}