package org.ncu.movie_app_v1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "seat_table")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int seatId;
    @Column(length = 20, nullable = false)
    int seatRow;
    @Column(length = 20, nullable = false)
    int seatNumber;
    @Column(nullable = false)
    private boolean booked;

    @ManyToOne
    @JoinColumn(name = "showtimeId")
    @JsonIgnore
    private Showtime showtime;

    public Seat(int seatId, int seatRow, int seatNumber, Showtime showtime) {
        super();
        this.seatId = seatId;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
        this.showtime = showtime;
    }

    public Seat() {
        super();
    }

    @Override
    public String toString() {
        return "Seat [seatId=" + seatId + ", seatRow=" + seatRow + ", seatNumber=" + seatNumber + ", showtime="
                + showtime + "]";
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

}
