
/**
 *Classe baseada em Animal, do projeto fox and rabbits
 */
public abstract class Fish extends Cell{
    
    /**
     * Create a new animal at location in field.
     * 
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Fish(Ocean field, Location location){
    	super(field,location);
    }
   
}