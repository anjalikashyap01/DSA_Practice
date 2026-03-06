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
        
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        int n=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            n++;
        }
        // temp.next=head;
        k=k%n;
        
        // int pos=n-k;
        if(k==0)
        {
            return head;
        }

        temp.next=head;
        int pos=n-k;
        temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }   
       ListNode newhead=temp.next;
        temp.next=null;

        return newhead;
         }
}