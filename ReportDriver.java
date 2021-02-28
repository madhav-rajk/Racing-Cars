/**
 * Purpose of this class was to ask the user to enter 3 race times, and then
 * print a report that includes the sorting of all the times in the ascending
 * order where the times are printed, then the range and the average of all
 * the times is given. And then, depending on how the values compare, an
 * appropriate message will be displayed which says if any values are equal.
 *
 * Madhav Rajkondawar
 *
 * 3/10/19
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * The main purpose of this main RaceDriver class was to ask the user for 3
 * times, then use those times to make a report of which times is first,
 * second, third and then give a range, average of those times. Then, if any
 * of the values are equal, then the appropriate message will be displayed.
 */
public class ReportDriver {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        boolean goAgain = true;

        //repeats till user doesn't want to enter another race
        while(goAgain) {
            System.out.println("Enter the race times (in seconds):");

            //since there are only 3 values, saves all of them in an array of
            // size 3
            double[] arrayOfRaceTimes = new double[3];
            int i = 0;

            //repeats until 3 values in the array at the index are saved
            while(i < 3)
            {
                arrayOfRaceTimes[i] = keyboard.nextDouble();
                i++;
            }
            System.out.println();

            //creates a new object of the Race class to save all the 3 values
            // of raceTimes variables in that class through the setter method
            // for each time, for all three times
            Race race = new Race();
            race.setTime1(arrayOfRaceTimes[0]);
            race.setTime2(arrayOfRaceTimes[1]);
            race.setTime3(arrayOfRaceTimes[2]);           
            

            //creates a new object of the RaceReport class to save the Race
            // object and report all the required information using the data
            // given by the user for the particular object of Race. 

            RaceReport raceReport = new RaceReport(race);
            //raceReport.testVariableValues();
            raceReport.writeReport();
            System.out.print("Enter another race? (y/n): ");
            String answer = keyboard.next();
            System.out.println();

            //if user says no, the goAgain variable is false, which will
            // break the while loop and the program will end.
            if(answer.equals("n"))
            {
                goAgain = false;
                keyboard.close();
            }
        }
    }
}
