package Java;

public class Main {
    public static void main(String[] args) {
      String name = "Jhon";
      int idade = 18;
      final int maxIdadeAccepted = 20; // will never change
      System.out.println(name);
      System.out.println(idade);
      System.out.println(maxIdadeAccepted);
    };

    public static void readFile(String[] request) {
        String txt = "Number of TEXT Are 21";
        if(txt.length() >= request.length) {
            System.out.println("Is returning string");
        }
    }

    public static void GoodDay(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println((result));
    }
};
