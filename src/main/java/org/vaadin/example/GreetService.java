package org.vaadin.example;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -391475699311013283L;

    public String greet(final String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }

}
