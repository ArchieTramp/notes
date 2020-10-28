package ufanet.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufanet.notes.model.Note;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий для хранения заметок
 **/

public interface NoteRepository extends JpaRepository<Note, Long> {
        Note findByTitle(String title);
        List<Note> findAllByUsername(String username);
        Optional<Note> findByUsername(String username);
}
