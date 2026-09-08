import java.util.Scanner;
public class MovieTicketKiosk {
    
    public static String getInitial(String name){
        int spaceIndex = name.indexOf(" ") ;
        String firstName = name.substring(0,1);
        String lastName = name.substring(spaceIndex+1, spaceIndex +2);
        String initial = firstName + lastName;
        return initial.toUpperCase();
    }
    public static String getBookingCode(String title){
        int code = (int)(Math.random() * 900 + 100);
        String movie = title.substring(0,3).toUpperCase();
        String bookingcode = (movie + "-" + code);
        return bookingcode;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=================================================================\n");
        System.out.println("Welcome to the Starlight Cinema kiosk!\n");
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();
        System.out.print("Please enter the movie title: ");
        String title = input.nextLine();
        System.out.print("Please enter the number of ticket you like to purchase: ");
        int numTicket = input.nextInt();
        System.out.print("Please enter the number of popcorn bag you like to purchase: ");
        int numPopcorn = input.nextInt();
        System.out.print("Please enter the number of drinks you like to purchase: ");
        int numDrink = input.nextInt();


    }
    
}
