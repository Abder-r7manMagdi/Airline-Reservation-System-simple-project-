import java.util.*;
public class Main {

    public static void main(String[] args) {
        int flightsNumber=5;
        int capacity=10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of daily flights: ");
        flightsNumber=input.nextInt();
        Flight[] flight = new Flight[flightsNumber];
        Passenger[] passengers = new Passenger[capacity];
        flight=addFlights(flight,flightsNumber);
        System.out.print("Enter the Capacity of Every daily flight: ");
        capacity=input.nextInt();
        System.out.println("Flights to choose from");
        for (int i=0;i<flight.length;i++){
            System.out.println("Flight number: "+(i+1));
            flight[i].shaw();
            if (i==flight.length-1)break;
            System.out.println("-----------------");
        }
        addPassengers(passengers,capacity,flight);


    }
    public static void addPassengers(Passenger[] passengers,int numOfPassengers,Flight[] flights){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the passengers data ");
        System.out.println("---------------------------");
        int i = 0;
        while (i < numOfPassengers) {
            System.out.print("Passenger number " + (i + 1) + " Full name: ");
            String tempName = input.next();
            System.out.print("Passenger number " + (i + 1) + " Id:");
            int tempId = input.nextInt();
            System.out.print("Choose flight_number For Passenger number " + (i + 1) +":");
            int tempFNum = input.nextInt();
            passengers[i] = new Passenger(tempName ,tempId,tempFNum,(i+1));
            System.out.println("Your flight info : " );
            flights[(tempFNum-1)].shaw();
            System.out.println("---------------------------");
            i++;
        }
    }
    public static Flight[] addFlights(Flight[] flight, int flightsNumber){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the flights data ");
        System.out.println("---------------------------");
        int i = 0;
        while (i < flightsNumber) {
            System.out.print("Flight number " + (i + 1) + " From: ");
            String tempFrom = input.next();
            System.out.print("Flight number " + (i + 1) + " To:");
            String tempTo = input.next();
            System.out.print("Flight number " + (i + 1) + " Time(hh:mm): ");
            String tempTime = input.next();
            System.out.print("Flight number " + (i + 1) + " Ticket Price: ");
            int tempPrice = input.nextInt();
            flight[i] = new Flight(tempFrom, tempTo, tempTime,tempPrice);
            System.out.println("---------------------------");
            i++;
        }
        return flight;
    }


}