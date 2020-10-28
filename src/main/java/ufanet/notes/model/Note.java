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
    private String title; //название заметки//
    private Long timestamp; //штамп времени создания и редактирования//
    private String note; //тело заметки//
    @ManyToOne
    @JoinColumn(name = "username")
    User user;

}
