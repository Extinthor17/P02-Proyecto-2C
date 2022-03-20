# Proyecto del Segundo Cuatrimestre Fundamentos de Programaci�n (Curso  \<21\>/\<22\>)
Autor/a: \<Carlos Santos Exp�sito\>   uvus:\<carsanexp\>

El dataset consiste en todas las habilidades y pasivas de los actuales campeones del videojuego "League of Legends".
El proyecto se basa en recoger todos las distintas caracteristicas de campeones y habilidades y tratarlas.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. 
  * **fp.\<dominio\>**: Paquete que contiene los tipos del proyecto.
  * **fp.\<dominio\>.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **\<dataset1.csv\>**: Añade una descripción genérica del dataset.
    * **\<dataset2.csv\>**: Añade una descripción del resto de datasets que puedas tener.
    
## Estructura del *dataset*

El dataset tiene la siguiente estructura; Champion Ability Type Description Range Cooldown Cost Scalings, teniendo cada una; nombre del campeon, nombre de la habilidad
tipo de habilidad, descripcion de la misma, rango, enfriamiento, coste y como escala. 

El dataset est� compuesto por \<8\> columnas, con la siguiente descripci�n:

* **\<columna 1>**: de tipo \<string\>, representa el nombre del campeon.
* **\<columna 2>**: de tipo \<string\>, representa el nombre de la habilidad.
* **\<columna 3>**: de tipo \<string\>, representa el tipo de habilidad.
* **\<columna 4>**: de tipo \<string\>, representa la descripcion de la habilidad.
* **\<columna 5>**: de tipo \<int\>, representa el valor del rango de la habilidad.
* **\<columna 6>**: de tipo \<int\>, representa el valor del enfriamiento de la habilidad.
* **\<columna 7>**: de tipo \<int\>, representa el coste en man� o energia de la habilidad.
* **\<columna 8>**: de tipo \<string\>, representa el escalado en da�o de la habilidad.



## Tipos implementados

Describe aqu�� los tipos que usas en tu proyecto.

### Tipo Base
Descripci�n breve del tipo base.

**Propiedades**:

- _campeon_, de tipo \<String\>, no consultable y modificable. 
- _habilidad_, de tipo \<String\>, no consultable y modificable. 
- _descripcion_, de tipo \<String\>, no consultable y modificable. 
- _tipo_, de tipo \<String\>, no consultable y modificable. 
- _escalados_, de tipo \<String\>, no consultable y modificable. 
- _rango_, de tipo \<Integer\>, no consultable y modificable. 
- _coste_, de tipo \<Integer\>, no consultable y modificable. 
- _enfriamiento_, de tipo \<Integer\>, no consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: cuyo nombre es HabilidadesCampeones, contiene todas los parametros provenientes del dataset. 
Adem�s, se le incluye restricciones de valores a determinadas variables, como el coste de la habilidad(no negativo), enfriamiento (no  negativo) y tipo.

- C2: su nombre es HabilidadesCampeones y es una version simplificada del anterior constructor ya que no contiene la descripcion de habilidades del anterios.
En los demas aspectos es identico, incluidas las restricciones de variables.
- ...

**Restricciones**:
 
- R1: El valor de la variable coste(cos) no puede ser negativo.
- R2: El valor de la variable enfriamiento(enf) no puede ser negativo.
- R3: El valor de la variable tipo(tip) no puede ser distinto a los valores "Q,W,E,R,Passive".
- 
**Criterio de igualdad**: Dos habilidades de campeones son la misma cuando el nombre de la habilidad, el nombre del campe�n al que pertenecen, su enfriamiento y su tipo son iguales.

**Criterio de ordenaci�n**: Las habilidades se ordenan segun el coste de las mismas, yendo de menor a mayor coste.

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
