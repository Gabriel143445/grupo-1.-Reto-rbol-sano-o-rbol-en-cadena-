Reto: Arbol Sano o Arbol en Cadena
Integrantes: Gabriel Jijon y Kerly Espinoza
Division del Trabajo
•	Gabriel Jijon:
o	Construccion del Arbol A ("LTX").
o	Consultas de propiedades (raiz, cantidad de nodos, hojas, altura y grados).
•	Kerly Espinoza:
o	Construccion del Arbol B ("GPS").
o	Implementacion del metodo esCadena.
o	Pruebas de casos limite y manejo de excepciones.
Compilacion y Ejecucion
1. Compilar
javac -encoding UTF-8 -d out src/arboles/modelo/*.java src/arboles/negocio/*.java src/arboles/app/*.java src/reto/MainReto.java
2. Ejecutar
java -cp out reto.MainReto
Analisis
El Arbol B se comporta como una lista enlazada (arbol degenerado). Al buscar un dato en el, la complejidad temporal se degrada de un comportamiento optimo a un rendimiento lineal $O(N)$ debido al recorrido secuencial nodo por nodo.

