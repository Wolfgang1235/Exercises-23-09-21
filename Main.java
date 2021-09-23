class Main{
  public static boolean happy = true;

  public static void main(String [] args) {
    if (iAmHappy()) {
      System.out.println("I clap my hands");
    
    } else {
     
     System.out.println("I don't clap my hands"); 
    }
    // 2.b, added Integer.parseInt or else it wont print the args.
    returnSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    // 2.c 
    returnUpperCase(args[2]);

    // 2.d
    firstCharUpperCase(args[3]);
  }


  public static boolean iAmHappy() {
    // fill out what is missing here:
    // 2.a
    if(happy) { 
      return true;
    // 2.a
    } else {
      return false;
    }
  }
  
  // 2.b
  static void returnSum(int a, int b){
    int sum = a + b;
    System.out.println(sum);
  }

  // 2.c
  static void returnUpperCase(String word) {
    String upperWord = word.toUpperCase();
    System.out.println(upperWord);
  }

  // 2.d
  static void firstCharUpperCase(String word) {
    // Method must be a boolean to use underneath line
    //return Character.isUpperCase(word.charAt(0)); 
    if (Character.isUpperCase(word.charAt(0))) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}