package Senla.adminHotel.model;

import java.util.List;

public class Room extends AEntity{

    private Integer number;
    private Integer capacity;
    private RoomStatus status;
    private List<Guest> guests;

    public Room(Integer number, Integer capacity, RoomStatus status, List<Guest> guests) {
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.guests = guests;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id = " + getId() +
                "number=" + number +
                ", capacity=" + capacity +
                ", status=" + status +
                ", guests=" + guests +
                '}';
    }
}
