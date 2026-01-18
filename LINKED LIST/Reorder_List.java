import java.util.Scanner;
import java.util.Stack;

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
public class Reorder_List
{
     public static void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null)
        {
            stack.push(temp);
            temp = temp.next;
        }
        int k = (stack.size());
        ListNode curr = head;
        for(int i=0;i<k/2;i++)
        {
        ListNode topNode = stack.pop();
        temp = curr.next;
        curr.next = topNode;
        topNode.next = temp;
        curr = temp;
        }
        curr.next = null;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original Linked List:");
        printList(head);

        reorderList(head);

        System.out.println("After re-ordering the list :  List:");
        printList(head);

    }
}
