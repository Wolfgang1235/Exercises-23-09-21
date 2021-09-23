class Datamatik {

	public static void main(String args[]) {
		Teacher a1 = new Teacher("Odin", 33, false);
		Student a2 = new Student("Andreas", 22, false, 5);
		Student a3 = new Student("Monica", 26, true, 13);

		System.out.println(a1.name);
		System.out.println(a2.name +" "+ a2.datamatikerTeam +" "+ a3.name +" "+ a3.datamatikerTeam);

	}
}