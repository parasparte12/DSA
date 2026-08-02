
public class MergeSortLL{

public class Node{
int data;
Node next;

Node(int data){
this.data=data;
this.next=null;
}

}

public  Node head;

public void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;


}

public void print(){

    Node temp=head;
    while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");



}


public Node getMid(Node head){

Node s=head;
Node f=head.next;

while(f!=null && f.next!=null){



s=s.next;

f=f.next.next;

}
return s; // s is mid 

}

public Node merge(Node head1,Node head2){

Node mergeLL=new Node(-1);
Node temp=mergeLL;

while(head1!=null && head2!=null){
if(head1.data<=head2.data){
temp.next=head1;
head1=head1.next;
temp=temp.next;
}
else {
temp.next=head2;
head2=head2.next;
temp=temp.next;
}
}

while(head1!=null){
temp.next=head1;
head1=head1.next;
temp=temp.next;

}

while(head2!=null){
temp.next=head2;
head2=head2.next;
temp=temp.next;


}
return mergeLL.next;
}


public Node mergeSort(Node head){

// base case 

if(head==null || head.next==null){
return head;
}

// S1-> find mid

Node mid=getMid(head);

// left and right MS

Node rightHead=mid.next;

mid.next=null;

Node newLeft=mergeSort(head);
Node newRight=mergeSort(rightHead);


// merge

return merge(newLeft,newRight);



}

public static void main(String args[]){

MergeSortLL ll =new MergeSortLL();

ll.addFirst(1);
ll.addFirst(2);

ll.addFirst(3);

ll.addFirst(4);

ll.addFirst(5);
// here the list is 5,4,3,2,1

ll.print();
ll.head=ll.mergeSort(ll.head);
ll.print();

}
}