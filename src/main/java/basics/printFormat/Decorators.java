package basics.printFormat;

public enum Decorators {
    NORMAL("0"),
    NEGRITA("1"),
    CURSIVA("3"),
    SUBRAYADO("4");

    private final String code;

    Decorators(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
