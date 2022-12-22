package Сериализация;

import java.io.Serializable;

/**
 * Сериализация - запись объектов во внешние файлы
 * из файла получение объкета наз дисериализация
 * Чтобы записать объект в файл нужно реализовать интерфейс Serializable
 * Если не хотим сериализовывать(записывать объект в файл) например поле name,
 *  то надо написать transient
 *              private transient String name;
 */
public class Person implements Serializable {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
