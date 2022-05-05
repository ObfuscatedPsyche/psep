/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming;

/**
 *
 * @author user
 */
public class LessonBooking {
    private Student student = null;
    private Lesson lesson = null;
    private boolean checkedIn = false;
    private String review = null;
    
    public LessonBooking(Student student, Lesson lesson){
        this.student = student;
        this.lesson = lesson;
    }
    
    public int checkIn(){
        this.checkedIn = true;
        return 0;
    }
    
}


