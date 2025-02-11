package basics.colors;

public class DataColor {
    private String name;
    private String value;

    public String getName() {
        return name;
    }
    public DataColor setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }
    public DataColor setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name.strip()  + "\"," +
                "\"value\":\"" + value.strip() + '\"' +
                '}';
    }
}
