package src.main.w08.ex03;

public enum StateOfMatter {
    SOLID("fest"), LIQUID("flüssig"), GAS("gasförmig");

    private final String label;

    StateOfMatter(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
