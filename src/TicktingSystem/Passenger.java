package TicktingSystem;

import java.util.List;
import java.util.Objects;

public class Passenger {
    Integer id;
    Name name;
    ContactInformation contactInformation;
    List<Ticket> ticketList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(name, passenger.name) && Objects.equals(contactInformation, passenger.contactInformation) && Objects.equals(ticketList, passenger.ticketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contactInformation, ticketList);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + name +
                ", contactInformation=" + contactInformation +
                ", ticketList=" + ticketList +
                '}';
    }
}
