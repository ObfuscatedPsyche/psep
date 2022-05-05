/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ManageBookings {
    private ArrayList<Lesson> timetable;
    private ArrayList<LessonBooking> bookings;
    
    
    public ManageBookings(ArrayList<Lesson> timetable, ArrayList<LessonBooking> bookings){
        this.timetable = timetable;
        this.bookings = bookings;
    }
    
    public ManageBookings(){
        //timetable = new ArrayList<Lesson>();
        timetable.add(new Lesson(new English(), 0));
        timetable.add(new Lesson(new Math(), 1));
        timetable.add(new Lesson(new VerbalReasoning(), 2));
        timetable.add(new Lesson(new NonVerbalReasoning(), 3));
        timetable.add(new Lesson(new Math(), 4));
        timetable.add(new Lesson(new English(), 5));
        //factory this
    }    
    
    public LessonBooking createBooking(Student student, Lesson lesson){
        // If 4 or less instances of Lesson in bookings
        return new LessonBooking(student, lesson);
    }
    

    
}
