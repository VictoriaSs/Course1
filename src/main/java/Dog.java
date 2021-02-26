

abstract class Dog implements Eatable, Homedanimal {

    public int numberOfLegs;

    public void setNumberOfLegs(int Number) {
        this.numberOfLegs = numberOfLegs;
    }

    public static void main(String[] args) {

        Dog dog = new Dog() {
            @Override
            public void eat() {
                System.out.println("I am eating cats");
            }

            @Override
            public void sleep() {
                System.out.println("Hrr");
            }

            @Override
            public void say() {
                System.out.println("Gav");
            }

            @Override
            public void named() {
                System.out.println("Borbos");
            }
        };
    }}