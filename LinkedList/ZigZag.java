
public class ZigZag{


public class Node{

int data;
Node next;

public Node(int data){

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

public void addLast(int data){

    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;

}

public void print(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;

}
System.out.println("null");


}

public void zigzag(){

Node s=head;
Node f=head.next;
while(f!=null && f.next!=null){

s=s.next;
f=f.next.next;


}
Node mid=s;

/////////////////////////////////// 2nd Step


Node curr=mid.next;
mid.next=null;
Node prev=null;
Node next;
/////////////////////// reverse



while(curr!=null){
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
}
//////////////////////// zig zag
/// 
 Node left=head;
Node right=prev;
Node nextL,nextR;
while(left!=null && right!=null){

nextL=left.next;


left.next=right;
nextR=right.next;
right.next=nextL;

left=nextL;
right =nextR;

}

}






public static void main(String args[]){

ZigZag ll=new ZigZag();
ll.addLast(1);
ll.addLast(2);

ll.addLast(3);

ll.addLast(4);
ll.addLast(5);

ll.print();
ll.zigzag();
ll.print();




}

}