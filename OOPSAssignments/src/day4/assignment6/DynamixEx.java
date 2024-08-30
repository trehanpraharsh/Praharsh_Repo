package day4.assignment6;

public class DynamixEx {

    public static void main(String[] args) {
        // Create an instance of DayScholar with the required parameters
        DayScholar dayScholar = new DayScholar(101, 'B', "Praharsh", 5000, "Gandhidham, GJ");

        // Setting additional details
        dayScholar.setStudentName("Praharsh Trehan");
        dayScholar.setResidentialAddress("Gandhidam, GJ");

        // Print details
        dayScholar.getDetails();
    }
}
