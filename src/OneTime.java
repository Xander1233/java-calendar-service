public class OneTime extends Appointment {

	// Constructor
	public OneTime(int day, int month, int year, String desc) {
		super(day, month, year, desc);
	}

	// Define the abstract method "occursOn" from the class Appointment
	// This is needed because we defined an abstract method "occursOn" inside the class Appointment
	// Otherwise, if not defined, an error would occur
	public boolean occursOn(int day, int month, int year) {
		return this.day == day && this.month == month && this.year == year;
	}

}
