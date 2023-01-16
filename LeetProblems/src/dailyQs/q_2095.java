package dailyQs;

public class q_2095 {



      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      static void disp(ListNode head){
          ListNode temp = head;
          while (temp != null){
              System.out.print(temp.val + "-->");
              temp = temp.next;
          }
      }



        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new  ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode boi = deleteMiddle(head);
            disp(boi);

        }
        public  static ListNode deleteMiddle(ListNode head) {
            if(head.next == null ){
                return null;
            }
            ListNode temp = head;
            int count = 0;
            while(temp != null){
                temp = temp.next;
                count++;
            }
//            if(count%2 == 0){
//                count = count/2 - 1 ;
//            } else{
//                count =(int) Math.ceil(count/2);
//            }

            ListNode tem = head;
            for(int i = 0; i <Math.ceil(count/2 -1); i++){
                tem = tem.next;
            }
            tem.next = tem.next.next;


            return head;
        }

}
