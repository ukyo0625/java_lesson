public class Myapp {
    //method

    // public static void sayHi() {
    //     System.out.println("Hi!");
    // }

    public static String sayHi(String name) {
        // System.out.println("Hi! " + name);
        return "Hi! " + name;
    }

  public static void main(String[]args) {
    // sayHi();
    // sayHi("Tom");
    // sayHi("Bob");
    String msg = sayHi("Steve");
    System.out.println(msg);
  }
}