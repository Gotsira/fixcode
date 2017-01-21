package fixcode;

/**
 * A simple model for a person with a name.
 * @author Sirasath Piyapootinun
 */

public class Person {
	
	/*
	 * the person's full name. 
	 */
	
	public String name;
	
	/**
	 * Initialize a new Person object.
	 * @param name is the name of the person.
	 */
	
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Get the person's name.
	 * @return the name of the person.
	 */
	
	public String getName() {
		return name;
	}

	
	/**
	 * Set or change the person's name.
	 * @param newname is the new name of the person.
	 */
	
	public void setname(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param obj is any object which is used to create a Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if ( obj.getClass() != this.getClass() ) {
			return false;
		}
		Person other = (Person) obj;
		if ( name.equalsIgnoreCase( other.name ) ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Get a string representation of this Person.
	 * @return the person's name.
	 */
	
	public String toString() {
		return "Person " + name;
	}
}
