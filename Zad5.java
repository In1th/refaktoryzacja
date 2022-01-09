
/**
 * Powiedzmy, że chcemy mieć ekwipunek z przedmiotami.
 * 
 * Chcemy łatwo korzystać z tych przedmiotów za pośrednictwem ekwipunku, więc
 * tworzymy klasę Item, z której dziedziczą różne typy przedmiotów. 
 * 
 * Przedmiot może mieć specjalny efekt (leczy gracza, zadaje dodakowe obrażenia, itp.).
 * 
 * Mamy 3 typy przedmiotów:
 * 
 *  - Weapon - przedmiot, który może, ale nie musi mieć jakiegoś efektu i może
 *             być tylko jeden
 *  - Potion - przedmiot, który ma na pewno jakiś efket i gracz może mieć wiele
 *             mikstur tego samego rodzaju
 *  - Treasure - przedmiot, który nie ma efektu, ale gracz może mieć wiele
 *             mikstur tego samego rodzaju
 * 
 * Znajdź i napraw wszystkie błędy w kodzie poniżej.
 */

public interface EffectAction {
    void applyEffect() { . . . }
}

public class Effect{
    protected String effectName;
    protected double effectValue;
    protected EffectAction buffEffect;

    public Effect(String name, EffectAction action double val) 
        { /** Ustawiamy sobie wszystkie wartości i co efekt robi */}

    public void triggerEffect() {buffEffect.applyEffect();}
}

public abstract class abstract Item extends Effect {
    protected String name;
    protected int quantity;
    protected double price;

    public abstract void use();

}

public class Weapon extends Item{
    public void use() { . . . }
}

public class Potion extends Item{
    public void use() { . . . }
}

public class Treasure extends Item{
    public void use() { . . . }
}

public class Equipement {
     Item[] items;

     public void useItem(String name) { . . . }
 }