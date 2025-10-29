package com.a.introduction.gildedrose;

public class CustomisedItemFactory {

    public static CustomisedItem customiseItem(Item item) {
        // Centraliser la logique de création dans ItemFactory
        return ItemFactory.of(item);
    }

}
