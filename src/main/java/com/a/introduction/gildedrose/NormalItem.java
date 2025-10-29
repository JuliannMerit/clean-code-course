package com.a.introduction.gildedrose;

public class NormalItem extends BaseItem {
    public NormalItem(Item item) { super(item); }

    @Override
    public void useState() {
        decreaseSellIn();
        decreaseQuality(1);
        if (item.sellIn < 0) {
            decreaseQuality(1);
        }
    }
}

