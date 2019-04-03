package de.johngockel.service.rest.dto;

import de.johngockel.service.core.model.Greeting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GreetingDto {

    private String id;
    private String content;

    private GreetingDto() {

    }

    public String getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static GreetingDto fromModel(Greeting greeting) {
        GreetingDto greetingDto = new GreetingDto();
        greetingDto.setId(greeting.getId());
        greetingDto.setContent(greeting.getContent());

        return greetingDto;
    }

    public static List<GreetingDto> fromModel(List<Greeting> greetings) {
        List<GreetingDto> greetingDtos = new ArrayList<>();

        for(Greeting greeting : greetings) {
            greetingDtos.add(fromModel(greeting));
        }

        return greetingDtos;
    }
}
