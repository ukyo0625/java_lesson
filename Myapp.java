public class Myapp {

  public static void main(String[]args) {
    String signal = "red";
    switch (signal) {
      case "red":
      System.out.println("stop!");
      break;
      case "blue":
      System.out.println("go");
      break;
      case "yellow":
      System.out.println("caution");
      break;
      default:
      System.out.println("wrong signal!");
      break;
    }
  }
}