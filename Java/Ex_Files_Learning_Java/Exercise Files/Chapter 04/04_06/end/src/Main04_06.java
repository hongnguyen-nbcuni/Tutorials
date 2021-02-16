public class Main04_06 {
    public static void main(String[] args) {

         Answerable phone = () -> "Hello";

         System.out.println(phone.answer());

         Predicate isOdd = n -> n % 2 != 0;
         System.out.println(isOdd.test(2));

         Predicate isEven = n -> n % 2 == 0;
         System.out.println(isEven.test(2));
    }

}
