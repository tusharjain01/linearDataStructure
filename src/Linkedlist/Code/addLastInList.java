package LinkedList.code;

public class addLastInList {
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
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(45);
        ll.addLast(54);
        ll.addLast(32);
    }
}
