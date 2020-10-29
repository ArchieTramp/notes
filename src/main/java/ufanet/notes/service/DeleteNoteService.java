package ufanet.notes.service;

import javassist.NotFoundException;
import ufanet.notes.model.Note;

import java.sql.SQLException;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса удаления заметки
 **/

public interface DeleteNoteService {

    void deleteNote(Note note);
}
