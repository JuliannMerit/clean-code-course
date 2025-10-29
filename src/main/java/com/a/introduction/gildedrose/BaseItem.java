package com.a.introduction.gildedrose;

/** Helper abstrait pour comportements communs */
public abstract class BaseItem implements CustomisedItem {
    protected final Item item;

    protected BaseItem(Item item) {
        this.item = item;
    }

    protected void decreaseSellIn() {
        item.sellIn--;
    }

    protected void decreaseQuality(int by) {
        item.quality = Math.max(0, item.quality - by);
    }

    protected void increaseQuality(int by) {
        item.quality = Math.min(50, item.quality + by);
    }
}

