package analitics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {

    public User(long id, String name, String dob, String location, String media) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.media = media;
    }

    @JsonIgnore
    private Long id;
    private String name;
    private String location;
    private String media;
}
