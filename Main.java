public class Main {
    public void main() {
        // Initializing an array of size 12
        int[] daysInMonth = new int[12];
        // Initialize the ‘daysInMonth’ array with the number of days for each month
        daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // Declare and initialize a String array 'monthNames' with the names of the
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        // Use a for loop to iterate through 'daysInMonth'
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + ":" + daysInMonth[i] + "days");
        }
    }
}
