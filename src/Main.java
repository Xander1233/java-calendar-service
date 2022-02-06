import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Create a scanner obviously
		Scanner sc = new Scanner(System.in);

		// Create an array of appointments with a size of 5 and instantly declare the content of the array
		Appointment[] appointments = {
				new OneTime(2, 2, 2022, "Root Canal"),
				new OneTime(12, 6, 2020, "Teeth Cleaning"),
				new OneTime(20, 8, 2021, "Filling"),
				new OneTime(11, 1, 2010, "Crown"),
				new OneTime(25,4,2019, "Dentures")
		};

		// doLoop is a label of the loop for further usage inside the loops
		// Good for nested loops and navigation inside them
		doLoop: do {

			System.out.println("Day:");
			int day = sc.nextInt();

			System.out.println("Month:");
			int month = sc.nextInt();

			System.out.println("Year:");
			int year = sc.nextInt();

			// For loop to loop over each appointment
			// An enhanced for loop would be better tho
			for (int i = 0; i < appointments.length; i++) { // Usage for enhanced loop: for (Appointment appointment : appointments)

				// Check if the current appointment is on the provided date
				if (appointments[i].occursOn(day, month, year)) {

					// Print it
					System.out.println("You have a " + appointments[i].getDesc() + " appointment on: " + day + '.' + month + '.' + year);

					// Break out of the do...while loop using the label mentioned earlier
					// Otherwise it would break out of the for loop and still continue with the do..while loop which we don't want
					// Subsequently this makes the usage of a variable called "running" redundant
					break doLoop;
				}
			}

			System.out.println("Please enter the correct date to search for appointment");

		} while (true); // Loop an infinite amount of iterations. It will break if a valid date is inserted
	}

}
