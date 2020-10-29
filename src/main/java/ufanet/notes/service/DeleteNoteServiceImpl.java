package ufanet.notes.service;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

import java.sql.SQLException;

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

        //исправить ввод текста
        String title = "ADDFUCKINTITLE";


        noteRepository.deleteNoteByTitle(title);

    }
}
