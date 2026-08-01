
public class RemoveLoop{

public static class Node{

int data;
Node next;

Node(int data){
this.data=data;

this.next=null;

}

}
public static Node head;

public static void DelCycle(){

Node s=head;
Node f=head;
Boolean cycle=false;

while(f!=null && f.next!=null){

s=s.next;
f=f.next.next;
if(f==s){

cycle=true;
break;

}

}
if(cycle==false){
return;
}

/////////////////////////////////////////////S-2     Meeting point 
s=head;
Node prev=null;

while(s!=f){
prev=f;
s=s.next;
f=f.next;

}
prev.next=null;




}

public static void print(){
    Node temp=head;

    while(temp!=null){

        System.out.print("linked list is: " +temp.data + " ");
        temp=temp.next;
    }
}


public static void main(String args[]){


head=new Node(1);
Node temp=new Node(2);
head.next=temp;
head.next.next=new Node(3);	
head.next.next.next=temp;
DelCycle();
print();





}
}