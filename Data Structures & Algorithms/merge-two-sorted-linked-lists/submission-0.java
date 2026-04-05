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
        ListNode test = new ListNode(0);
        ListNode solution = test;


        while(list1 != null || list2 != null){
            if(list1 == null){
                solution.next = list2;
                list2 = list2.next;
            }else if(list2 == null){
                solution.next = list1;
                list1 = list1.next;
            }else if(list1.val <= list2.val){
                solution.next = list1;
                list1 = list1.next;
            }else{
                solution.next = list2;
                list2 = list2.next;
            }
            solution = solution.next;
        }
        return test.next;
    }
}