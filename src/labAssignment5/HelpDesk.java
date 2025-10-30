package labAssignment5;

public class HelpDesk {
    public static void main(String[] args) {
        System.out.println("Help Desk 1 is online.");
        QueueSystem desk1 = QueueSystem.getInstance();

        System.out.println("Help Desk 2 is online.");
        QueueSystem desk2 = QueueSystem.getInstance();

        desk1.getNextQueueNumber(); // Issues number 1
        desk2.getNextQueueNumber(); // Issues number 2

        System.out.println("\nOnline Monitoring System is checking...");
        QueueSystem monitor = QueueSystem.getInstance();
        monitor.getCurrentQueueNumber();

        desk1.getNextQueueNumber(); // Issues number 3

        System.out.println("\nHelp Desk 3 is online and resetting the queue...");
        QueueSystem desk3 = QueueSystem.getInstance();
        desk3.resetQueue(0); // Reset queue

        System.out.println("\nA new individual arrives...");
        desk1.getNextQueueNumber();  // Issues new queue

        System.out.println("\nOnline Monitoring System is checking...");
        monitor.getCurrentQueueNumber();
    }
}