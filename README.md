# LosPiratasSaludables
Ejercicio de la clase del 23/09 de Patrones de Diseño

## Descripción:
Los piratas deciden comenzar una pelea (de a mentira) que es por puntos. Los piratas se atacan entre si. Cuando un pirata ataca a otro
este obtiene puntos (o no), dependiendo del ataque y defensa de ambos piratas. Los piratas deben mantener una dieta, por lo que beben
diferentes bebidas, las cuales (a veces) los hacen cambiar de estado.

### Estados
- Saludable: Un pirata saludable tiene 5 de ataque y 2 de defensa. Si bebe grog tres veces, se enferma y cambia al estado Escorbuto.
Si bebe jugo de naranja, se pones todavía más saludable, por lo que cambia al estado Hipersaludable.
- Escorbuto: Un pirata con escorbuto tiene 2 de ataque y 0 de defensa. Si bebe jugo de naranja se cura, por lo que vuelve al
estado Saludable.
- Hipersaludable: El pirata Hipersaludable se la re cree, por lo que tiene 10 de ataque y -2 de defensa *(glass cannon)*. Si bebe grog,
se pone un poco menos saludable, por lo que vuelve al estado Saludable.

Un pirata comienza su vida siendo Saludable.

### Puntaje
El puntaje de un pirata se calcula como la resta entre su ataque y la defensa de su objetivo.

Un pirata tiene 0 puntos al empezar el juego.
