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

    public String getColor() {
        return color.toString();
    }

    public void setPrice(double price){
        this.price = price < 0 ? 0 : price;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
}
