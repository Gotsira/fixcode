package fixcode;

/**
 * A simple model for a student with a name.
 * @author Sirasath Piyapootinun
 *
 */

public class Student extends Person {
	private long id;
	
	/**
	 * Initialize a Student object.
	 * @param name is the name of the student.
	 * @param id is the id number of the student.
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 *@return the string representation of this Student.
	 */
	
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compares the student by name.
	 * The are equal if the name matches.
	 * @param obj is any object which is used to create a Student to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if ( obj.getClass() != this.getClass() ) {
			return false;
		}
		Student other = (Student) obj;
		if ( name.equalsIgnoreCase( other.name ) ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the id of the student.
	 * @return id number of the student.
	 */
	
	public long getId() {
		return id;
	}
	
	/**
	 * Sets the id of the student.
	 * @param id is the id number of the student.
	 */

	public void setId(long id) {
		this.id = id;
	}
}
