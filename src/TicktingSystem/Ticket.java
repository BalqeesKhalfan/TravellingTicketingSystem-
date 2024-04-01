package TicktingSystem;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Ticket {
    Integer id;
    String passengerName;
    Date date;
    Time time;
   Integer seatNumber;
   String destination;
   String departureLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(passengerName, ticket.passengerName) && Objects.equals(date, ticket.date) && Objects.equals(time, ticket.time) && Objects.equals(seatNumber, ticket.seatNumber) && Objects.equals(destination, ticket.destination) && Objects.equals(departureLocation, ticket.departureLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerName, date, time, seatNumber, destination, departureLocation);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passengerName='" + passengerName + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", seatNumber=" + seatNumber +
                ", destination='" + destination + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                '}';
    }
}
