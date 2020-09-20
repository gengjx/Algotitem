package LeetCOde;
/*
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
示例:
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer24 {
	   public static ListNode reverseList(ListNode head) {
	        if(head == null || head.next == null) {
	            return head;
	        }
	        ListNode node =reverseList(head.next);
	         head.next.next = head;
	        head.next = null;
	        return node;

	    }
	   public static void main(String[] args) {
		   ListNode a =new ListNode(1);
		   ListNode a1 =new ListNode(2);
		   ListNode a2 =new ListNode(3);
		   ListNode a3 =new ListNode(4);
		   ListNode a4 =new ListNode(5);
		   a.next =a1;
		   a1.next =a2;
		   a2.next =a3;
		   a3.next =a4;
		   ListNode a6 = reverseList(a);
		   
		   System.out.println(a6);
	   }
}

