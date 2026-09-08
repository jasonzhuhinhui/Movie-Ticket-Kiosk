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
    public static String getSeat(){
        int row = (int)(Math.random()*10+1);
        int seat = (int)(Math.random()*20+1);
        String seatnum = "Row " + row + "    Seat " + seat;
        return seatnum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double ticket = 12.50;
        double popcorn = 6.75;
        double drink = 4.25;

        System.out.println("=================================================================\n");
        System.out.println("Welcome to the Starlight Cinema kiosk!\n");
        System.out.println("=================================================================\n");
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

        double subtotal = ticket*numTicket + popcorn*numPopcorn + drink*numDrink;
        int discount = (int)(Math.random()*10 +6);

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("                 STARLIGHT CINEMA - MOVIE TICKET          ");
        System.out.println("=================================================================");
        System.out.println("Booking code   : " + getBookingCode(title));
        System.out.println("Customer       : " + name + "  (" + getInitial(name)+")");
        System.out.println("Movie          : " + title);
        System.out.println("Seat           : " + getSeat());

        System.out.println("=================================================================");
        System.out.println("ITEM                       QTY         PRICE          TOTAL");
        System.out.println("Ticket                     "+numTicket+"            "+"$"+ticket+"        $"+ticket*numTicket);
        System.out.println("Popcorn                    "+numPopcorn+"            "+"$"+popcorn+"        $"+popcorn*numPopcorn);
        System.out.println("Drink                      "+numDrink+"            "+"$"+drink+"        $"+drink*numDrink);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Subtotal                                             $"+subtotal);
        System.out.println("Member discount ("+discount+"%)                                -$"+discount*0.01*subtotal);
        System.out.println("Tax (8.25%)                                          $"+(subtotal - discount*0.01*subtotal)*0.00825);
        System.out.println("TOTAL                                                $"+(subtotal - discount*0.01*subtotal + (subtotal - discount*0.01*subtotal)*0.0825));
        
        System.out.println("=================================================================");
        System.out.println("Thank you, "+getInitial(name)+" - enjory "+title+"!");
        System.out.println("=================================================================");
    }
    
}
