/*
Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.

After doing so, return the head of the final linked list.  You may return any such answer.

 

(Note that in the examples below, all sequences are serializations of ListNode objects.)

Example 1:

Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.
Example 2:

Input: head = [1,2,3,-3,4]
Output: [1,2,4]
Example 3:

Input: head = [1,2,3,-3,-2]
Output: [1]
*/

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

class Solution 
{
    public ListNode removeZeroSumSublists(ListNode head) 
    {
       ListNode dummy=new ListNode(0,head);
       ListNode temp=dummy;
       while(temp!=null){
        ListNode cur=temp.next;
        int sum=0;
        while(cur!=null){
            sum+=cur.val;
            if(sum==0){
                temp.next=cur.next;
            }
            cur=cur.next;
        }
        temp=temp.next;
       }
       return dummy.next;
    }
}
