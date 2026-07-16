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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dmy=new ListNode(0);
        dmy.next=head;
        ListNode prev=dmy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode Sprev=null;
        ListNode nxt=null;
        for(int i=left;i<=right;i++){
            nxt=curr.next;
            curr.next=Sprev;
            Sprev=curr;
            curr=nxt;
        }
        prev.next.next=curr;
        prev.next=Sprev;
        return dmy.next;
    }
}