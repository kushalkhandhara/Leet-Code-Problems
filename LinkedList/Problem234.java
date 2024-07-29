/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Problem234 
{
    ListNode head;
    // Reverse Linked list
    public ListNode reverseList(ListNode head) 
    {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr!=null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;

            // update
            prev = curr;
            curr = nextNode;
        } 
        head.next = null;
        head = prev;
        return head;
    }

    public boolean isPalindrome(ListNode head) 
    {
        String s="";
        ListNode currNode = head;
        while(currNode!=null)
        {
            int k = currNode.val;
            s+=Integer.toString(k);
            currNode = currNode.next;
        }

        Solution revNode = new Solution();
        ListNode revHead = revNode.reverseList(head);
        ListNode curr = revHead;
        String s1 = "";
        while(curr!=null)
        {
            int k1 = curr.val;
            s1+=Integer.toString(k1);
            curr = curr.next;
        } 
        if(s1.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}