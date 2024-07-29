import java.util.*;

class Problem328
{
    ListNode head;
    int size;
    Problem328()
    {
        this.size = 0;
    }
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

    public void addFirst(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        // ListNode newNode = new ListNode(data);
        ListNode currNode = head;
        while (currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }
        ListNode currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.val + "=>");
            currNode  = currNode.next;
        }
        System.out.print("Null");
    }

    // To get Size of Linked list
    public void getSize()
    {
        System.out.println();
        System.out.println("Size : " + size);
    }

    public void oddEventList(ListNode head)
    {
        ListNode currNode = head;
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        Problem328 list = new Problem328();

        int i = 0;

        while(currNode != null)
        {
            if(i%2==0)
            {
                list.addLast(oddNode.val);
                oddNode = currNode.next.next;
                
                i++;
            }
            else
            {
                list.addLast(evenNode.val);
                evenNode = currNode.next.next;
                i++;
            }
        }
        System.out.println("Here");
        list.printList();

    }




    public static void main(String[] args) 
    {
        Problem328 list = new Problem328();
        list.addFirst(-3);
        list.addFirst(-1);
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(3);
        list.addFirst(3);
        list.printList();
        list.getSize();
        list.oddEventList(list.head);
    }

}