/*
 * Lab12_Main.java
 * Christopher Bussen, bussenc1
 */

/*
 * Lab12_Main.java
 *
 * CPS 151
 * Algorithms & Programming II
 * Lab Project: Java Collections Framework (Priority Queues)
 *
 * name: Christopher Bussen
 */

import java.util.*;

public class Lab12_Main
{
    public static void main(String[] args)
    {
        final int NUM_APPTS = 20;
        final Random rand = new Random();
        Time nextStart, nextEnd;
        Appointment nextAppt;

        PriorityQueue<Appointment> apptBook = new PriorityQueue<Appointment>();
        LinkedList<Appointment> sortedBook = new LinkedList<Appointment>();

        /*
         * Lab 12.3: add NUM_APPTS Appointments to the apptBook priority queue by
         *           randomly generating start and end times.  Make sure the start
         *           time is prior to the end time for each appointment.
         *
         * *** ADD CODE AFTER THE FOLLOWING LINE ***
         */
        for(int i = 0; i < NUM_APPTS; i++){
            nextStart = new Time(rand.nextInt(), rand.nextInt());
            nextEnd = new Time(rand.nextInt(), rand.nextInt());
            nextAppt = new Appointment(nextStart, nextEnd);
            if(nextStart.compareTo(nextEnd) < 0) {
                apptBook.add(nextAppt);
            }
            else{
                i--;
            }
        }

        /*
         * Lab 12.3: output the apptBook.  In what order are the appointments listed?
         *           Copy/paste the output into the space provided on the lab project page.
         *
         * *** ADD CODE AFTER THE FOLLOWING LINE ***
         */
        System.out.println("Appointments:");
        System.out.println(apptBook);

        /*
         * Lab 12.3: remove each Appointment from the apptBook and add it to the
         *           (end of the) sortedBook linked list.
         *
         * *** ADD CODE AFTER THE FOLLOWING LINE ***
         */
        while(!apptBook.isEmpty()){
            sortedBook.add(apptBook.peek());
            apptBook.remove();
        }

        /*
         * Lab 12.3: use a for-each (enhanced for) loop to display the sortedBook,
         *           such that one Appointment is output per line
         *
         * *** ADD CODE AFTER THE FOLLOWING LINE ***
         */
        for(Appointment appt: sortedBook){
            System.out.println(appt);
        }

    } // end main
} // end Lab12_Main