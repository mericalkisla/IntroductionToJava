package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@RestController
@RequestMapping("/api/subTechnologies")
public class SubTechnologiesController {

    private SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologiesController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("/getAll")
    public List<SubTechnology> getAll() {
        return subTechnologyService.getAll();
    }

    @PostMapping("/add")
    public SubTechnology add(@RequestBody SubTechnology subTechnology) {
        return subTechnologyService.add(subTechnology);
    }

    @PutMapping("/update")
    public SubTechnology update(@RequestBody SubTechnology subTechnology) {
        return subTechnologyService.update(subTechnology);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody SubTechnology subTechnology) {
        subTechnologyService.delete(subTechnology);
    }
}
