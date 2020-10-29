package ufanet.notes.service;

import ufanet.notes.model.Note;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса добавления заметки
 **/

public interface AddNoteService {

    void addNote(Note note);
}
