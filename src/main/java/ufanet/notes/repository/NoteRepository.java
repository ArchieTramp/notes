package ufanet.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufanet.notes.model.Note;
import ufanet.notes.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий для хранения заметок
 **/

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findByTitle(String title);

    List<Note> findAllByUsername(User username);

    Note deleteByTitle(String title);


}
