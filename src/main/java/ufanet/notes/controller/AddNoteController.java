package ufanet.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import ufanet.notes.repository.NoteRepository;
import ufanet.notes.service.AddNoteService;

import javax.servlet.http.HttpServletRequest;

// TODO: 29.10.2020 все управление сделать через контроллеры, сделать якобы нажатия на кнопки для функционала

@Controller
public class AddNoteController {

    @Autowired
    AddNoteService addNoteService;

    @Autowired
    NoteRepository noteRepository;

//    @PostMapping("/newnote")
//        public String addNewNote(ModelMap modelMap, HttpServletRequest httpServletRequest) {
//        if (httpServletRequest.getSession().getAttribute("note") != null) {
//            addNoteService.addNote();
//
//        }
//
//    }
}
