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
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"city","district","ward","street","home"})
})
public class Address {
//    @EmbeddedId
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private AddressKey id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "ward")
    private String ward;
    @Column(name = "street")
    private String street;
    @Column(name = "home")
    private String home;


    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    private Location location;

    @Transient
    public LocationKey getLocationId(){
        if(location == null) return null;
        return location.getId();
    }

}
