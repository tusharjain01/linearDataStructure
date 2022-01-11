package LinkedList.code;

public class removeFirstElement {
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
        public int removeFirst(){
            if(size == 0){
                System.out.println("Size of list is zero");
                return -1;
            }
            else if(size == 1){
                int ans = Head.data;
                Head.next =null;
                Head = Tail;
                size--;
                return ans;
            }
            else{
                int ans = Head.data;
                Head = Head.next;
                size--;
                return ans;
            }
        }
        public void display(){
            Node temp = Head;
            System.out.println("Elements in present in the list : ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());

    }
}
