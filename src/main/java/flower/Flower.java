package flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public void setPrice(double new_price) {
        if (new_price < 0) {
            price = 0;
        }
        else {
            price = new_price;
        }
    }
}
