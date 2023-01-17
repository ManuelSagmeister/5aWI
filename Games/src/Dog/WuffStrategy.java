package Dog;

public interface WuffStrategy extends Dog{
    default void bark(){
    }
}
