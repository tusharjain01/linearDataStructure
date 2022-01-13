package LinkedList.code;

public class reverselistdataiterative {
    public static class Node {
        int data;
        Node next;
    }
    public static class LinkedList {
        private Node Head;
        private Node Tail;
        private int size = 0;
        private Node getNodeAt(int idx){
            Node temp = Head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }
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

        public void removeFirst() {
            if (size == 0) {
                System.out.println("Size of list is zero");
            } else if (size == 1) {
                Head = Tail;
                size--;
            } else {
                Head = Head.next;
                size--;
            }
        }
        public void display() {
            Node temp = Head;
            System.out.println("Elements in present in the list : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int getFirst(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                return Head.data;
            }
        }
        public int getLast(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            else {
                return Tail.data;
            }
        }
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            else if (idx < 0 || idx >= size)
            {
                System.out.println("Invalid Arguments");
                return -1;
            }
            else {
                Node temp = Head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }
        public void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = Head;
            if(size == 0){
                temp.next = null;
                Head = Tail = temp;
            }
            else{
                Head = temp;
            }
            size++;
        }
        public void addAt(int idx,int val){
            if(idx < 0 || idx > size){
                System.out.println("Invalid Arguments");
            }
            else if(idx == 0){
                addFirst(val);
            }
            else if(idx == size){
                addLast(val);
            }
            else {
                Node node = new Node();
                Node temp = Head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.data = val;
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
        public void removeLast(){
            if(size == 0){
                System.out.println("List is empty");
            }
            else if(size == 1){
                Head = Tail = null;
                size --;
            }
            else{
                Node temp = Head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                size --;
            }
        }
        public void reverseDi(){
            System.out.println("Reverse of List : ");
            int li = 0;
            int ri = size - 1;
            while(li < ri){
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                li++;
                ri--;
            }
            display();
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
            ll.removeFirst();
            System.out.println(ll.getFirst());
            System.out.println(ll.getLast());
            System.out.println(ll.getAt(3));
            ll.addFirst(54);
            ll.addFirst(11);
            ll.addFirst(12);
            ll.addFirst(13);
            ll.display();
            ll.addAt(3,50);
            ll.addAt(0,100);
            ll.addAt(10,657);
            ll.display();
            ll.removeLast();
            ll.removeLast();
            ll.removeLast();
            ll.display();
            ll.reverseDi();
        }
    }
}
