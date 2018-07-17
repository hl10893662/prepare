package me.eno.algorithm.leetcode;

public class TwoSumLink {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ne = 0;
        ListNode temp3 = new ListNode(0);
        ListNode temp4 = temp3;
        ListNode temp5;
        while (l1 != null ||l2 != null){
            ne = add(l1,l2,ne);
            if (l1 !=null && l1.next != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }

            if (l2 !=null && l2.next != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }
            temp4.val = ne % 10;
            if (l1 != null || l2 != null){
                temp5 = new ListNode(0);
                temp4.next = temp5;
                temp4 = temp4.next;
            }
        }
        if (ne>10){
            temp4.val = 1;
        }else{
            temp4 = null;
        }
        return temp3;
    }

    public static int add(ListNode l1,ListNode l2,int bef){
        int result = 0;
        if (l1 != null){
            result = l1.val;
        }
        if (l2 != null){
            result +=l2.val;
        }
        if (bef>=10){
            result +=1;
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
