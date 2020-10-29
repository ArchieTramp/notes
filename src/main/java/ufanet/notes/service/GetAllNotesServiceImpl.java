package ufanet.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import ufanet.notes.model.Note;
import ufanet.notes.model.User;
import ufanet.notes.repository.NoteRepository;

import java.util.List;

public class GetAllNotesServiceImpl implements GetAllNotesService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getAllNotes(User user) {

        List<Note> allNotes = noteRepository.findAllByUsername(user);
        System.out.println(allNotes);
        return allNotes;

        // TODO: 28.10.2020 заоверрайдить туСтринг чтобы вывод названия, даты и самой заметки происходил корректно
    }
}
