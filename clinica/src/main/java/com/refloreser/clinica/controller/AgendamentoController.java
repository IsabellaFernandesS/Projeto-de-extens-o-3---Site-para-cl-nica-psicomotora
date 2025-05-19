package com.refloreser.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.refloreser.clinica.model.Agendamento;
import com.refloreser.clinica.repository.AgendamentoRepository;

@Controller
public class AgendamentoController {

    private final AgendamentoRepository repository;

    public AgendamentoController(AgendamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/agendar")
    public String formAgendamento(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "agendamento-form";
    }

    @PostMapping("/agendar")
    public String salvarAgendamento(@ModelAttribute Agendamento agendamento) {
        repository.save(agendamento);
        return "redirect:/confirmacao";
    }

    @GetMapping("/confirmacao")
    public String confirmacao() {
        return "confirmacao";
    }

}
