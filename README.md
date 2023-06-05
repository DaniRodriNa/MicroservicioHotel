# MicroservicioHotel
## Resumen
Microservicio Hotel que  recoge una lista de hoteles, actualiza la disponibilidad del hotel. 
## Estructura
### Paquetes
* com.curso.inicio
  - Clase **Application.java**
* com.curso.model
  - Clase **Hotel.java**
    - idHotel: numero entero, identificador del hotel
    - nombre: nombre del hotel
    - dni: cadena con el dni del cliente
    - disponibilidad: booleano si el hotel esta disponible
    - categoria: cuantas estrellas tiene
* com.curso.dao
  - Clase **HotelDao.java**
* com.curso.service
  - Interfaz **HotelesService.java**
  - Clase **HotelesServiceImpl.java** (Implementa la interfaz **HotelesService.java**)
* com.curso.controller
  - Clase **HotelesController.java**
  
  > GET: Recojo la lista de los hoteles
  
  > PUT: Actualizo el hotel

### Metodos
* listaHoteles() -> Lista de hoteles almacenados
* actualizarHotel(int idHotel,boolean disponible) -> Actualizo un hotel pasando el id y true o false como parametros
## Autor
* Daniel Rodriguez
## Estado
🟢Terminado🟢
