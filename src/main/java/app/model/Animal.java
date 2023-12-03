package app.model;

import org.springframework.stereotype.Component;

@Component("Dog")
public abstract class Animal {
    public abstract String toString();

}
