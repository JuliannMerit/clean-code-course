package com.a.introduction.gildedrose;

public class ItemFactory {
    public static CustomisedItem of(Item item) {
        if (item == null) return null;
        if ("Aged Brie".equals(item.name)) return new AgedBrieItem(item);
        if ("Backstage passes".equals(item.name)) return new BackstageItem(item);
        if ("Sulfuras, Hand of Ragnaros".equals(item.name)) return new SulfurasItem(item);
        return new NormalItem(item);
    }
}

