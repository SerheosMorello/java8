package enums;

public enum Buttons {
    YES("Да", "Yes"),
    NO("Нeт", "No");

    private String russian;
    private String english;

    Buttons(String russian, String english){
        this.russian = russian;
        this.english = english;
    }

    public String getRussian() {
        return russian;
    }

    public String getEnglish() {
        return english;
    }
}
