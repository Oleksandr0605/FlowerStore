package flower;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }

}
