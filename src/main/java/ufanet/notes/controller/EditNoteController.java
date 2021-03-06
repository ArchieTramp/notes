package ufanet.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;
import ufanet.notes.model.Note;
import ufanet.notes.repository.NoteRepository;
import ufanet.notes.service.EditNoteService;

/**
 * @author Artur Gilyazov
 * Контроллер изменения заметок
 **/

@Controller
public class EditNoteController {
    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private EditNoteService editNoteService;

    @PutMapping("/editer")
    public String EditNote(Model model) {
        //Заголовок-заглушка, реализация возможна через jsp странцину.
        String title = "заглушка";
        Note note = noteRepository.findByTitle(title);
        editNoteService.editNote(note);
        model.addAttribute("editednote", note);
        return "editer";
    }
}
