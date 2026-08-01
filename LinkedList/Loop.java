
public class Loop{

  static   class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;


public static Boolean isCycle(){

Node  s=head;
Node  f=head;

while(f!=null && f.next!=null){
s=s.next;
f=f.next.next;

if(s==f){
return true;
}




}
return false;

}



public static void main(String args[]){

head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=head;

System.out.println(isCycle());


}


}