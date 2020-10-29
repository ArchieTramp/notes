package ufanet.notes.service;

import ufanet.notes.model.Note;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса редактирования заметки
 **/

public interface EditNoteService {

    void editNote(Note note);
}
