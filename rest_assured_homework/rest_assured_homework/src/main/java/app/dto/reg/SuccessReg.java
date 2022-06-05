package app.dto.reg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessReg {
    private Integer id;
    private String token;
}
