import lombok.Getter;
import lombok.Setter;
import org.example.Main;

import java.util.Scanner;
@Setter
@Getter
public class Pizza extends Main {
    private String NamePizzas;
    private Integer SizePizzas;
    private String IngredientsPizzas;
    private Integer PricePizzas;

    @Override
    public String toString() {
        return "Pizza{" +
                "NamePizzas='" + NamePizzas + '\'' +
                ", SizePizzas=" + SizePizzas +
                ", IngredientsPizzas='" + IngredientsPizzas + '\'' +
                ", PricePizzas=" + PricePizzas +
                '}';
    }

    public String getNamePizzas() {
        return NamePizzas;
    }

    public void setNamePizzas(String namePizzas) {
        NamePizzas = namePizzas;
    }

    public Integer getSizePizzas() {
        return SizePizzas;
    }

    public void setSizePizzas(Integer sizePizzas) {
        SizePizzas = sizePizzas;
    }

    public String getIngredientsPizzas() {
        return IngredientsPizzas;
    }

    public void setIngredientsPizzas(String ingredientsPizzas) {
        IngredientsPizzas = ingredientsPizzas;
    }

    public Integer getPricePizzas() {
        return PricePizzas;
    }

    public void setPricePizzas(Integer pricePizzas) {
        PricePizzas = pricePizzas;
    }





    public Pizza(String namePizzas, Integer sizePizzas, String ingredientsPizzas, Integer pricePizzas) {
        NamePizzas = namePizzas;
        SizePizzas = sizePizzas;
        IngredientsPizzas = ingredientsPizzas;
        PricePizzas = pricePizzas;

    }


}
