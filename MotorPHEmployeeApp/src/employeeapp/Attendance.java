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
    public static void readAttendanceCSV() {
       
    }
    
    //calculate Daily Total Hours
    public static double calculateDailyTotalHours() {
    	
    }
    
    //calculate Weekly Total Hours
    public static double calculateWeeklyTotalHours() {
    	
    }

    //calculate Monthly Total Hours
    public static double calculateMonthlyTotalHours() {
    	
    }

    }

