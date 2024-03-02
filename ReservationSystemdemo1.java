class ReservationSystem {
    private static int availableSeats = 100;

    public synchronized void reserve(String personName, int requestedSeats) {
        System.out.println(personName + " entered.");
        System.out.println("Available seats: " + availableSeats + " Requested seats: " + requestedSeats);

        if (availableSeats >= requestedSeats) {
            System.out.println("Seat Available. Reserve now :-)");
            availableSeats -= requestedSeats;
            System.out.println(requestedSeats + " seats reserved.");
        } else {
            System.out.println("Not enough seats available. Reservation failed.");
        }

        System.out.println(personName + " leaving.");
    }
}

class PersonThread extends Thread {
    private ReservationSystem reservationSystem;
    private String personName;
    private int requestedSeats;

    public PersonThread(ReservationSystem reservationSystem, String personName, int requestedSeats) {
        this.reservationSystem = reservationSystem;
        this.personName = personName;
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run() {
        reservationSystem.reserve(personName, requestedSeats);
    }
}

public class ReservationSystemdemo1 {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        // Create multiple PersonThread instances to simulate multiple persons trying to reserve seats
        PersonThread person1 = new PersonThread(reservationSystem, "Person-1", 5);
		PersonThread person4 = new PersonThread(reservationSystem, "Person-4", 25);
        PersonThread person2 = new PersonThread(reservationSystem, "Person-2", 20);
        PersonThread person3 = new PersonThread(reservationSystem, "Person-3", 10);

        // Start the threads
		person4.start();
        person1.start();
        person2.start();
        person3.start();
		
    }
}