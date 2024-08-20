package org.ncu.movie_app_v1.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "showtime_table")
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int showtimeId;
    @Column(length = 20, nullable = false)
    String name;
    @Column(length = 50, nullable = false)
    String startTime;
    @Column(length = 20, nullable = false)
    String endTime;
    @Column(length = 20, nullable = false)
    String theater;

    @OneToMany(mappedBy = "showtime" , cascade = CascadeType.ALL)
    private List<Seat> seats;

    public Showtime(int showtimeId, String name, String startTime, String endTime, String theater, List<Seat> seats) {
        super();
        this.showtimeId = showtimeId;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.theater = theater;
        this.seats = seats;
    }

    public Showtime() {
        super();
    }

    @Override
    public String toString() {
        return "Showtime [showtimeId=" + showtimeId + ", name=" + name + ", startTime=" + startTime + ", endTime="
                + endTime + ", theater=" + theater + ", seats=" + seats + "]";
    }

    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
