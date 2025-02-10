package basics.printFormat;

public enum Enfasis {
    NORMAL("3"),
    BRILLANTE("9"),
    FONDO("4"),
    FONDO_BRILLANTE("10");

    private final String code;

    Enfasis(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
