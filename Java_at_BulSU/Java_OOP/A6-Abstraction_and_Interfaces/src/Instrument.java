public abstract class Instrument {
    private String name;
    public abstract String produceSound();

    public Instrument(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank or null");
        } 
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return produceSound();
    }
    
} 
