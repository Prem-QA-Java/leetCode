class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        int curry=0;
        while(l1!=null||l2!=null||curry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=curry+x+y;
            curry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return dummyHead.next;
    }
}