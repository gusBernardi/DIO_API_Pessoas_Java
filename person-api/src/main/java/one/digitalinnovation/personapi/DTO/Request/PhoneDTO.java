package one.digitalinnovation.personapi.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PhoneDTO {

    private Long id;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
