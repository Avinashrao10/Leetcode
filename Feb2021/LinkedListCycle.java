package feb2021;


class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
public class LinkedListCycle {

	
	
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) {
        	return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        do {
        	fast=fast.next.next;
        	slow = slow.next;
        }while(fast!=slow && fast.next!=null);
        return (fast==slow)?true:false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
