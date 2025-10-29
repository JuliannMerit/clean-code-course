package com.a.introduction.gildedrose;

public class BackstageItem extends BaseItem {
    public BackstageItem(Item item) { super(item); }

    @Override
    public void useState() {
        decreaseSellIn();
        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }
        increaseQuality(1);
        if (item.sellIn < 10) increaseQuality(1);
        if (item.sellIn < 5) increaseQuality(1);
    }
}

