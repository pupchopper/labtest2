package sut.sa.g16.entity;
import javax.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Data
@Table (name = " TIMETYPE ")
public class Timetype {
    @Id

    private @NonNull String timetypeid;
    private @NonNull String time;

    //One TO Many with Rooms







    protected Timetype(){

    }

    public Timetype(String timetypeid, String time){
        this.timetypeid = timetypeid;
        this.time = time;
    }
    public void setTimetypeid(String timetypeid) {
        this.timetypeid = timetypeid;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTimetypeid() {
        return timetypeid;
    }
    public String getTime() {
        return time;
    }


}