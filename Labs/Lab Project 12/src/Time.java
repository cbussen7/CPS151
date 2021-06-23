/*
 * Time.java
 * Christopher Bussen, bussenc1
 */

/*
 * Time.java
 *
 * represents a time as numbers of hours and minutes
 *   in a 24-hour clock (0 hours == midnight)
 */

public class Time implements Comparable<Time>
{
    private int hours, mins;
    public static final int NUM_HOURS=24; // 24 hours in a day
    public static final int NUM_MINS=60;  // 60 minutes in an hour

    public Time(int hours, int mins)
    {
        setHours(hours);
        setMins(mins);
    } // end constructor

    /**
     * sets the hours data field to the given parameter
     *   uses absolute value of parameter (in case param is neg)
     *   sets value of data field to 0...23 (using remainder)
     *
     * @param hours given number of hours
     */
    private final void setHours(int hours)
    {
        this.hours = Math.abs(hours) % NUM_HOURS;
    } // end setHours

    /**
     * sets the mins data field to the given parameter
     *   uses absolute value of parameter (in case param is neg)
     *   sets value of data field to 0...59 (using remainder)
     *
     * @param mins given number of minutes
     */
    private final void setMins(int mins)
    {
        this.mins = Math.abs(mins) % NUM_MINS;
    } // end setMins

    /**
     * returns this as a string: hh:mm
     */
    @Override
    public String toString()
    {
        String hrStr = Integer.toString(hours);
        if (hrStr.length()<2) {
            hrStr = "0"+hrStr;
        }
        String minStr = Integer.toString(mins);
        if (minStr.length()<2) {
            minStr = "0"+minStr;
        }
        return hrStr+":"+minStr;
    }

    /**
     * compares two times by hours; if same, uses mins
     *
     * @param other the explicit Time parameter
     * @return 0 if this==other, <0 if this<other, >0 if this > other
     */
    @Override
    public int compareTo(Time other)
    {
        int result = hours - other.hours;
        if (result == 0) {
            result = mins - other.mins;
        }
        return result;
    } // end compareTo

} // end Time