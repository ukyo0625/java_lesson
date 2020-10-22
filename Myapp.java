public class Myapp {

  public static void main(String[]args) {
    //配列

    int[] sales = {700, 400, 500} ;

    // for (int i = 0; i < 3; i++) {
    //     System.out.println(sales[i]);
    // }
    for (int sale :sales) {
        System.out.println(sale);
    }
  }
}