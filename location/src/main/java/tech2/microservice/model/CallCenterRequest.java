package tech2.microservice.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CallCenterRequest {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String phone;
    private String employeeId;
    @ManyToOne
    private Address pickingAddress;
    @ManyToOne
    private Address arrivingAddress;
    @Builder.Default
    private boolean sending = false;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
}
