package de.michaelpoetz.csvparser;

public class CSVParsingException extends Exception {

	private static final long serialVersionUID = 1L;
	private final String message;

	public CSVParsingException(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.err.println(message);
	}
}
