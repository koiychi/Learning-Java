public interface Maintainable{ //Interface B
    String getMaintenanceSchedule();
    default boolean needsStage() {
        return false;
    }
    
} 
