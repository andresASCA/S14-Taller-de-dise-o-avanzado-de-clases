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

#### Codigo
##### Clase Main
La clase **Main** contiene el método **main** que inicia el programa, mostrando un menú interactivo por consola donde el usuario puede agregar cartas o ver las cartas registradas en su colección. Se utiliza un objeto **Scanner** para leer la entrada del usuario y una instancia de **ColeccionCartas** para almacenar las cartas. Cuando se selecciona la opción "1", el programa solicita al usuario que ingrese los datos de una nueva carta (nombre, tipo, poder y descripción), validando que el nombre y la descripción solo contengan letras y espacios, que el tipo sea "común" o "legendaria", y que el poder sea un número entero no negativo. Si todos los datos son válidos, se crea un objeto **Carta** y se agrega a la colección. Si se elige la opción "2", se muestran todas las cartas almacenadas. La opción "0" finaliza el programa. También se manejan entradas inválidas para evitar errores al momento de ingresar datos.

![MAIN 1](https://github.com/user-attachments/assets/461ab758-4395-4a79-8bea-965743e95cde)
![MAIN 2](https://github.com/user-attachments/assets/87f2e33c-f680-4064-96bb-14c3ceb495c9)
![MAIN 3](https://github.com/user-attachments/assets/42ef9df7-a6a6-4676-9679-aa48f2581397)

##### Clase Carta 
La clase Carta cuenta con 4 atributos privados **Nombre**, **tipo**, **poder** y **descripcion** que almacenan respectivamente el nombre de la carta, su categoría como (Común o legendaria), un valor numérico que indica su poder y una breve descripción. Tiene un constructor que permite inicializar estos valores al crear una nueva carta y métodos públicos llamados getters (**getNombre**, **getTipo**, **getPoder**, **getDescripcion**) que permiten acceder a los atributos desde fuera de la clase. Además, sobrescribe el método **toString()** para mostrar la información de la carta en un formato legible, devolviendo una cadena con el nombre, tipo, poder y descripción, útil al imprimir el objeto. Esta clase es la base para modelar cartas en un sistema o juego que maneje una colección de cartas.

![CARTA ](https://github.com/user-attachments/assets/d0d24ddd-a9e3-4d16-91c5-a55e597369a1)

##### Clase ColeccionCarta
Esta clase gestiona la coleccion personalizada de cartas por nombre, utilizando un **HashMap** donde la clave es el nombre de la carta y el valor es una lista de copias de esa carta. El objetivo principal es permitir agregar cartas siguiendo las reglas - parametros del juego  **Hearthstone** : un máximo de 1 carta legendaria y hasta 2 cartas comunes del mismo tipo (con el mismo nombre).

Lo que hacemos es que al agregar una carta validamos su tipo (Legendaria o Comun) con esto controlamos que no pase el limite permitido de copias. Si esto es verdadero es decir si cumple con las condiciones, se añade a la coleccion y se muestra un mensaje de confirmacion. Tambien incluimos el metodo **verCartas()** que imprime todas las cartas registradas, junto con sus copias, mostrando su información detallada. 

![Imagen 1](https://github.com/user-attachments/assets/b8f0c766-6ae5-45da-bf0c-860a1fe3d73c)
![Imagen 2](https://github.com/user-attachments/assets/bf5f575f-0f43-4db3-8849-ad1de567a2ef)

#### Ejecucion 
Como usuario podra observar un menu en consola con las opciones las cuales puede utilizar. Las cuales son: 
1. Agregar Carta 
2. Ver cartas
0. Salir
<img width="238" alt="captura 3" src="https://github.com/user-attachments/assets/b0719c1e-cb00-403b-8cf5-d9d64d600e10" />

Cuando el usuario seleccione una de las tres opciones, por ejemplo en este caso, la opción 1 para Agregar carta, se desplegarán una serie de campos que deberá completar: Nombre, Tipo, Poder y Descripción. En esta primera captura se puede ver lo de ingresar los datos y verifica la condición de que no puede haber más de una copia de una carta de tipo legendaria.

![Ejecucion 1](https://github.com/user-attachments/assets/638dbf69-7358-4e7d-aceb-db395c58fbdd)

Tambien en estas capturas seguimos en la opción 1 verificando el parámetro de que no debe haber más de una copia pero ahora del Tipo de carta Común.

<img width="410" alt="Ejecucion 2" src="https://github.com/user-attachments/assets/c51e8e44-61fa-4f43-9876-a3309114010e" />
![Ejecucion 2](https://github.com/user-attachments/assets/dbb7e03d-ae45-4cf0-a167-9e3533508d56)
