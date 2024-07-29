class Problem203
{
    ListNode head;
    int size = 0;

    Problem203(){
        this.size = 0;
    }

    class ListNode
    {
        ListNode next;
        int val;
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

    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
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

    public ListNode RemoveElements(ListNode head, int val) 
    {

        while (head != null && head.val == val) {
            head = head.next;
            size--; // Adjust size since we're removing an element
        }

        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.val == val) {
                currNode.next = currNode.next.next;
                size--; // Adjust size since we're removing an element
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }



    // To get Size of Linked list
    public void getSize()
    {
        System.out.println();
        System.out.println("Size : " + size);
    }


    public static void main(String[] args) 
    {
        Problem203 list = new Problem203();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        // list.addFirst(4);  
        // list.addFirst(4);
        list.addLast(5);
        list.addLast(4);
        list.addLast(5);
        list.addLast(5);
        list.printList();
        // list.RemoveElements(list.head, 4);
        list.head = list.RemoveElements(list.head, 4);
        list.printList();
        // list.getSize();
        // list.RemoveNode(list.head, 4);
        // ListNode head = list.RemoveNode(list.head, 4);

    }
}