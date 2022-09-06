package com.example.demo.ModelEjercicio2;

import javax.persistence.*;
import java.util.List;


@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "conferences")
public class Conference extends Event{

    @OneToMany
    @JoinColumn(name = "speaker_list")
    private List<Speaker> speakerList;

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
