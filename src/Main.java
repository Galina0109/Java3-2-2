public class Main {
    public static void main(String[] args) {

        int balance = 1400; // баланс на счету
        int replenishment = 1520; //пополнение счета

        int bonus;
        if ((balance + replenishment) > 1000) {
            System.out.println("Количество бонусов за баланс более 1000 рублей:");
            System.out.println(bonus = replenishment / 100);
        }

        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println(balance + replenishment + (replenishment / 100));
    }
}
