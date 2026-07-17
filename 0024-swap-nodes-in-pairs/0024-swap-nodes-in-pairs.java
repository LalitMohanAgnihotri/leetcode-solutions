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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        ListNode dumye=new ListNode(0);
        dumye.next=head;
        ListNode prev=dumye;
        while(temp!=null&&temp.next!=null){
            ListNode curr=temp;
            ListNode currNext=temp.next;
            prev.next=currNext;
            curr.next=currNext.next;
            currNext.next=curr;
            prev=curr;
            temp=temp.next;
        }return dumye.next;
    }
}