# S14 Taller de diseño avanzado de clases
Taller Progreso 3 - Programación 2 

##### Integrantes 
- Oliver Quila
- Sebastian Ruiz 
- Andres Sigcha 

#### Descripcion Actividad
En este taller vamos a desarrollar una colección de cartas personalizada para un usuario, inspirada en el juego Hearthstone. Cada carta tendrá ciertas características clave que el usuario deberá ingresar manualmente, tales como:

- Nombre
- Poder
- Descripción

Tambien el programa deberá permitir al usuario indicar si existe un límite de copias por tipo de carta en su mazo y cuántas cartas tiene actualmente.

Algo importante que debemos tener en cuenta es identificar los posibles errores que puede surgir y controlarlos utilizando las estruturas de try, catch y finally. Por ejemplo:
- El usuario podría ingresar un número cuando se espera un texto para el nombre de la carta.
- O al revés: podría escribir letras cuando se espera un valor numérico, como en el caso del poder .

#### Importante
Lo que debemos saber para este ejercicio es que Hearthstone es un juego de cartas en el que cada mazo tiene ciertas reglas respecto a la cantidad de copias que se pueden incluir por carta.
En concreto, es importante tener en cuenta el tipo de **rareza** de la carta:

- Las cartas comunes (comunes, raras o épicas) pueden incluirse hasta en 2 copias por mazo.
- Las cartas legendarias son especiales y solo se permite 1 copia por mazo.

[![Hearthstone](https://cdn.mos.cms.futurecdn.net/rWmVewQjczBnK6a9McLYVV.jpg "Hearthstone")](https://th.bing.com/th/id/R.434d84e51170d6830035c2e7470c5767?rik=JdWTVIhEQyRzkA&pid=ImgRaw&r=0 "Hearthstone")


