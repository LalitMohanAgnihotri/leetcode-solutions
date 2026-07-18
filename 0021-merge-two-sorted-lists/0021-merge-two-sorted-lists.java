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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode dumy=new ListNode(0);
        ListNode h=dumy;
        while(temp1!=null&&temp2!=null){
            if(temp1.val>=temp2.val){
                h.next=temp2;
                h=temp2;
                temp2=temp2.next;
            }else{
                h.next=temp1;
                h=temp1;
                temp1=temp1.next;
            }
        }
        if(temp1!=null){
            h.next=temp1;
        }else h.next=temp2;
        return dumy.next;
    }
}