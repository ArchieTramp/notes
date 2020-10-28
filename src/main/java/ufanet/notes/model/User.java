package ufanet.notes.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //идентификатор пользователя//
    private String username; //имя пользователя//
    @OneToMany(mappedBy = "username", fetch = FetchType.EAGER)
    List<Note> notes;

}

