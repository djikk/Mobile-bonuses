
    public class Main {
        public static void main(String[] args) {
            int start_score = 100;
            int bonus;
            int add = 1001;
            if (add <= 1000) {
                bonus = 0;
            } else {
                bonus = add / 100;
            }
            int balance = start_score + add+ bonus;
            System.out.println("Баланс: " + balance);
        }
    }

