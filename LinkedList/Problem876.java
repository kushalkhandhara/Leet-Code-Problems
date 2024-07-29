public class Problem876 
{
    int size;
    ListNode head;
    Problem876()
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
    public ListNode middleNode(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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


    public static void main(String[] args) 
    {
       Problem876 list = new Problem876();
       list.addFirst(1);
       list.addFirst(2);
       list.addFirst(3);
       list.addFirst(4);
       list.addLast(5);
       list.printList();
       list.getSize();
       ListNode middle = list.middleNode(list.head);
       System.out.println("\nThe value of the middle node is: " + middle.val);
    }
}
