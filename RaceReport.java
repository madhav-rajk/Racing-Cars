/**
 * Purpose of this class was to make a method that will write a report using
 * all the values given by the user in the RaceDriver method, and making use
 * of all the methods created in the Race class.
 *
 * Madhav Rajkondawar
 *
 * 3/10/19
 */
public class RaceReport {
    /*
     * created a local object of the Race class so that all the values that
     * are given by the user for the particular object will be saved into the
     * local instance of Race class, so that all the values are saved in the
     * Race class, and the stats are represented accurately.
     */
    private Race raceClass;

    /*
     * constructor with an object of Race class as a parameter, since there
     * is an object created of the Race class, so that all the methods from
     * that class can be used, with the addition that the values given by the
     * user for the particular object are saved in the Race class.
     * @param raceC
     */
    public RaceReport(Race raceC)
    {
        this.raceClass = raceC;
    }

    /*
     * created a method called writeReport, whose purpose was to first report
     * the sorted times in ascending order, then prints if any of the
     * values are equal, printing their sharing of first or second place or all
     * of them sharing first place. Then gives the range of all times and then
     * the average, all of which were methods in the Race class. The instance
     * variable created above called raceClass was used to report the outputs
     * of all the methods, which will save all the 3 values given by the user
     * for the particular object of the Race class.
     * @param none
     */
    public void writeReport()
    {
        raceClass.getSortTimesAscending();
        raceClass.getOverlapMessage();
        raceClass.getRange();
        raceClass.getAverage();
    }

    /*
     * created a method called testVariableValues, whose purpose is to check
     * whether the report values are accurate and whether the given output is
     * the required output, and the printed lines are identical to the lines
     * required.
     * @param none
     */
    public void testVariableValues()
    {
        // the first method should print "First place (time in seconds)",
        // "Second place" and "Third place" and then values after each line.
        // the second method should print "Two racers shared first/second
        // place" or "All racers shared first place" or nothing, by comparing
        // all the values. The third method should print "The range of all
        // race times", and then the corresponding number, which would be the
        // first place minus the last place. The last method should print
        // "The average of all race times" and then the average of all times
        // provided by the user.        
        raceClass.getSortTimesAscending();
        raceClass.getOverlapMessage();
        raceClass.getRange();
        raceClass.getAverage();

    }
}
