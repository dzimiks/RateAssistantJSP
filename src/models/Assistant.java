package models;

import java.util.Objects;

public class Assistant {

	private String firstName;
	private String lastName;

	public Assistant(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Assistant assistant = (Assistant) o;

		return Objects.equals(firstName, assistant.firstName) &&
				Objects.equals(lastName, assistant.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Assistant: " + firstName + " " + lastName;
	}
}
