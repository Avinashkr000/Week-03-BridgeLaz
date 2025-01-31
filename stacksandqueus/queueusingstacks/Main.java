import com.Day02.stacksandqueus.QueueUsingStacks;

public static void main(String[] args) {
    QueueUsingStacks queue = new QueueUsingStacks();

    // Enqueue elements
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    // Dequeue elements
    System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
    System.out.println("Dequeue: " + queue.dequeue()); // Output: 20

    // Enqueue another element
    queue.enqueue(40);

    // Peek at the front element
    System.out.println("Peek: " + queue.peek()); // Output: 30

    // Dequeue remaining elements
    System.out.println("Dequeue: " + queue.dequeue()); // Output: 30
    System.out.println("Dequeue: " + queue.dequeue()); // Output: 40

    // Check if the queue is empty
    System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
}