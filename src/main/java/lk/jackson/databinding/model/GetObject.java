package lk.jackson.databinding.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetObject {
    private int page;
    private int per_page;
    private int total;
    private int total_page;
    private Map<String, Object> namespace;
}
