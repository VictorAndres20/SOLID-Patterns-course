Open Close Principle

¿Esta nuestro diseño preparado para recibir extensiones?

"Software entities (classes, modules, functions...) shuold be open for extensions but closed for modifications"
- Bertrand Meyer

Ejercicio para el principio OCP

Habeis construido una clase GeneradorPrimos con un metodo primos que devuelve
los numeros primos entre 2 y el numero indicado.

Modificad la estructura para que quede cerrada a cambios en la clase GeneradorPrimos,
pero abierta a la extension. ¿Y que extension tenemos prevista?

Queremos que sea facil crear subclases de GeneradorPrimos que permitan distintas
ordenaciones de la lista devuelta.

Teneis un test que realiza dos pruebas: test_orden_natural y test_orden_inverso

La clase original (GeneradorPrimos) supera el test_orden_natural.

Debeis realizar tres pasos:
1 - Modificad la clase GeneradorPrimos para que permita subclases con ordenacion especifica
2 - Cread una subclase de GeneradorPrimos que devuelva la lista de primos de menor a mayor
3 - Adaptad el test para que test_orden_inverso use esta nueva clase

-------------------------------
No busqueis "lucimiento" en el uso de la API. No es necesario hacerlo todo en una linea ;-)
Intentad que el codigo resultado ilustre bien el principio explicado.
