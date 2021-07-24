package ENUMS;

public enum COLOR {
    RED("Passion"),GREEN("agric"),BLUE("sad");

    // Here RED, GREEN and BLUE are objects of the type COLOR
    // Enums can have constructor and methods
    // You can't create an enum with the new keyword
    // You can't auto-generate toString on ENUM, you will
    // have to manually create the toString
    private String meaning;

    COLOR(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
