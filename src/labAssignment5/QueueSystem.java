package labAssignment5;

public class QueueSystem {
    private static QueueSystem instance;
    private int currentQueueNumber;

    private QueueSystem() {
        currentQueueNumber = 0;
    }

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        currentQueueNumber++;
        System.out.println("New individual received queue number: " + currentQueueNumber);
        return currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        System.out.println("MONITOR: Displaying current queue number: " + currentQueueNumber);
        return currentQueueNumber;
    }

    public synchronized void resetQueue(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
        System.out.println("--- QUEUE RESET ---");
        System.out.println("Help Desk reset the queue. New number is: " + newQueueNumber);
    }
}