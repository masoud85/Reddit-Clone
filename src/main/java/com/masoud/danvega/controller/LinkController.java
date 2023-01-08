package com.masoud.danvega.controller;

import com.masoud.danvega.domain.Link;
import com.masoud.danvega.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/link")
public class LinkController {

    private LinkRepository linkRepository;
    @Qualifier("linkRepository")
    private LinkRepository abc;

    public LinkController(LinkRepository linkRepository, LinkRepository abc) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@RequestBody Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Link read(@PathVariable Long id) {
        return linkRepository.findById(id).orElse(null);
    }

    @PutMapping("/update")
    public Link update(@RequestBody Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        linkRepository.deleteById(id);
    }

}
