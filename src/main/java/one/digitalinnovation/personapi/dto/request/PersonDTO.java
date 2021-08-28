package one.digitalinnovation.personapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private long id;

    @NoEmpty
    @size(min = 2 max = 100)
    private String fristname;

    @NoEmpty
    @size(min = 2 max = 100)
    private String lastname;

    @NotEmpy
    @CPF
    private String cpf;

    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
