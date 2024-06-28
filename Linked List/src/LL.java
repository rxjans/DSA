
public class LL {
    Node head;
    private int size;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public void insertFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }


    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst("implementation");
        list.insertFirst("This");
        list.insertLast("Linked List");
        list.insertLast("is");
        list.insertLast("This");
        list.insertLast("implementation");
        list.deleteFirst();
        list.deleteLast();
        list.reverse();
        list.printList();
        System.out.println("The size of your list is: " + list.getSize());
    }
}
