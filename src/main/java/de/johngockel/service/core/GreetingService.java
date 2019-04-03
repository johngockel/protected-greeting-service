package de.johngockel.service.core;

import de.johngockel.service.core.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GreetingService {

    private Map<String, Greeting> greetings;

    public GreetingService() {
        this.greetings = new HashMap<>();

        greetings.put("1", new Greeting("1", "Hello, John"));
        greetings.put("2", new Greeting("2", "Hello, Sabrina"));
        greetings.put("3", new Greeting("3", "Hello, Maria"));
        greetings.put("4", new Greeting("4", "Hello, Patrick"));
    }

    public Greeting getGreetingById(String id) {
        return this.greetings.get(id);
    }

    public List<Greeting> getAllGreetings() {
        return new ArrayList<>(this.greetings.values());
    }

    public void removeGreetingById(String id) {
        greetings.remove(id);
    }
}
