package lk.jackson.databinding.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetObjectNested {
    private int id;
    private String first_name;
    private String last_name;
    private String avatar;
    private String email;

    @Override
    public String toString() {
        return "GetObjectNested{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
