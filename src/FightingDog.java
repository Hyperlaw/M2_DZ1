public final class FightingDog extends Dog {
    private int wins;

    public int getWins() {
        return wins;
    }

    public FightingDog(String owner, PetInfo petInfo, Color color, String commands, int wins) {
        super(owner, petInfo, color, commands);
        this.wins = wins;

    }

    public void performCommand(String additionalCommand) {
        System.out.println("FightingDog is performing an intense command: "
                + getCommands() + " and " + additionalCommand + " with full power!");
    }
    public String info(){
        return super.info() + "\nwins: " + wins;
    }

}
