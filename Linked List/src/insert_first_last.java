public class insert_first_last {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
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


    public static void main(String[] args) {
        insert_first_last list = new insert_first_last();
        list.insertFirst("This");
        list.insertLast("is");
        list.insertLast("Linked List");
        list.insertLast("implementation");
        list.printList();
    }
}
