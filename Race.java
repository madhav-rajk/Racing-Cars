
/**
 * Purpose of this class was to make methods that can use race times given by
 * the user to find the fastest, medium and slowest times, find the range and
 * the average of the 3 times given.
 *
 * Madhav Rajkondawar
 *
 * 3/10/19
 */
public class Race {
    /*
     * all instance variables below are private, since none of them will be
     * assigned in either of the 2 other classes. the first 3 variables are
     * to assign the 3 given times by the user to the variables in this class.
     * The 3 next variables are also instance variables because the min, mid,
     * max will be needed to calculate the average of all in the average
     * method, and the min and max will be needed to find the range of the
     * times in the race.
     */
    private double raceTime1;
    private double raceTime2;
    private double raceTime3;
    private double minVal;
    private double midVal;
    private double maxVal;

    /*
     * empty constructor with no arguments so the RaceReport class can use it
     * to call other methods from the class, since that class will only have
     * writeReport method, which will not be assigning any values, but will
     * only organize all the methods in the order they are to be displayed in
     * the execution of the code in the main ReportDriver class.
     * @param none
     */
    public Race()
    {
    }
    
    /*
     * The purpose of the method below was that it sets the first time 
     * given by the user to the first race Time variable in this Race 
     * class. 
     * @param time1
     */
    public void setTime1(double time1)
    {
        this.raceTime1 = time1;
    }
    
    /*
     * The purpose of the method below was that it sets the second time 
     * given by the user to the second race Time variable in this Race 
     * class. 
     * @param time2
     */
    public void setTime2(double time2)
    {
        this.raceTime2 = time2;
    }
    
    /*
     * The purpose of the method below was that it sets the third time 
     * given by the user to the third race Time variable in this Race 
     * class. 
     * @param time3
     */
    public void setTime3(double time3)
    {
        this.raceTime3 = time3;
    }

    /*
     * uses the local sortTimesAscending method, which, as mentioned below,
     * sorts the 3 numbers by the First, Second and Third place, comparing
     * the three numbers using the Math.max and Math.min methods. Then,
     * prints all the required First, Second and Third place values, all
     * rounded to 1 digit after the decimal. 
     * @param none
     */
    public void getSortTimesAscending()
    {
        sortTimesAscending();
    }

    /*
     * the purpose of this method was to sort 3 numbers in ascending order.
     * First, I took the minimum of the first 2 numbers, which was a
     * temporary minimum, and then took the other number from the two as the
     * temporary max, then compared the temporary minimum of first 2 to the
     * 3rd number, and then that gave me the final Minimum value, and took
     * the maximum of the tempMin and 3rd number as the temporary maximum.
     * Then, I compared the 2 temporary maximums and the smaller value became
     * the middle value and the bigger value became the final maximum value.
     * Then, I printed the first, second, and third value, where the minValue
     * was first, since the lowest number is best in racing, meaning the
     * fastest. Used a printf to round each value to 1 decimal.
     * @param none
     */
    private void sortTimesAscending()
    {
        double tempMin = Math.min(raceTime1,raceTime2);
        double tempMax1;

        if(tempMin == raceTime1)
        {
            tempMax1 = raceTime2;
        }
        else
        {
            tempMax1 = raceTime1;
        }

        minVal = Math.min(tempMin,raceTime3);
        double tempMax2;

        if(minVal == tempMin)
        {
            tempMax2 = raceTime3;
        }
        else
        {
            tempMax2 = tempMin;
        }

        midVal = Math.min(tempMax1,tempMax2);
        maxVal = Math.max(tempMax1,tempMax2);

        System.out.printf("First place (time in seconds): %.1f %n", minVal);
        System.out.printf("Second place (time in seconds): %.1f %n", midVal);
        System.out.printf("Third place (time in seconds): %.1f %n", maxVal);
        System.out.println();
    }

    /*
     * uses the local overlapMessage method, which, as mentioned below,
     * checks to see if any of the three numbers input by the user are 
     * equal to each other, and if all are the same, or if first 2 are the 
     * same or if the latter 2 are the same, then the appropriate message
     * is displayed. 
     * @param none
     */
    public void getOverlapMessage()
    {
        overlapMessage();
    }

    /*
     * The purpose of this method was to print a message stating whether any
     * of the values are equal to each other, and if so, an appropriate
     * message is displayed showing the same. If first 2 values are the same,
     * then it should say that 2 values tied for first place or the same
     * happened for 2nd and 3rd, then 2 values tied for second place should
     * be displayed.
     * @param none
     */
    private void overlapMessage()
    {
        if(minVal == midVal && midVal == maxVal)
        {
            System.out.println("All three racers shared first place.");
        }
        else if(minVal == midVal)
        {
            System.out.println("Two racers shared first place.");
        }
        else if(midVal == maxVal)
        {
            System.out.println("Two racers shared second place.");
        }
        else
        {
            System.out.println("None are tied (No Overlap).");            
        }
    }

    /*
     * uses the local findRange method, which subtracts the maxVal from the 
     * minVal, takes the absolute value to make sure the value is positive
     * then prints the appropriate message stating the range of the race times.
     * @param none
     */
    public void getRange()
    {
        findRange();
    }

    /*
     * The purpose of this method was to find the range, and for that, uses
     * the .abs function where the value found will be made positive, where the
     * value in our case will be the fastest time minus the slowest value,
     * which will be the min value minus the max value. The method will then
     * print the suited result stating the range of the race times.
     * @param none
     */
    private void findRange()
    {
        double range = Math.abs(minVal - maxVal);
        System.out.printf("The range of the race times (in seconds): %.1f %n"
        ,range);
    }
    
    /*
     * uses the local findAverage method, which takes the average of all the 
     * times provided by the user and prints the appropriate message stating 
     * the average of the nums. 
     * @param none
     */
    public void getAverage()
    {
        findAverage();
    }

    
    /*
     * The purpose of this method was to find the average of the 3 numbers
     * given by the user, which would be the raceTime 1, 2 and 3. The average
     * will be the 3 numbers divided by number of values, which is 3 in our
     * case. The method will then print the suited result stating the average
     * of the race times.
     * @param none
     */
    private void findAverage()
    {
        double average = (raceTime1 + raceTime2 + raceTime3) / 3;
        System.out.printf("The average time of all racers (in seconds): %.2f %n"
        ,average);
        System.out.println();
    }
}