package ufanet.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ufanet.notes.model.Note;
import ufanet.notes.service.GetAllNotesService;

import java.util.List;

@Controller
public class GetAllNotesController {
    @Autowired
    private GetAllNotesService getAllNotesService;

    @GetMapping("/allnotes")
    public String getAllNotes(Model model) {
        String username = "username1";
        List<Note> list = getAllNotesService.getAllNotes(username);
        model.addAttribute("allnotes", list);
        return "allnotes";
    }
}
