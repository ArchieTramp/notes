package ufanet.notes.service;

import ufanet.notes.model.Note;
import ufanet.notes.model.User;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса получения всех заметок
 **/

public interface GetAllNotesService {

    List<Note> getAllNotes(User user);
}
