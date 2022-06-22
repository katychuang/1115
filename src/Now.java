/* Example showing use of java.util.Data class and current date
*/
import java.util.Date;

public class Now {

    public static void main(String[] args) {
        // Instantiate a Date object
        Date date = new Date();

        // display current time and date using toString()
        System.out.println(date.toString());

        // display current month (note that January starts from 0)
        System.out.println(date.getMonth());

        // creating a new date with Dec 31, 2021 to compare dates
        Date date2 = new Date(121, 11, 31);
        System.out.println(date2.toString());

        // check if 12/31/2021 comes after today
        if (date2.after(date)){
          System.out.println("Yes it's after!");
        } else {
          System.out.println("No, 2021 is before 2022");
        }
    }
}
