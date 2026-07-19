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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;
        ListNode nxt=null;
        ListNode prev=null;
        int len=0;
        while(curr!=null){
            len++;
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        int ans[]=new int[len];
        Stack<Integer>stk=new Stack<>();
        int i=0;
        while(prev!=null){
            while(!stk.isEmpty()&&prev.val>=stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty())ans[i++]=0;
            else ans[i++]=stk.peek();
            stk.push(prev.val);
            prev=prev.next;
        }
        int  s=0;
        int e=ans.length-1;
        while(s<e){
            int temp=ans[e];
            ans[e]=ans[s];
            ans[s]=temp;
            s++;
            e--;
        }return ans;
    }
}