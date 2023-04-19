record Person (String firstName, String lastName) {
	static int x=42;
	public static void erhoeheX(){
		x++;
	}
	public String getName(){
		return firstName + ", " + lastName;
	}
}

