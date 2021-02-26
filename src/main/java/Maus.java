abstract class Maus extends Cat {

    Cat cat = new Cat() {
        @Override
        public void eat() {
            System.out.println("I am eating cheese");
        }

        @Override
        public void sleep() {
            System.out.println("Sch");
        }

        @Override
        public void say() {
            System.out.println("Pi");
        }

        @Override
        public void named() {
            System.out.println("Miky");
        }
    };
}

