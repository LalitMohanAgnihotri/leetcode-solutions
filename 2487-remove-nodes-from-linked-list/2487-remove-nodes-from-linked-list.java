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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode nxt=null;
        ListNode prev=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode rev=reverse(head);
        ListNode curr=rev.next;
        ListNode max=rev;
        while(curr!=null){
            if(max.val>curr.val){
                max.next=curr.next;
            }else{
                max=curr;
            }
            curr=curr.next;
        }
        ListNode ans=reverse(rev);
        return ans;
    }
}