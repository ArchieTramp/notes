package ufanet.notes.service;

import org.springframework.stereotype.Service;
import ufanet.notes.model.Note;
import ufanet.notes.model.User;
import ufanet.notes.repository.NoteRepository;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Класс реализует основной функцинал
 * - добавление новой заметки
 * - удаление заметки
 * - редактирование заметки
 * - получение всех заметок пользователя
 **/

// TODO: 28.10.2020 продумать ввод текста для методов
@Service
public class NoteServicesImpl implements NoteServices {
    final
    NoteRepository noteRepository;

    public NoteServicesImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    @Override
    public void addNote(Note note) {
        String newTitle = "add";
        Long newTimeStamp = System.currentTimeMillis();
        String newBodyOfNote = "texts";
        Note newNote = Note.builder()
                .title(newTitle)
                .timestamp(newTimeStamp)
                .note(newBodyOfNote)
                .build();
        noteRepository.save(newNote);
    }

    @Override
    public String editNote(Note note) {
        String title = "addtitlescanorbuffer";
        noteRepository.findByTitle(title);
        return null;
        // TODO: 28.10.2020 продумать редактирование заметки, заголовок не трогаем, дату меняем, изменяяем заметку.
    }

    @Override
    public void deleteNote(Note note) {
        String title = "ADDFUCKINTITLE";
        noteRepository.deleteByTitle(title);
    }

    @Override
    public void getAllNotes(User user) {
        List<Note> allNotes = noteRepository.findAllByUsername(user);
        System.out.println(allNotes);
        // TODO: 28.10.2020 заоверрайдить туСтринг чтобы вывод названия, даты и самой заметки происходил корректно
    }
}
