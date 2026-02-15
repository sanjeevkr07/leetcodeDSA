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
class Solution {
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;


        ListNode prev = null;

        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }   



        // head = prev;

        // while(head!=null){ System.out.println(head.val); head=head.next;}

        while(prev!=null){
            ListNode temp1 = head.next;
            ListNode temp2 = prev.next;

            head.next = prev;
            prev.next = temp1;

            head = temp1;
            prev = temp2;
        }
       
        
    }
}