package ufanet.notes.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@Table(name = "notes", uniqueConstraints = @UniqueConstraint(columnNames = {"title"}))
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String title;
    private Timestamp timestamp;
    private String note;
    @ManyToOne
    @JoinColumn(name = "username")
    User user;

}
