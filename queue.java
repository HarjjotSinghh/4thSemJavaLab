
public class queue {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if ((front == 0) && (rear == size - 1)) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    void enqueue(int elem) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front++;
            }
            rear++;
            items[rear] = elem;
            System.err.println("Inserted element: " + elem);
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int elem = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted element: " + elem);
            return elem;
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front index: " + front);
            System.out.println("Items in the queue: ");
            for (i = 0; i <= rear; i++) {
                System.out.print(items[i] + ", ");
            }
            System.err.println();
            System.out.println("Rear index: " + rear);
        }
    }

    public static void main(String[] args) {
        queue queue = new queue();
        queue.dequeue();
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        queue.enqueue(20);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Harjot Singh Rana | 11576802722 | CSE 3");

    }
}
