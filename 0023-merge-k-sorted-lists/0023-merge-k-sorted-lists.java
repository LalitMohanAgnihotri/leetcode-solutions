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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
            for(ListNode i:lists){
                if(i!=null)pq.add(i);
            }
            ListNode dumy=new ListNode(0);
            ListNode end=dumy;
            while(!pq.isEmpty()){
                ListNode curr=pq.poll();
                end.next=curr;
                end=end.next;
                if(curr.next!=null){
                    pq.add(curr.next);
                }

            }return dumy.next;
        }
    }
