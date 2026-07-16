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
        }return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode revList=reverse(slow);
        ListNode temp=head;
        ListNode rev=revList;
        while(rev!=null){
            if(temp.val!=rev.val)return false;
            temp=temp.next;
            rev=rev.next;
        }return true;

    }
}