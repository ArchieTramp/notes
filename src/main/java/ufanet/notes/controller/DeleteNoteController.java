package ufanet.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import ufanet.notes.repository.NoteRepository;
import ufanet.notes.service.DeleteNoteService;

@Controller
public class DeleteNoteController {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    DeleteNoteService deleteNoteService;

    @DeleteMapping
    public void deleteNote() {

    }
}
