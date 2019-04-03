package de.johngockel.service.rest;

import de.johngockel.service.core.GreetingService;
import de.johngockel.service.core.model.Greeting;
import de.johngockel.service.rest.dto.GreetingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/greeting")
public class GreetingRestController {

    private GreetingService greetingService;

    @Autowired
    public GreetingRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Collection<GreetingDto> getGreetings() {
        return GreetingDto.fromModel(greetingService.getAllGreetings());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public GreetingDto getGreeting(@PathVariable(value="id") String id) {

        Greeting greeting = greetingService.getGreetingById(id);

        return GreetingDto.fromModel(greeting);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGreeting(@PathVariable(value = "id") String id) {
        greetingService.removeGreetingById(id);
    }
}
