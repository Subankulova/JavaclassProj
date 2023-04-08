package hw.src;

public class Phoneclass {
    String name;
    int model;
    int memory;

    Phoneclass(String name, int model, int memory) {
        this.memory = memory;
        this.model = model;
        this.name = name;
    }


    void available(int used) {
        memory = memory - used;
    }
}
