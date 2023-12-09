import java.util.ArrayList;
import java.util.List;

public class TestPizzeria {
    public static void main(String[] args) {
        Pizza muzzarella = new Pizza("Muzzarella", "Pizza de muzzarella", 700, false);
        Pizza margarita = new Pizza("Margarita", "Pizza margarita especial", 850, true);
        Pizza anana = new Pizza("Ananá", "Pizza de ananá", 950, false);

        List<Pizza> pizzasCombinadaLoca = new ArrayList<>();
        pizzasCombinadaLoca.add(margarita);
        pizzasCombinadaLoca.add(anana);
        PizzaCombinada combinadaLoca = new PizzaCombinada("Combinada Loca", pizzasCombinadaLoca);

        mostrarPizzaConPrecio(muzzarella);
        mostrarPizzaConPrecio(margarita);
        mostrarPizzaConPrecio(anana);
        mostrarPizzaConPrecio(combinadaLoca);
    }

    public static void mostrarPizzaConPrecio(Pizza pizza) {
        System.out.println("Pizza: " + pizza.getNombre() + " - Precio: " + pizza.getPrecio() + " pesos");
    }
}