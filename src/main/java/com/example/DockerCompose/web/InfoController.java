package com.example.DockerCompose.web;

import com.example.DockerCompose.entity.Info;
import com.example.DockerCompose.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InfoController {

    private final InfoRepository infoRepository;
    @GetMapping("/info")
    public List<Info> getInfo() {
        return (List<Info>) infoRepository.findAll();
    }
    @PostMapping("/addInfo")
    public Info addInfo(@RequestBody Info info) {
        return infoRepository.save(info);
    }
}
