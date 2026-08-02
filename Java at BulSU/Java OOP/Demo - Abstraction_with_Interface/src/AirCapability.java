public interface AirCapability {
    int wings = 0;
    void fly();
    default boolean canPet() {
        return true;
    }
}
