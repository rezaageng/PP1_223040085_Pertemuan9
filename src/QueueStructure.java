public class QueueStructure {
    private Node front;
    private Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    // fungsi enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // jika front kosong, maka front dan rear sama dengan newNode, jika tidak maka rear.next = newNode
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    // fungsi dequeue
    public void dequeue() {
        // jika front kosong, maka tandakan bahwa queue kosong
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        front = front.getNext();

        // jika front kosong, maka rear diisi dengan null
        if (front == null) {
            rear = null;
        }
    }

    // fungsi size
    public int size() {
        int size = 0;
        Node current = front;

        // selama current tidak kosong, maka size bertambah dan current diisi dengan current.next
        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    // fungsi front
    public int front() {
        // jika front tidak kosong, maka kembalikan data front, jika tidak kembalikan -1
        return front != null ? front.getData() : -1;
    }

    // fungsi displayElements
    public void displayElements() {
        // jika queue kosong, maka tampilkan pesan bahwa queue kosong
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }


        Node current = front;
        // selama current tidak kosong, tampilkan data current dan current diisi dengan current.next
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}
