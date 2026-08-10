public interface Performable { //Interface A
    void perform();
    default boolean needsStage() {
        return true;
    }
}
