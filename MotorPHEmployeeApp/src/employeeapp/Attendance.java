package employeeapp;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    public String empID;
    public LocalDate date;
    public LocalTime timeIn;
    public LocalTime timeOut;
    
    // constructor
    /*public Attendance(String empID, LocalDate date, LocalTime timeIn, LocalTime timeOut) {
        this.empID = empID;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }*/
    
    // getters and setters
    
    // read attendance from CSV file and store in array
    public static readAttendanceCSV() {
       
    }
    
    // calculate total hours worked in a month
    public static double calculateTotalHours() {
        
    }
    
    // calculate total days worked in a month
    public static int calculateTotalDays() {
        
    }
    
    // check if employee was late
    public static boolean checkLate() {
        
    }
     
    // check if employee was absent
    public static boolean checkAbsent() {
        
    }
    
    // check if employee has overtime
    public static boolean checkOvertime() {
        
    }
    
    // calculate for overtime
    public static double calculateOvertime() {
       
    }
}
