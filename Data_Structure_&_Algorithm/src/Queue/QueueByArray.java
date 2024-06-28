package Queue;

public class QueueByArray {
    static int[] data;
    static int front, rear, size;

    QueueByArray(int s) {
        size = s;
        front = rear = -1;
        data = new int[size];
    }

    public static void main(String[] args) {
        QueueByArray que = new QueueByArray(5);
        enQueue(10);
        // enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(50);
        enQueue(60);
        System.out.println("Insertion in Queue");
        display();
        deQueue();
        deQueue();
        deQueue();
        deQueue();
        deQueue();
        deQueue();
//       display();
    }

    public static void enQueue(int val) {
        if (front == 0 && rear == size - 1) {
            System.out.println("Queue is overflow");
        } else if (front == -1) {
            front = rear = 0;
            data[front] = val;
        } else {
            rear++;
            data[rear] = val;
        }
        System.out.print(data[rear] + " , " + front + " , " + rear);
        System.out.println();
    }

    public static void deQueue() {
        if (front == -1 && rear == -1)
            System.out.println("Queue is underflow");
        else if (front == rear) {
            System.out.println("Delete element from queue " + data[front]);
            front = rear = -1;
        } else {
            System.out.println("Delete element from queue " + data[front]);
            front++;
        }
    }

    public static void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

}
