public class Dog extends Animal{
    private String commands;

    public String getCommands() {
        return commands;
    }

    public Dog(String owner, PetInfo petInfo, Color color, String commands) {
        super(owner, petInfo, color);
        this.commands = commands;
    }

    public final void performCommand() {
        System.out.println("Dog is performing a default command: " + commands);
    }

    public void performCommand(String additionalCommand) {
        System.out.println("Dog is performing a command: " + commands + " and " + additionalCommand);
    }

    public String info(){
        return "----------------------"
                + "\nOwner: " + owner
                + "\nName: " + petInfo.getName()
                + "\nAge: " + petInfo.getAge()
                + "\nColor: " + color
                + "\nCommands: " + commands;
    }

}
