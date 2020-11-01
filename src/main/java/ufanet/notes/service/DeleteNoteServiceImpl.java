package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

/**
 * @author Artur Gilyazov
 * Сервис удаления заметки
 **/

@Service
public class DeleteNoteServiceImpl implements DeleteNoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    public void deleteNote(Note note) {

        String title = note.getTitle();
        noteRepository.deleteNoteByTitle(title);

    }
}
