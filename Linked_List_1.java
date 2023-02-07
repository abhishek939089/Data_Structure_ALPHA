public class Linked_List_1{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;

   public void addFirst(int data){
        // Step->1 create new node
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        // Step->2 new node's next = head
        newNode.next=head; //Link or Linking step

        // Step->3 head=newnode
        head=newNode;  
        
    }
    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        
        tail=newNode;
    }

   // public void add(int idx,int data){
    //     if(idx == 0){
    //         addFirst(data);
    //         return;
    //     }
    //     Node newNode =new Node(data);
    //     Node temp=head;
    //     int i=0;
    //     while(i<idx){
    //         temp=temp.next;
    //         i++;
    //     }
    //     // i=idx-1; temp->prev
    //     newNode.next=temp.next;
    //     temp.next=newNode;
        
    // }

    public void Reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void print() { //O(n)
        if(head == null){
            System.out.println("Linked_List is Empty:");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Linked_List_1 ll=new Linked_List_1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // ll.add(2,9);
        ll.print();
        ll.Reverse();
        ll.print();

    }
    
}
