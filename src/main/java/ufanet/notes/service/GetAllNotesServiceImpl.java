package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Сервис получения всех заметок
 **/

@Service
public class GetAllNotesServiceImpl implements GetAllNotesService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getAllNotes(String user) {

        return noteRepository.findAllByUsername(user);

    }
}
