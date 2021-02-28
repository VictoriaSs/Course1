import java.util.NoSuchElementException;
import java.util.Scanner;

public class Compas {

    /*
    программа принимает в себя градус и возвращиет ближайшее направление (наример, Юго-запад). В стиле ООП: для описания направлений
    использовать Enum. Строковое представление должно выводиться в красивом формате - [короткое предсавление] - длинное представление - данный градус.
    Например, в метод был передан параметр int i = 93// градуса. Ожидаемый вывод приложения [E]-East - 93.
    На некорректные данные(>360,<0) выводить предупреждение и завершать программу.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        {
            System.out.print("Введите градус компаса:");
        }

        int diaposon = scanner.nextInt();


        if (diaposon > 360 & diaposon < 0) {
            System.out.println("Введены некорректные данные.");
        } else if (1 <= diaposon & diaposon > 89) {
            System.out.println("[N-E] - " + Compass.NORD_EAST + " - " + diaposon);
        } else if (89 == diaposon & diaposon == 90) {
            System.out.println("[E] - " + Compass.EAST + diaposon);
        } else if (180 > diaposon & diaposon > 91) {
            System.out.println("[S-E] - " + Compass.SUD_EAST + " - " + diaposon);
        } else if (diaposon == 180) {
            System.out.println("[S] - " + Compass.SUD + " - " + diaposon);
        } else if (181 <= diaposon & diaposon < 270) {
            System.out.println("[S-W] - " + Compass.SUD_WEST + " - " + diaposon);
        } else if (271 >= diaposon & diaposon < 359) {
            System.out.println("[N-W] - " + Compass.NORD_WEST + " - " + diaposon);
        }


    }
}










