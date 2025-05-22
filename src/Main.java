//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticketCost = 13686; //для хранения стоимости билета
        int bonusStep = 20; //для хранения количества рублей для одной бонусной мили
        int bonus = ticketCost / bonusStep; //рассчитываю количество бонусных миль, используя
        // значения заведённых переменных, ответ сохраняю в новую переменную

        System.out.println(bonus); // вывожу на экран
     }
}