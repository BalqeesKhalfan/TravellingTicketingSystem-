package TicktingSystem;

import java.util.List;
import java.util.Objects;

public class Journey {
    Integer id;
    String departureLocation;
    String destination;
    List<Ticket> avilabileTickt;
    Integer duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Ticket> getAvilabileTickt() {
        return avilabileTickt;
    }

    public void setAvilabileTickt(List<Ticket> avilabileTickt) {
        this.avilabileTickt = avilabileTickt;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journey journey = (Journey) o;
        return Objects.equals(departureLocation, journey.departureLocation) && Objects.equals(avilabileTickt, journey.avilabileTickt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureLocation, avilabileTickt);
    }

    @Override
    public String toString() {
        return "Journey{" +
                "departureLocation='" + departureLocation + '\'' +
                ", destination='" + destination + '\'' +
                ", avilabileTickt=" + avilabileTickt +
                ", duration=" + duration +
                '}';
    }
}
