package safetynetalerts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jsoniter.fuzzy.MaybeStringIntDecoder;
import lombok.Data;

@Data
public class MedicalRecord {
    @JsonProperty(decoder = MaybeStringIntDecoder.class)
    private String firstName;

    private String lastName;

    private String birthDate;

    private String medications;

    private String allergies;

    public MedicalRecord(String firstName, String lastName, String birthDate, String medications, String allergies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.medications = medications;
        this.allergies = allergies;
    }

    public MedicalRecord() {

    }
}
