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
        if(head == null || k == 0)  return head;
        
        //将链表首尾相连
        ListNode p = head;
        int len = 1;
        while(p.next != null){
            p = p.next;
            len++;
        }
        p.next = head;
        
        //确定新的链表的表尾
        p = head;
        for(int i=0; i<(len-k%len-1); i++){
            p = p.next;
        }
        ListNode q = p.next;
        p.next = null;
        
        return q;
    }
}
