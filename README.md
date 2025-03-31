Que es una flag 
Un flag es un indicador usado en sistemas informáticos y programación que ayuda a
señalar una condición o estado especifico, esto depende del contexto ya que puede tener
distintos significados
Suele ser una variable que indica laa condición de verdadero o falso.
También puede ser un valor numérico que representa múltiples estados usando
operaciones Bit.
También los flag en registros CPU
Son bits qué tiene un registro especial de procesador resultado operaciones (como si
hubo un desbordamiento, si el resultado es cero etc.)
En comadnos de terminal el flag
Es una opción l parámetro que se pasa aún copado para modificar comportamiento.

• Que es el metodo wait().
El método wait() es usado en Java como una función que pertenece a la clase de object
y se usa en sincronizaron de hilos (threads), el propósito de este es que se generen hilos,
se suspenda temporalmente hasta otro hilo y despierte usando notify() o notifyAll().

El método wait().
Libera el bloqueo de objetos sobre el que se llamo wait(), permitiendo que otros hilos se
usen.
Como se gunda característica: Debe llamarse dentro de blqueo sincronizado o
(synchronized)

• Que es el metodo notify(),
El método notify() en jaca es una función en la clase de object qué se usa en la
sincronizaron de hilos, su función es es despertar un hilo wue este esperado (wait()) en
el mismo objeto monitor.
Como caracteristicas, el método notify(), Despierta un solo hilo que este en espera
(wait()).
Al igual que debe llamarse dentro de in bloqueo sincronizado (symchromized), y como
tercer característica, no libera inmediatamente el bloqueo, el hilo despertado solo se
ejecuta cuando el hilo actual libera el monitor.

El método notify() en java es una función en la clase de object qué se usa en la
sincronizaron de hilos, su función es es despertar un hilo wue este esperado (wait()) en
el mismo objeto monitor.
Como caracteristicas, el método notify(), Despierta un solo hilo que este en espera
(wait()).
Al igual que debe llamarse dentro de in bloqueo sincronizado (symchromized), y como
tercer característica, no libera inmediatamente el bloqueo, el hilo despertado solo se
ejecuta cuando el hilo actual libera el monitor.

• Diferencias en programación normal y programación funcional
La programacion“normal” o imperativa, se basa en la ejecución de una serie de
instrucciones secuenciales que modifican el estado del programa. En este enfoque, el
código describe explícitamente los pasos que debe seguir la computadora para alcanzar
un resultado. Se utilizan variables que pueden cambiar su valor a lo largo de la
ejecución, estructuras de control como condicionales y bucles, y funciones que pueden
modificar el estado global del programa. Este paradigma es el más común y es utilizado
en la mayoría de los lenguajes de programación populares como Java, C, Python y
JavaScript.
Por otro lado, la programación funcional se centra en la aplicación de funciones puras,
lo que significa que una función siempre devuelve el mismo resultado para los mismos
valores de entrada y no produce efectos secundarios. En este paradigma, se evita el uso
de variables mutables y se favorece la inmutabilidad, lo que ayuda a reducir errores
relacionados con el cambio de estado. En lugar de bucles tradicionales, se utilizan
funciones de orden superior como map, filter y reduce, que permiten operar sobre
estructuras de datos de manera declarativa. La programación funcional se basa en
conceptos matemáticos y es especialmente útil en situaciones donde se requiere
concurrencia, procesamiento de datos a gran escala o una alta fiabilidad del código.
Mientras que la programación imperativa indica explícitamente cómo realizar una tarea
paso a paso, la programación funcional se enfoca en describir qué se quiere obtener sin
especificar cada detalle de la ejecución. Esto hace que el código funcional sea más
declarativo y, en muchos casos, más fácil de razonar y mantener. Sin embargo, también
puede resultar menos intuitivo para quienes están acostumbrados a la programación
tradicional, ya que requiere un cambio de mentalidad al trabajar con funciones puras y
evitar la modificación del estado del programa.
