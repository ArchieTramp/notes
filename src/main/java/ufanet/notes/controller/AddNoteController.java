package ufanet.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import ufanet.notes.model.Note;
import ufanet.notes.service.AddNoteService;

/**
 * @author Artur Gilyazov
 * Контроллер новой заметки
 **/

@Controller
public class AddNoteController {

    @Autowired
    private AddNoteService addNoteService;

    @PostMapping("/newnote")
    public String addNewNote(Model model) {

        Note note = new Note();
        addNoteService.addNote(note);
        model.addAttribute("newnote", note);
        return "newnote";
    }
}
