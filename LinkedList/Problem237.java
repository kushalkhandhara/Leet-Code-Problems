import java.util.*;
public class Problem237 
{
    int size;
    ListNode head;
    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val) 
        {
            this.val = val; 
            this.next = null; 
            size++;
        }
    }
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
