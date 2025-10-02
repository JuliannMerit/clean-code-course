package com.a.introduction.gildedrose;

import java.util.Arrays;

class GildedRose {
	
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public static void main(String[] args) {

		Item[] items = new Item[] { 
							new Item("Default Item", 10, 20)
					   };

		GildedRose app = new GildedRose(items);

		app.updateQuality();

		System.out.println(app);

	}

    public void updateQuality(){
        for (int i = 0; i < items.length; i++) {
            int sellInChange = -1;
            int qualityChange = -1;
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                sellInChange = 0;
                qualityChange = 0;
            } else if (items[i].name.equals("Aged Brie")) {
                qualityChange = 1;
                if (items[i].sellIn <= 0) {
                    qualityChange = 2;
                }
            } else if (items[i].name.equals("Backstage passes")) {
                if (items[i].sellIn > 10) {
                    qualityChange = 1;
                } else if (items[i].sellIn > 5) {
                    qualityChange = 2;
                } else if (items[i].sellIn > 0) {
                    qualityChange = 3;
                } else {
                    qualityChange = -items[i].quality; // Drops to 0 after concert
                }
            } else {
                // Default item
                if (items[i].sellIn <= 0) {
                    qualityChange = -2;
                }
            }
            items[i].sellIn += sellInChange;
            if(items[i].quality + qualityChange > 50) {
                items[i].quality = 50;
            } else if (items[i].quality + qualityChange < 0) {
                items[i].quality = 0;
            } else {
                items[i].quality += qualityChange;
            }
        }
    }

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}