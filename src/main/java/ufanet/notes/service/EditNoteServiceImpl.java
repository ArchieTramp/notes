package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;

public class EditNoteServiceImpl implements EditNoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    public String editNote(Note note) {
        //исправить ввод текста
        String title = "addtitlescanorbuffer";
        noteRepository.findByTitle(title);
        return null;
        // TODO: 28.10.2020 продумать редактирование заметки, заголовок не трогаем, дату меняем, изменяяем заметку.


    }
}
