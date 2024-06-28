package Queue;

public class QueueByLL {
    int data;
    QueueByLL next;
    static QueueByLL front = null, rear = null, temp;

    QueueByLL(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        QueueByLL.enQueue(10);
        QueueByLL.enQueue(20);
        QueueByLL.enQueue(30);
        QueueByLL.enQueue(40);
        QueueByLL.enQueue(60);
        QueueByLL.enQueue(70);
        QueueByLL.display();
        QueueByLL.deQueue();
        QueueByLL.deQueue();
        QueueByLL.deQueue();
        QueueByLL.display();
    }

    public static void enQueue(int data) {
        QueueByLL temp = new QueueByLL(data);
        System.out.println("Insert element " + data);
        if (front == null)
            front = temp;
        else
            rear.next = temp;
        rear = temp;
    }

    public static int deQueue() {
        if (front == null) {
            System.out.println("Queue is underflow");
            return 0;
        }
        QueueByLL temp = front;
        System.out.println("Delete element from queue" + temp.data);
        front = front.next;
        if (front == null)
            rear = null;
        return temp.data;
    }

    public static void display() {
        temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
