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
    public ListNode reverse(ListNode mid){
        ListNode curr=mid;
        ListNode nxt=null;
        ListNode prev=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=null;
        slow=head;
        while(rev!=null){
            ListNode n1=slow.next;
            ListNode n=rev.next;

            slow.next=rev;
            rev.next=n1;

            slow=n1;
            rev=n;


        }
        
    }
}