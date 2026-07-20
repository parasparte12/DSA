
public class L1{

    public class Node{

        int data;
        Node next;
    // make constructor to initialize the data and next pointer
        public Node(int data){

            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
        public static Node tail;

        // method to add a new node at the first position of the linked list
        public void addFirst(int data){
            // s1: create a new node
            Node newNode=new Node(data);


            if(head==null){
                head=tail=newNode;
                return;

            }



            
            //s2: newNode next= head
            newNode.next=head; // Link


            //s3: head=newNode
            head=newNode;

            

        }

        public void addLast(int data){
            // s1: create a new node
            Node newNode=new Node(data);

            if(head==null){
                head=tail=newNode;
                return;
            }

            // s2:tail next=newNode
            tail.next=newNode;
            //s3: tail=newNode
            tail=newNode;
            
        }

        public void print (){

            // base case
            if(head==null){
                System.out.println("Linked list is empty");
                return;
            }

            Node tmp=head;
            while(tmp!=null){
                System.out.print(tmp.data +" ");
                tmp=tmp.next;// Move to the next node in the linked list // to update

            }
            System.out.println();
        }


    public static void main(String args[]){
        L1 ll=new L1();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
}