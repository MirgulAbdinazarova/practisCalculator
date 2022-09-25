import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
               try {
                   System.out.println("Choose a command: 1 or 2");
                   String choose = sc.nextLine();
                   if (choose.charAt(0) == '1') {
                       arabNumbers();
                   } else if (choose.charAt(0) == '2') {
                       romeNumbers();
                   }else {
                       throw new RuntimeException();
                   }
               }catch (Exception e){
                   System.out.println("Ne verno");
               }
        }
    }


    public static void arabNumbers() {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Input  arabNumbers and symbol");
            int a = scanner.nextInt();
            String simvol = String.valueOf(scanner.next());
            int b = scanner.nextInt();
            if (a <= 10 && b <= 10) {
                switch (simvol) {
                    case "+" -> System.out.println(a + b);
                    case "-" -> System.out.println(a - b);
                    case "*" -> System.out.println(a * b);
                    case "/" -> System.out.println(a / b);

                }
            }else {
                throw  new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("10 го чейинки араб тамгаларын жаз  ");
        }
    }


    public static void romeNumbers() {
        Scanner sc1=new Scanner(System.in);
        Map<String, Integer> maps = new HashMap<>();
        maps.put("I", 1);
        maps.put("II", 2);
        maps.put("III", 3);
        maps.put("IV", 4);
        maps.put("V", 5);
        maps.put("VI", 6);
        maps.put("VII", 7);
        maps.put("VIII", 8);
        maps.put("IX", 9);
        maps.put("X", 10);

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        try {
            System.out.println("Input romeNumbers and symbol");
            int x = maps.get(sc1.next());
            String s = String.valueOf(sc1.next());
            int y = maps.get(sc1.next());
            switch (s) {
                case "+" -> System.out.println(roman[x + y]);
                case "-" -> System.out.println(roman[x - y]);
                case "*" -> System.out.println(roman[x * y]);
                case "/" -> System.out.println(roman[x / y]);

            }

        } catch (NullPointerException e) {
            System.out.println("only rome numbers");
        }
    }


}

