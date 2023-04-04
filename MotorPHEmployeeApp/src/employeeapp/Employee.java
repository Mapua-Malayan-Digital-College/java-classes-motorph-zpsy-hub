package employeeapp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public String id;
	public String lastName;
	public String firstName;
	public String birthday;
	public double hourlyRate;
	
    //constructor
    public Employee(String id, String lastName, String firstName, String birthday, double hourlyRate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.hourlyRate = hourlyRate;
    }

    // getters and setters
	/*public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }*/
    
    //method to read emoloyee csv 
    public static void readEmployeeCSV() {
    	
    }
    /*// Initialize list of employees, total hours worked, and days worked to 0
    ArrayList<Employee> employees = new ArrayList<>();
    
    try {
        // Create a new Scanner to read the employee data file
        File employeeFile = new File(employee_data.csv");
        scanner = new Scanner(employeeFile);

        // Loop through the lines in the employee data file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(",");

            // Parse the fields from the line
            String id = fields[0];
            String lastName = fields[1];
            String firstName = fields[2];
            String birthday = fields[3];
           	double hourlyRate = Double.parseDouble(fields[5]);

            // Create a new employee object and add it to the list of employees
            employees.add(new Employee(id, lastName, firstName, birthday, basicSalary, hourlyRate));
        }*/
}
    
