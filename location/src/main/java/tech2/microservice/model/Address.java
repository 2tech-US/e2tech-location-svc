package tech2.microservice.model;

import lombok.*;

import javax.annotation.Nullable;
import javax.persistence.*;

@Entity(name = "Address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(onlyExplicitlyIncluded = true)

public class Address {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private AddressKey id;

    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    private Location location;
}
