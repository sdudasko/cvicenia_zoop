package viditelne;
import java.io.*;
import java.util.*;

public class Ulica {
    private List <Mesto> mesta;

    String[] nazov;
    final int sp = 100;
    private int abc;

    Ulica(String[] nazov, List<Mesto> mesta) {
        this.mesta = mesta;
        new Mesto();
    }

    public List <Mesto> mesto() {
        return mesta;
    }
}
