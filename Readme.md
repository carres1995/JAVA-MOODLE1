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

