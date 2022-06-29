
public class Main {
    public static void main(String[] args) {
        int startScore = 100;
        int bonus;
        int add = 1001;
        if (add <= 1000) {
            bonus = 0;
        } else {
            bonus = add / 100;
        }
        int balance = startScore + add + bonus;
        System.out.println("Баланс: " + balance);
        System.out.println("Бонус: " + bonus);
    }
}

