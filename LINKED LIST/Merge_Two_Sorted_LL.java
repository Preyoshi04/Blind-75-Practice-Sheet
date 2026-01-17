import java.util.*;

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

public class Merge_Two_Sorted_LL {
    // public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // if(list1 == null)
    // {
    // return list2;
    // }
    // if(list2 == null)
    // {
    // return list1;
    // }
    // if(list1.val <= list2.val)
    // {
    // list1.next = mergeTwoLists(list1.next , list2);
    // return list1;
    // }
    // else //(list2.val <= list1.val)
    // {
    // list2.next = mergeTwoLists(list1,list2.next);
    // return list2;
    // }
    // }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = null;
        ListNode dummyHead = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                dummyHead.next = list1;
                list1 = list1.next;
            } else {
                dummyHead.next = list2;
                list2 = list2.next;
            }
            dummyHead = dummyHead.next;
        }
        if (list1 == null) {
            dummyHead.next = list2;
        } else {
            dummyHead.next = list1;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // First sorted linked list: 1 -> 3 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        // Second sorted linked list: 2 -> 4 -> 6
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        System.out.println("First Sorted Linked List:");
        printList(head1);

        System.out.println("Second Sorted Linked List:");
        printList(head2);

        ListNode mergedHead = mergeTwoLists(head1, head2);

        System.out.println("Merged Sorted Linked List:");
        printList(mergedHead);
    }
}
