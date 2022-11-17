package src.main.w08.ex03;

public enum StateOfMatter {
    SOLID("fest"), LIQUID("flüssig"), GAS("gasförmig");

    public final String label;

    StateOfMatter(String label) {
        this.label = label;
    }
}
