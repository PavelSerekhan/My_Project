package Enum_Enum;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");
    // new Dog("Собака")

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "перевод на русский язык " + translation;
    }
}
