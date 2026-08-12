/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles
BSIT 2H-G1

Activity 6 - Abstraction and Interfaces
*/

//Option 1: Music

public interface Maintainable{ //Interface B
    String getMaintenanceSchedule();
    default boolean needsStage() {
        return false;
    }
    
} 
