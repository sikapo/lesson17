package LeetCodeTusk121;

public class Main {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode()
      {}
      ListNode(int val)
      { this.val = val;}
  }
  public static ListNode reversedList (ListNode head) {
      ListNode prevNode = null;
      ListNode currentNode = head;
      ListNode nextNode;

      while (currentNode != null) {
          nextNode = currentNode.next;
          currentNode.next = prevNode;
          prevNode = currentNode;
          currentNode = nextNode;
      }

      return prevNode;
  }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode current = reversedList(head);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
