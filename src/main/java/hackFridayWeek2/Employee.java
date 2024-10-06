package hackFridayWeek2;

class Employee {
    
    // Data members
    private int salary;
    private int hoursPerDay;
    
    // Constructor
    public Employee(int salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay; 
    }
   //Set method
    public void setSalary(int salary) {
        if (salary < 500) {
            this.salary = salary + 10;
        } else {
            this.salary = salary; 
        }
        
    }
    
 // Set method to update hoursPerDay
    public void setHoursPerDay(int hoursPerDay) {
        if (hoursPerDay > 6) {
            this.salary += 5;
        }
        this.hoursPerDay = hoursPerDay;
        }
    
 // Return current salary
    public int getSalary() {
        return salary; 
    }
}


