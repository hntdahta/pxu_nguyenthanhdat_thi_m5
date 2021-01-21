package com.codegym.controller;
import com.codegym.model.Miss;
import com.codegym.model.Nation;
import com.codegym.repository.NationRepository;
import com.codegym.repository.MissRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/miss/")
public class MissController {
    @Autowired
    private MissRepository missRepository;

    @Autowired
    private NationRepository nationRepository;

    @GetMapping("create")
    public String getViewCreate(Model model){
        model.addAttribute("Miss" ,new Miss());
        Iterable<Miss> misses = missRepository.findAll();
        model.addAttribute("nation",nationRepository.findAll());
        return "miss/create";
    }
    @PostMapping("create")
    public String Create(Miss Miss){
        Nation nation = nationRepository.findById(Miss.getNationId()).orElse(null);
        Miss.setNation(nation);
        missRepository.save(Miss);
        return "miss/create";
    }

    @GetMapping("list")
    public String getViewList(Model model){
        model.addAttribute("listMiss",missRepository.findAll());
        return "miss/list";
    }
    @GetMapping("edit/{id}")
    public String Getviewedit(Model model, @PathVariable("id")Long id){
        model.addAttribute("Miss" , missRepository.findById(id).orElse(null));
        model.addAttribute("Nation",nationRepository.findAll());
        return "miss/edit";
    }
    @PostMapping("edit")
    public String edit(Model model,Miss miss){
        Nation nation = nationRepository.findById(miss.getNationId()).orElse(null);
        miss.setNation(nation);
        missRepository.save(miss);
        return "redirect:/miss/list";
    }
    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable("id")Long id){
        missRepository.deleteById(id);
        return "redirect:/miss/list";
    }

    @GetMapping("view/{id}")
    public String Getview(Model model, @PathVariable("id")Long id){

        model.addAttribute("Miss" , missRepository.findById(id).orElse(null));
        model.addAttribute("Nation",nationRepository.findAll());
        return "miss/view";
    }

    @PostMapping("search")
    public String search(@RequestParam String search,Model model){
        model.addAttribute("listMiss", missRepository.findAllByNameContains(search));
        return "miss/list";
    }
}
