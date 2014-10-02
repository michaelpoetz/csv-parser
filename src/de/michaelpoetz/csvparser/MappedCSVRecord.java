package de.michaelpoetz.csvparser;

class MappedCSVRecord {
	private String name;

	private String address;

	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MappedCSVRecord [name=" + name + " , address=" + address + " , age=" + age + "]";
	}

}