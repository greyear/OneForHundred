public class OneForHundred {
    public static void main(String[] args) {
        int startAmount = 500;
        int addedAmount = 1101;

        int bonus;
        if (addedAmount > 1000) {
            bonus = addedAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = startAmount + addedAmount + bonus;
        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
