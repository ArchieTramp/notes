package ufanet.notes.service;

import ufanet.notes.model.Note;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса удаления заметки
 **/

public interface DeleteNoteService {

    void deleteNote(Note note);
}
