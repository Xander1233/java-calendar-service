
// Abstract class so no object can be created from this class
// It can only be extended from another class
public abstract class Appointment {

	// Protected properties for access in child classes
	protected int day, month, year;
	protected String desc;

	// Constructor
	public Appointment(int day, int month, int year, String desc) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.desc = desc;
	}

	// Define an abstract method which has to be defined by child classes
	public abstract boolean occursOn(int day, int month, int year);

	// Getter and setter methods
	public int getDay( ) {
		return day;
	}

	public int getMonth( ) {
		return month;
	}

	public int getYear( ) {
		return year;
	}

	public String getDesc( ) {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
