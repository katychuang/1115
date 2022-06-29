/* Calculate the average using input from program parameters */

public class Average {
  public static void main(String[] args){
    // Print the input elements
    // System.out.printf("%s %s %s\n", args[0],args[1],args[2]);

    int sum = 0;
    int i; 

    // scan through args
    for(i=0;i<args.length;i++){

      // if the value is a valid number, increase sum
      try {

        // convert to integer value
        int num = Integer.valueOf(args[i]);

        if(num >= 0)
          sum += num;
        else
          break;

        System.out.printf("num = %d; sum = %d; i = %d\n", num,sum,i);

      } catch (Exception e) {
        System.out.println("error with input " + args[i]);
        break;
      }
    } // end for loop

    // print values
    System.out.println("Program Ended. \nThe sum is " + sum);
    System.out.println("Average is " + (sum/i) );
    System.out.println("i = " + i);
  }
}
