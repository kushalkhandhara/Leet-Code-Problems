import java.util.*;

public class Problem21 {
    int size;
    ListNode head;

    Problem21() {
        this.size = 0;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
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

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "=>");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    // To get Size of Linked list
    public void getSize() {
        System.out.println();
        System.out.println("Size: " + size);
    }

    public ListNode mergeList(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;  // Advance the pointer
        }
        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;  // Advance the pointer
        }
        Collections.sort(arr);
        Problem21 list3 = new Problem21();
        for (int k : arr) {
            list3.addLast(k);
        }
        return list3.head;  // Return the head of the merged list
    }

    public static void main(String[] args) {
        Problem21 list1 = new Problem21();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);
        list1.addLast(5);
        System.out.println("List 1:");
        list1.printList();

        Problem21 list2 = new Problem21();
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(3);
        list2.addFirst(4);
        list2.addLast(5);
        System.out.println("\nList 2:");
        list2.printList();

        Problem21 mergeListInstance = new Problem21();
        ListNode mergedHead = mergeListInstance.mergeList(list1.head, list2.head);

        System.out.println("\nMerged List:");

        
        Problem21 mergedList = new Problem21();
        mergedList.head = mergedHead;  // Assign the merged head to mergedList's head for printing
        mergedList.printList();
    }
}
