class User {
  String name = "Me!"; //フィールド
  void sayHi() {
    System.out.println("hi!");
  }
}


public class Myapp {

  public static void main(String[]args) {
    User tom;
    tom = new User(); //インスタンス
    System.out.println(tom.name);
    tom.sayHi();
  }
}