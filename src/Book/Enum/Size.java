package Book.Enum;

public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {       //конструктор ENUM всегда открытый!!! не private, не public, не protected
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
