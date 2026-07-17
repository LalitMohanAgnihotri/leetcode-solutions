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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        ListNode dumye=new ListNode(0);
        dumye.next=head;
        ListNode prev=dumye;
        int grp=len%k;
        for(int i=1;i<=len-grp;i+=k){
            ListNode rgrp=temp;
            for(int j=1;j<k;j++){
                rgrp=rgrp.next;
            }
            ListNode rem=rgrp.next;
            rgrp.next=null;
            ListNode rev=reverse(temp);
            prev.next=rev;
            temp.next=rem;
            prev=temp;
            temp=rem;
        }return dumye.next;
    }
}
