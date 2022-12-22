package Book.Collectionsss;

import java.util.Objects;

/**
 * Описание изделия и его номер по каталогу
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Конструирует объект изделия
     *
     * @param aDescription Описание изделия
     * @param aPartNumber  Номер изделия по каталогу
     */
    public Item(String aDescription, int aPartNumber) {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    /**
     * Получает описание данного изделия
     * @return Описание изделия
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description= " + description + ", partNumber=" + partNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return partNumber == item.partNumber && description.equals(item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber, o.partNumber);
        return diff != 0 ? diff : description.compareTo(o.description);
    }
}
