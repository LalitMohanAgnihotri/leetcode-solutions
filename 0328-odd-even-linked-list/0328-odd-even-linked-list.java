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
    public ListNode oddEvenList(ListNode head) {
        ListNode dumyOdd=new ListNode(0);
        ListNode odd=dumyOdd;
        ListNode dumyEven=new ListNode(0);
        ListNode even=dumyEven;

        ListNode temp=head;
        while(temp!=null){
            odd.next=temp;
            odd=odd.next;
            temp=temp.next;

            even.next=temp;
            if(temp==null)break;
            even=even.next;
            temp=temp.next;
        }
        dumyOdd=dumyOdd.next;
        dumyEven=dumyEven.next;
        odd.next=dumyEven;
        return dumyOdd;
    }
}