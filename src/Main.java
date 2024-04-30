public class Main {
    public static void main(String[] args) {
        QueueStructure queue = new QueueStructure();

        System.out.println("---Sebelum enque 3x---");
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.print("Queue Elements: ");
        queue.displayElements();

        System.out.println("\n---Enque 3x---");

//        queue.enqueue(3);
//        queue.enqueue(0);
//        queue.enqueue(11);

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        queue.dequeue();

        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.print("Queue Elements: ");
        queue.displayElements();
        System.out.println("\nFront: " + queue.front());

    }
}
