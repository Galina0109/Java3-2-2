public class Main {
    public static void main(String[] args) {

        int x = 100; // баланс на счету
        int y = 1300; //пополнение счета

        int bonus;
        if ((x + y) > 1000) {
            System.out.println("Количество бонусов за баланс более 1000 рублей:");
            System.out.println(bonus = y / 100);
        }

        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println(x + y + (y / 100));
    }
}