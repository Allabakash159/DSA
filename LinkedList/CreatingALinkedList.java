class Node{
    int value;
    Node next;

    Node(int value,Node next){
        this.value=value;
        this.next=null;
    }

}

class Main {
    public static void main(String[] args) {

        Node n1=new Node(10,null);
        Node n2=new Node(20,null);
        Node n3=new Node(30,null);
        Node n4=new Node(40,null);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;


        Node temp=n1;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        
    }
}
