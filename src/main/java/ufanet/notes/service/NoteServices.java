package ufanet.notes.service;

import ufanet.notes.model.Note;
import ufanet.notes.model.User;

/**
 * @author Artur Gilyazov
 * Интерфейс для удобства работы с сервисами и методами
 **/

public interface NoteServices {
    void addNote(Note note);

    String editNote(Note note);

    void deleteNote(Note note);

    void getAllNotes(User user);
}
