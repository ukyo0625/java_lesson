public class Myapp {

  public static void sayHi(String name) {
    int x = 10;
    System.out.println("Hi! " + name);
  }
  public static void sayHi() {
    System.out.println("Hi! Nobady!");
  }

  public static void main(String[]args) {
    sayHi();
    sayHi("Steve");
  }
}