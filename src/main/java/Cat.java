
public abstract class Cat extends Dog {
    public static void main(String[] args) {

        Dog dog = new Dog() {


            @Override
            public void eat() {
                System.out.println("I am eating mouses");
            }

            @Override
            public void sleep() {
                System.out.println("sh-sh");
            }

            @Override
            public void say() {
                System.out.println("Myau");
            }

            @Override
            public void named() {
                System.out.println("Tom");
            }

        };
    }
}
