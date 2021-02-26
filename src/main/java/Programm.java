public class Programm {

    /*
    Создайте метод, который принимает класс в качестве параметра, и выводит строку если у пользователя достаточно прав.
    У пользователя может быть несколько вариантов ролей Только для модератора и ревьюера есть доступ к получению строки
     */

    public static void getRight() {
        System.out.println(Rights.MODERATOR);
    }


    public static void main(String[] args) {

        Enum[] rights = {Rights.REVIER, Rights.MODERATOR, Rights.ADMIN, Rights.USER};
        for (Enum r : rights) {
            if (Rights.Rights.USER.equals(r)) {
                System.out.println("NO connection");
            } else if (Rights.Rights.ADMIN.equals(r)) {
                System.out.println("NO connection");
            } else if (Rights.Rights.MODERATOR.equals(r)) {
                System.out.println("Conection -Yes!");
            } else if (Rights.Rights.REVIER.equals(r)) {
                System.out.println("Conection -Yes!");
            }

        }
    }
}
