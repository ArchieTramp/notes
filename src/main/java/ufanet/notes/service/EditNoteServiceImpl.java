package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

/**
 * @author Artur Gilyazov
 * Сервис редактирования заметки
 **/

@Service
public class EditNoteServiceImpl implements EditNoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    public void editNote(Note note) {
        //исправить ввод текста
        String title = "addtitlescanorbuffer";

        noteRepository.findByTitle(title);

        String editNote;

        //исправить ввод текста
        editNote = "HowToEditThisNote";
        note.setNote(editNote);
        Long newTimeStamp = System.currentTimeMillis();
        note.setTimestamp(newTimeStamp);
        noteRepository.save(note);


    }
}
