package dev.orf1.springaoplearning.business;

import dev.orf1.springaoplearning.data.Dao1;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    private final Dao1 dao1;

    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething() {
        return dao1.retrieveSomething();
    }
}
