# Hunitalla
Currently in testing and bug fixing of MVP.

Upcoming additions
Expanded conversion between units of the same quantity type.
String parsing

I'll improve this read me sometime soon.
## Examples
```
val mass: Quantity<Mass> = 11.kg
val volume: Quantity<Volume> = 1.m * 50.mm * 12.c.m
val density: Quantity<Density> = mass / volume
```
The type declarations are not necessary. I included them in the code to illustrate that the operations automatically convert to the appropriate new quantity.
