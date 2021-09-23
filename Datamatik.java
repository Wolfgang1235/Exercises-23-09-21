class Datamatik {
    
    // 5.a Create a new class Datamatik or reuse the one you created earlier. 
    // Add an array of Students with 10 elements in it. This should be a class 
    // variable (static). From the main method, add 10 student instances to the array. 
    // Each student must have a unique reference.
    public static void main(String args[]) {
        Student[] studentClass = new Student[10];
        studentClass[0] = new Student("Andreas", 22, false, 5);
        studentClass[1] = new Student("Hans", 26, false, 3);
        studentClass[2] = new Student("Xander", 19, false, 1);
        studentClass[3] = new Student("Tanja", 21, true, 1);
        studentClass[4] = new Student("Sasha", 26, true, 2);
        studentClass[5] = new Student("Thor", 23, false, 3);
        studentClass[6] = new Student("Jan", 30, false, 4);
        studentClass[7] = new Student("Henrik", 26, false, 2);
        studentClass[8] = new Student("Elle", 24, true, 5);
        studentClass[9] = new Student("Ra", 5000, false, 4);
        

        printName(studentClass, 0);
        printName(studentClass, 4);
        printName(studentClass, 5);
        printName(studentClass, 9);

        System.out.println(findIndex(studentClass, "Andreas"));
        System.out.println(findIndex(studentClass, "Bo")); //Returns -1, because Bo is not in the array
        System.out.println(findIndex(studentClass, "Elle"));
        System.out.println(findIndex(studentClass, "Elisabeth"));
    } 

    // 5.b Create a function in Datamatik that takes in the array from 5.a as a 
    // parameter as well as an integer. The function should return the field "name" 
    // (the name of the student) and print it (the integer should be used as the index 
    // number of the student to be printed). Call this method with different parameters 
    // (only the integer - not the array) from the main() of Datamatik.
    static String printName(Student[] s, int i) {
        System.out.println(s[i].name);
        return s[i].name;
    }

    // 5.c Create a similar function to that of 5.b, but instead of receiving the 
    // array and an integer, it receives the array and a string. Loop through all 
    // elements in the array until you find the element with the name received as a 
    // parameter. Then return the index of that student. Call this method with different 
    // names from the main method of Datamatik
    static int findIndex(Student[] s, String n) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].name.equals(n)) {
                return i;
            }
        } 
      return -1; 
    }
}