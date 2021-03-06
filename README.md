# vCamp-Challenge
1. Avistaje de Pájaros
Dado un array en el que se contabilizan los avistajes de distintos tipos pájaros, identificados por 
medio de un ID, determinar qué tipo de pájaro fue visto con mayor frecuencia. Si más de un tipo de 
pájaro coinciden con la mayor cantidad de avistajes, devolver el ID de menor valor.
Ejemplo: Arr = [1,1,2,2,3]
Se solicita completar la función pajarosMigratorios(), asumiendo que se reciben 2 parámetros
Parámetros de entrada
- n: cantidad de pájaros vistos
- int arr[n]: tipos de pájaros vistos
Parámetros de salida
- int: el type ID más bajo de los pájaros más vistos
Input Format
La primera línea contiene un integer, n, el tamaño de arr.
La segunda línea describe arr como una lista de n números separados por espacio, representando
cada uno a un tipo de pájaro visto.
Ejemplo Input #1
n= 6arr= 1 4 4 4 5 3
Ejemplo Output #1
4
Ejemplo Input #2
n= 11arr= 1 2 3 4 5 4 3 2 1 3 4
Ejemplo Output #2
3

-----------------------------------------------------------------------------------------------

2. Puntuando exámenes
V_ University tiene la siguiente política para evaluar a sus alumnos:
- Cada estudiante recibe una nota de 0 a 100
- Una nota menor a 40 significa que el alumno no aprobó
Matías es un profesor de la universidad y le gusta redondear la nota de cada alumno en función de 
las siguientes reglas:
- Si la diferencia entre la nota y el siguiente múltiplo de 5 es menor a 3, redondear la nota al
siguiente múltiplo de 5
- Si la nota es menor a 38, no se redondea ya que de todas formas el alumno ha reprobado
Ejemplos:
- Si la nota es 84, se redondea a 85
- Si la nota es 29, no se redondea
- Si la nota es 57, no se redondea
Se solicita realizar la función redondearNota(arreglo) asumiendo que se recibe como parámetro de 
input un array de notas a redondear.
Input
int notas[n]: notas antes de redondear
Output
int[n]: notas luego de redondear
Ejemplo de Input
473673833
Ejemplo de Output
75674033

--------------------------------------------------------------------------------------------------------------------

3. La máquina del tiempo
Juan inventó una máquina del tiempo y quiere probarla viajando en el tiempo para visitar Rusia en 
un rango de tiempo entre los años 1700 a 2700.
De 1700 a 1917, el calendario oficial de Rusia fue el calendario juliano; desde 1919 en adelante 
utilizaron el sistema de calendario gregoriano. 
La transición del sistema de calendario juliano al gregoriano ocurrió en 1918, cuando el día siguiente 
al 31 de enero fue el 14 de febrero. Esto significa que en 1918, el 14 de febrero era el día 32 del año 
en Rusia.
En ambos sistemas de calendario, febrero es el único mes con una cantidad variable de días; tiene 
29 días durante un año bisiesto y 28 días durante los demás años. En el calendario juliano, los años 
bisiestos son divisibles por 4; en el calendario gregoriano, los años bisiestos son cualquiera de los 
siguientes: 

1. Divisible por 400.
2.Divisible por 4 y no divisible por 100

Se solicita completar la función viajarEnElTiempo(año, día), la cual deberá devolver una cadena que 
represente la fecha correspondiente al día en el año indicado en los parámetros de la función.
- Consideración: Ambos parámetros son números enteros
Restricciones
1. Año mínimo: 1700. 2. Año máximo: 2700
Salida esperada
Imprimir la fecha completa como resultado de la conversión durante el año en el formato
dd.mm.yyyy, donde dd es el día de dos dígitos, mm es el mes de dos dígitos y yyyy corresponde al
año
-Ejemplo 1
-• viajarEnElTiempo(2021, 312)
-Resultado esperado 1
-• 08.11.2021
-Ejemplo 2 (año bisiesto)
-• viajarEnElTiempo(2016, 313)
-Resultado esperado 2
-• 08.11.2016
-Ejemplo 3 (año bisiesto juliano)
-• viajarEnElTiempo(1800, 313)
-Resultado esperado 2
-• 08.11.1800
