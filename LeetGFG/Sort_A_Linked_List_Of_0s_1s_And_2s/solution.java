class Solution {
    public Node segregate(Node head) {
        Node temp=head;
        Node head1=null;
        Node temp1=null;
        int zeroes=0;
        int ones=0;
        int twos=0;
        while(temp!=null){
            if(temp.data==0){
                zeroes++;
            }else if(temp.data==1){
                ones++;
            }else{
                twos++;
            }
            temp=temp.next;
        }
        while(zeroes!=0){
            Node newnode=new Node(0);
            if(head1==null){
                head1=newnode;
                temp1=head1;
            }else{
                temp1.next=newnode;
                temp1=temp1.next;
            }
            zeroes--;
        }
        while(ones!=0){
            Node newnode=new Node(1);
            if(head1==null){
                head1=newnode;
                temp1=head1;
            }else{
                temp1.next=newnode;
                temp1=temp1.next;
            }
            ones--;
        }
        while(twos!=0){
            Node newnode=new Node(2);
            if(head1==null){
                head1=newnode;
                temp1=head1;
            }else{
                temp1.next=newnode;
                temp1=temp1.next;
            }
            twos--;
        }
        return head1;
    }
}
