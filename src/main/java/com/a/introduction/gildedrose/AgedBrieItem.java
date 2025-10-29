package com.a.introduction.gildedrose;

public class AgedBrieItem extends BaseItem {
    public AgedBrieItem(Item item) { super(item); }

    @Override
    public void useState() {
        decreaseSellIn();
        increaseQuality(1);
        if (item.sellIn < 0) increaseQuality(1);
    }
}

