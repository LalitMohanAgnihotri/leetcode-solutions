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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        ListNode fast=head;
        int len=1;
        while(fast.next!=null){
            len++;
            fast=fast.next;
        }
        k=k%len;
        if(k==0)return head;
        ListNode slow=head;
        for(int i=1;i<len-k;i++){
            slow=slow.next;
        }
        ListNode rem=slow.next;
        slow.next=null;
        fast.next=head;
        return rem;
    }
}