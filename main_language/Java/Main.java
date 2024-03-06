package Java;

public class Main {
    public static void main(String[] args) {
      String name = "Jhon";
      int age = 18;
      final int maxAgeAccepted = 20; // will never change
      System.out.println(name);
      System.out.println(age);
      System.out.println(maxAgeAccepted);
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
