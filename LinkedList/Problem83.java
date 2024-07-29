import java.util.*;

class Problem83
{
    int size;
    ListNode head;
    Problem83()
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

    // Duplicates
    public void removeDuplicates(ListNode head)
    {
        ListNode currNode = head;
        TreeSet<Integer> set = new TreeSet<>();  // Use TreeSet instead of HashSet


        while (currNode != null)
        {
            set.add(currNode.val);
            currNode = currNode.next;
        }
        System.out.println("Set : " + set);
        Problem83 list = new Problem83();
        for(int k : set)
        {
            list.addLast(k);
        }
        list.printList();


    }



    public static void main(String[] args) 
    {
        Problem83 list = new Problem83();
        list.addFirst(-3);
        list.addFirst(-1);
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(3);
        list.addFirst(3);
        list.printList();
        list.getSize();
        // -3,-1,0,0,0,3,3
        list.removeDuplicates(list.head);

    }
}