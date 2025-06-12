# PROG-UD7-Ficheritos

# Actividad 1 - Guardar texto en un fichero mediante codigo

Este programa solicita al usuario que introduzca un texto por consola.
Asegura que el texto tenga al menos 30 caracteres: si el usuario introduce un texto más corto, el programa le pedirá que escriba uno más largo hasta que se cumpla la condición.

Una vez obtenido un texto válido, el programa:

- Convierte el texto a mayúsculas.

- Sustituye los espacios por guiones bajos (_).

- Guarda el resultado formateado en un archivo llamado texto.txt en el directorio actual.
## Principales funciones del programa
- Lectura del texto: Utiliza un objeto `Scanner` para leer la entrada del usuario.

- Validación: Comprueba la longitud del texto en un bucle hasta que sea igual o superior a 30 caracteres.

- Formateo: Convierte el texto a mayúsculas y reemplaza los espacios por guiones bajos para un formato uniforme.

- Escritura en archivo: Usa `FileWriter` para guardar el texto procesado en el fichero texto.txt.

- Gestión de recursos: Cierra correctamente el archivo y el lector de entrada, y muestra mensajes de error si ocurre algún problema durante la escritura.

# Actividad 2 - Leer y separar caracteres de un texto

Este programa lee el contenido de un fichero de texto llamado `ficherito.txt` y muestra cada carácter del archivo en la consola junto a su valor decimal (código ASCII), separados por una coma.

Por ejemplo, si el fichero contiene la palabra `Hola`, el programa mostrará en consola:
- `H_72, o_111, l_108, a_97,`

## Principales funciones del programa
- Lectura de archivo: Utiliza FileReader para acceder al contenido de ficherito.txt carácter por carácter.

- Procesamiento: Para cada carácter leído, el programa lo convierte a su correspondiente valor ASCII y lo imprime en el formato carácter_código,.

- Gestión de errores: Si ocurre algún problema (por ejemplo, el archivo no existe), muestra un mensaje de error por consola.

# Actividad 3 - Fusionar archivos de texto

Este programa fusiona el contenido de dos archivos de texto en un tercer archivo nuevo.
Además, crea el archivo de salida si no existe.

¿Cómo funciona?
1. Crea el archivo de salida (por ejemplo, `FicheroCreadoCodigo.txt`), mostrando un mensaje por consola con el nombre del archivo creado.

2. Llama al método `mergeFiles` de la clase `fileMerge`, pasando las rutas de los dos archivos a fusionar y la del archivo resultado.

3. El método `mergeFiles`:

- Lee línea a línea el primer archivo, almacenando su contenido.

- Lee línea a línea el segundo archivo, almacenando su contenido.

- Une ambos contenidos en una sola cadena de texto, separando cada uno con un título:
    - Contenido del Fichero Uno: "contenido del primer archivo"
    - Contenido del Fichero Dos: "contenido del segundo archivo"

- Escribe ese texto fusionado en el archivo de salida.

- Muestra por consola si la fusión fue correcta o si hubo un error
# Principales funciones y partes del código

- Lectura de archivos: Utiliza BufferedReader y FileReader para leer los dos archivos de entrada línea a línea.

- Almacenamiento del contenido: Usa StringBuilder para acumular el texto leído de cada archivo.

- Formateo: Prepara un texto final con los títulos requeridos y el contenido de ambos archivos.

- Escritura en archivo: Usa FileWriter para crear y escribir el resultado fusionado en el archivo de salida.

- Gestión de errores: Si ocurre cualquier error al crear, leer o escribir archivos, se muestra un mensaje claro en consola.

# Actividad 4 - Gestor de Mesas con Java y Archivos

Este ejercicio implementa un programa de consola que permite al usuario crear mesas y almacenarlas en un fichero de texto, así como listar todas las mesas guardadas. La solución está dividida en tres clases: `table`, `tableManager` y `main`.

## Clases 
1. Clase `table`
- Representa una mesa, con dos atributos: color (`String`) y número de patas (`int`).

- Incluye getters, setters, constructor y el método `toString()` para mostrar la mesa de forma legible por consola.

2. Clase `tableManager`
Contiene métodos estáticos para gestionar la persistencia de mesas en un archivo de texto:

   - `saveTableToFile(table t, String filePath)`: Guarda una mesa en el fichero en formato color;legNumber.

   - `getAllTablesFromFile(String filePath)`: Lee todas las mesas del fichero y devuelve una lista de objetos `table`.

3. Clase `main`
Presenta un menú interactivo al usuario con las siguientes opciones:

1. Nueva mesa: Solicita color y número de patas, crea el objeto y lo guarda usando `tableManager`.

2. Mostrar todas las mesas almacenadas: Recupera y muestra por consola todas las mesas del fichero.

0. Salir: Termina el programa.

## Funcionamiento general
- El usuario puede añadir tantas mesas como desee, y estas se guardan en el archivo `tables.txt` (puedes cambiar el nombre).

- El formato del archivo es sencillo, una mesa por línea:

    -  rojo;4
    -  azul;3

- Si selecciona la opción para mostrar mesas, el programa las lee del archivo, crea los objetos y muestra su descripción formateada.
