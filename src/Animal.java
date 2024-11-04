public class Animal {
    String owner;
    PetInfo petInfo;
    Color color;

    public Animal(String owner, PetInfo petInfo, Color color) {
        this.owner = owner;
        this.petInfo = petInfo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public PetInfo getOwner() {
        return petInfo;
    }
}
