public class Myapp {

  public static void main(String[]args) {
    //配列

    int[] sales;
    sales = new int[3];

    sales[0] = 100;
    sales[1] = 200;
    sales[2] = 300;
    System.out.println(sales[1]);

    sales[1] = 1000;

    System.out.println(sales[1]);
  }
}