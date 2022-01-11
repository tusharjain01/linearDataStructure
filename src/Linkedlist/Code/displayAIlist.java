package LinkedList.code;

public class displayAIlist {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        private Node Head;
        private Node Tail;
        private int size = 0;
        public void addLast(int val) {
            //Created a new temporary new Node
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            //Clearly if size = 0 Head and tail will point on first node
            if (size == 0) {
                Head = Tail = temp;
            }
            // If size is not equals to zero than Tail will point at the temp
            //and later itself assigns the values of temp.
            else {
                Tail.next = temp;
                Tail = temp;
            }
            size++;
        }
        public void display(){
            //We started by creating a node that is equal to Head(ie First node).
            //In each iteration it will first print its data. And then later
            //change itself to the node present next to it.
            //At the end if nothing is present it will stop.
            Node temp = Head;
            System.out.println("Elements in present in the list : ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(45);
        ll.addLast(54);
        ll.addLast(32);
        ll.addLast(25);
        ll.addLast(13);
        ll.addLast(200);
        ll.display();

    }
}
