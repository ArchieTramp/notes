package ufanet.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufanet.notes.model.Note;
import ufanet.notes.model.User;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения заметок
 **/

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findByTitle(String title);

    List<Note> findAllByUsername(User username);

    Note deleteNoteByTitle(String title);


}
