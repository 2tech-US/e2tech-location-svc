package tech2.microservice.model;

import lombok.*;

import javax.annotation.Nullable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name = "Address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(onlyExplicitlyIncluded = true)
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"city", "district", "ward", "street", "home"})
})
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "district")
    @NotEmpty
    private String district;

    @Column(name = "ward")
    @NotEmpty
    private String ward;
    @Column(name = "street")
    private String street;

    @Column(name = "home")
    @NotEmpty
    private String home;

    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    private Location location;

    @Transient
    public LocationKey getLocationId() {
        if (location == null) return null;
        return location.getId();
    }

}
