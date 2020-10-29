package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

public class DeleteNoteServiceImpl implements DeleteNoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void deleteNote(Note note) {

        //исправить ввод текста
        String title = "ADDFUCKINTITLE";


        noteRepository.deleteNoteByTitle(title);

        // TODO: 29.10.2020 продумать исключительную ситуацию если нет записки

    }
}
