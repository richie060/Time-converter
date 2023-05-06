import java.util.Scanner;

public class MilitaryTime {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the current time in military time
        System.out.print("Enter the current hour in military time (0-23): ");
        int currentHour = scanner.nextInt();

        // Prompt the user to enter the number of hours that have passed
        System.out.print("Enter the number of hours  passed: ");
        int hoursPassed = scanner.nextInt();

        // Calculate the new hour based on the current hour and hours passed
        int newHour = (currentHour + hoursPassed) % 24;

       
        String hourString;
        if (newHour < 10) {
            switch (newHour) {
                case 0:
                    hourString = "00";
                    break;
                case 1:
                    hourString = "01";
                    break;
                case 2:
                    hourString = "02";
                    break;
                case 3:
                    hourString = "03";
                    break;
                case 4:
                    hourString = "04";
                    break;
                case 5:
                    hourString = "05";
                    break;
                case 6:
                    hourString = "06";
                    break;
                case 7:
                    hourString = "07";
                    break;
                case 8:
                    hourString = "08";
                    break;
                case 9:
                    hourString = "09";
                    break;
                default:
                    hourString = "Invalid starting time was entered";
                    break;
            }
        } else {
            hourString = Integer.toString(newHour);
        }

        // Display the new time of day in military time
        System.out.println("The new time is: " + hourString );

        scanner.close();
    }
}
