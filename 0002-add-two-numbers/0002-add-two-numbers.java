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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumy=new ListNode(0);
        ListNode temp=dumy;
        ListNode tem1=l1;
        ListNode tem2=l2;
        int carry=0;
        while(tem1!=null||tem2!=null){
            int sum=carry;
            if(tem1!=null){
                sum+=tem1.val;
                tem1=tem1.next;
            }
            if(tem2!=null){
                sum+=tem2.val;
                tem2=tem2.next;
            }
            
            carry=sum/10;

            ListNode a=new ListNode(sum%10);
            temp.next=a;
            temp=temp.next;

        }
        if(carry>0){
            ListNode a=new ListNode(carry);
            temp.next=a;
        }
        return dumy.next;
    }
}