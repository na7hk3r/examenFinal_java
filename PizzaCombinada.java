import java.util.ArrayList;
import java.util.List;
class PizzaCombinada extends Pizza {
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, List<Pizza> pizzas) {
        super(nombre, "Pizza combinada", 0, false);
        this.pizzas = pizzas;
    }

    @Override
    public double getPrecio() {
        double precioMaximo = 0;
        for (Pizza pizza : pizzas) {
            double precioPizza = pizza.getPrecio();
            if (precioPizza > precioMaximo) {
                precioMaximo = precioPizza;
            }
        }
        return precioMaximo;
    }
}