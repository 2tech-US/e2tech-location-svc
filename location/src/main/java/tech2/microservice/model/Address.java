package tech2.microservice.model;

import lombok.*;

import javax.annotation.Nullable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity(name = "Address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(onlyExplicitlyIncluded = true)
public class Address {
    @EmbeddedId
    private AddressKey id;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    @Nullable
    private Location location;
}
