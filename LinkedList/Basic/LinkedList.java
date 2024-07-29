class LinkedList
{
    int size;
    Node head;

    LinkedList()
    {
        this.size = 0;
    }

    // Node 
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    // Add Last 
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    
    // Print List
    public void printList()
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while(currNode!= null)
        {
            System.out.print(currNode.data+" => ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    // Delete First
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last
    void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    }

    // Reverse Linked list
    public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // To get Size of Linked list
    public void  getSize()
    {
        System.out.println("Size : " + size);
    }

    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");

        list.deleteFirst();
        list.deleteLast();
        list.addFirst("c");
        list.addLast("d");
        
        list.printList();

        list.getSize();

        list.reverse();
        list.printList();
    }
}