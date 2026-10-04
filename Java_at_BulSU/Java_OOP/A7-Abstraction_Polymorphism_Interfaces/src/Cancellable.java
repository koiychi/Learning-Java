public interface Cancellable {
    void cancel();

    default boolean isCancellable() {
        return true;
    }
}
