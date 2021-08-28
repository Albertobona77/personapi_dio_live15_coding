package one.digitalinnovation.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PhoneType {

    HOME(descripion: "Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
