/*
 * Appointment.java
 * Christopher Bussen, bussenc1
 */

public class Appointment implements Comparable<Appointment> {
    //declare instance variables for start and end times
    private Time startTime;
    private Time endTime;

    public Appointment(Time startTime, Time endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }//end Appointment constructor

    public Time getStartTime(){
        return startTime;
    }//end getStartTime method

    public Time getEndTime(){
        return endTime;
    }//end getEndTime method

    public void setStartTime(Time startTime){
        this.startTime = startTime;
    }//end setStartTime method

    public void setEndTime(Time endTime){
        this.endTime = endTime;
    }//end setEndTime method

    public String toString(){
        String result = startTime.toString();
        result = result + "-" + endTime.toString();
        return result;
    }//end toString method

    public int compareTo(Appointment other){
        return startTime.compareTo(other.getStartTime());
    }//end compareTo method

}//end public class Appointment
