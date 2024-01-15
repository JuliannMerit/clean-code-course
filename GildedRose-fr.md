# Spécification de la Rose dorée (Gilded Rose)

L'équipe de la Rose dorée achète et vend les pierres précieuses.
Malheureusement, la qualité des marchandises se dégrade constamment à l'approche de leur date de péremption.

### Détail du système

Un système a été mis en place pour mettre à jour l'inventaire.

- Tous les éléments ont une valeur : 
  -  `sellIn` qui désigne le nombre de jours restant pour vendre l'article.
  -  `quality` qui dénote combien l'article est précieux.
- À la fin de chaque journée, notre système diminue ces deux valeurs pour chaque produit.

### Rèlges de gestion

- Une fois que la date de péremption est passée, la qualité se dégrade **deux fois** plus rapidement.
- La qualité (`quality`) d'un produit ne peut jamais être négative.
- "**Aged Brie**" augmente sa qualité (`quality`) plus le temps passe.
- La qualité d'un produit n'est jamais de plus de **50**.
- "**Sulfuras**", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (`quality`)
- "**Backstage passes**", comme le "Aged Brie", augmente sa qualité (`quality`) plus le temps passe (`sellIn`) ; La qualité augmente de 2 quand il reste 10 jours ou moins et de 3 quand il reste 5 jours ou moins, mais la qualité tombe à 0 après le concert.


Vous pouvez faire les changements que vous voulez à la méthode `updateQuality` et ajouter autant de code que vous voulez, tant que tout fonctionne correctement.
Cependant, vous ne devez en aucun cas modifier la classe `Item` ou ses propriétés.



## Exercises
- Exercice I  : Améliorer la clarté de GildedRoseADefaultItemTest.java
- Exercice II : Améliorer la clarté de GildedRoseBAgedBrieTest.java
- Exercice III: Améliorer la clarté de GildedRoseCBackstagePassesTest.java