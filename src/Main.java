public class Main {
    public static void main(String[] args) {
        Dog objectA = new Dog("Azamat", new PetInfo(4, "Rex"), Color.BROWN, "Sit");
        System.out.println(objectA.info());
        objectA.performCommand();
        objectA.performCommand("Run");


        FightingDog objectB = new FightingDog("Mike", new PetInfo(7, "Rock"), Color.BLACK, "Attack", 12);
        System.out.println(objectB.info());
        objectB.performCommand();
        objectB.performCommand("Jump");

        FightingDog objectC = new FightingDog("Mike", new PetInfo(6, "Blade"), Color.WHITE, "Attack", 8);
        System.out.println(objectC.info());
        objectC.performCommand();
        objectC.performCommand("Voice");
    }
}
