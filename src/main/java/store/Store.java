package store;

import java.util.ArrayList;
import java.util.List;
import filters.Filter;
import flower.Item;

public class Store {
    private List<Item> items;

    public Store(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> search(Filter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
