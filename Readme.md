Como gestiona el JVM
HEAP (MEMORIA PRINCIPAL) Aqui se crean los objetos:
    String nombre = new String("Carlos)
    esto vive el el heap

STACK (memoria en ejecucion)
    variables locales
    metodos en ejecucion


Garbage collector(limpiador de memoria automatico)

    Elimina elementos que no se estan usando
    String nombre = new String("Carlos)
    nombre = null
    GC lo elimina
        elimina por referencias nulas o inaccesibles,
        solo quedan referencias activas

        tipos 
        G1 GC (por defecto)
        ZGC → ultra rápido, baja latencia
        Shenandoah → pausas casi inexistentes

son 2 zonas de memoria que usa java virtual machine:
Stack: pila de ejecicion, Dentro del stack se guarda las referencias primitivas, un espacio memoria que guarda datos primitivos, variables locales, llamadas de metodos.

Heap: monticulos Dentro de HEAP se guardan ojetos , arrays, instancias de clases, es memoria grande y dinamica, caracteristicas mas lento que el stack, mucho mas grande, lo gestiona el garbage collector.

cuando es un objeto static no es necesario instanciar la clase.
