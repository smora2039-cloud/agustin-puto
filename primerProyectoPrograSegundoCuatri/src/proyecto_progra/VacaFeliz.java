/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vacafeliz;

import java.util.Scanner;

/**
 *
 * @author flauros
 */
public class VacaFeliz {

  static Scanner leer = new Scanner(System.in);

  // --Arrays
  static String[][] nombreVacas = new String[100][7];
  static String[][] nombreAlimento = new String[100][7];
  static String[][] registroAlimentacion = new String[100][6];

  // --Ints
  static int vaca = 250;
  static int alimento = 100;

  // --Pasadores automaticos gestionados en una misma zona para facilitar flujo de
  // trabajo

  public static int siguienteVaca() {
    int indice = -1;
    for (int i = 0; i < 100; i++) {
      if (nombreVacas[i][0].equals("")) {
        indice = i;
        break;
      }
    }
    return indice;
  }

  public static int siguienteAlimento() {
    int indice = -1;
    for (int i = 0; i < 100; i++) {
      if (nombreAlimento[i][0].equals("")) {
        indice = i;
        break;
      }
    }
    return indice;
  }

  public static int siguienteAlimentacion() {
    int indice = -1;
    for (int i = 0; i < 100; i++) {
      if (registroAlimentacion[i][0].equals("")) {
        indice = i;
        break;
      }
    }
    return indice;
  }

  // --Metodo para Registrar las vacas
  public static void registrarVaca() {
    System.out.println("----------------------------------------");
    System.out.println("|          REGISTRO DE VACAS           |");
    System.out.println("----------------------------------------");
    System.out.println("Digite la posicion para almacenar");
    System.out.println("la vaca (1-100): ");
    System.out.println("");
    int fila = siguienteVaca();
    leer.nextLine(); // Evitar error de lectura

    if (fila == -1) {
      System.out.println("Ese id se encuentra ocupado");
      return;
    }

    if (nombreVacas[fila][1].equals("")) {
      int id = (fila + 1) + vaca;

      System.out.println("");
      System.out.println("Digite el codigo de la vaca: ");
      String codigoVaca = leer.nextLine();

      System.out.println("");
      System.out.println("Digite el nombre de la vaca: ");
      String nombreVaca = leer.nextLine();

      System.out.println("");
      System.out.println("Digite la edad de la vaca: ");
      Integer edadVaca = leer.nextInt();

      System.out.println("");
      System.out.println("Digiteñ el peso de la vaca: ");
      Integer pesoVaca = leer.nextInt();
      leer.nextLine();
      
      System.out.println("");
      System.out.println("Digite la raza de la vaca: ");
      String razaVaca = leer.nextLine();

      System.out.println("");
      System.out.println("Digite el estado productivo de la vaca: ");
      String estadoVaca = leer.nextLine();

      nombreVacas[fila][0] = String.valueOf(id);
      nombreVacas[fila][1] = codigoVaca;
      nombreVacas[fila][2] = nombreVaca;
      nombreVacas[fila][3] = String.valueOf(edadVaca);
      nombreVacas[fila][4] = String.valueOf(pesoVaca);
      nombreVacas[fila][5] = razaVaca;
      nombreVacas[fila][6] = estadoVaca;
    } else {
      System.out.println("La posicion esta ocupada");
    }
  }

  // --Metodo para modificar Vacas
  public static void editarVaca() {
    System.out.println("----------------------------------------");
    System.out.println("|         MODIFICACION DE VACAS        |");
    System.out.println("----------------------------------------");
    System.out.println("Digite el codigo de la vaca");
    System.out.println("a modificar: ");
    System.out.println("(1-100): ");
    System.out.println("");
    int fila = siguienteVaca();
    leer.nextLine();

    String buscaVaca = leer.nextLine();
    for (int i = 0; i < 100; i++) {
      if (buscaVaca.equals(nombreVacas[i][1])) {
        int id = (fila + 1) + vaca;

        System.out.println("");
        System.out.println("Digite el id de la vaca: ");
        String codigoVaca = leer.nextLine();

        System.out.println("");
        System.out.println("Digite el nombre de la vaca: ");
        String nombreVaca = leer.nextLine();

        System.out.println("");
        System.out.println("Digite la edad de la vaca: ");
        Integer edadVaca = leer.nextInt();

        System.out.println("");
        System.out.println("Digite el peso de la vaca: ");
        Integer pesoVaca = leer.nextInt();

        System.out.println("");
        System.out.println("Digite la raza de la vaca: ");
        String razaVaca = leer.nextLine();

        System.out.println("");
        System.out.println("Digite el estado productivo de la vaca: ");
        String estadoVaca = leer.nextLine();

        nombreVacas[i][0] = String.valueOf(id);
        nombreVacas[i][1] = codigoVaca;
        nombreVacas[i][2] = nombreVaca;
        nombreVacas[i][3] = String.valueOf(edadVaca);
        nombreVacas[i][4] = String.valueOf(pesoVaca);
        nombreVacas[i][5] = razaVaca;
        nombreVacas[i][6] = estadoVaca;
      } else {
        System.out.println("La posicion esta vacia");
      }
    }
  }

  // --Metodo para eliminar Vacas
  public static void eliminarVaca() {
    System.out.println("---------------------------------------");
    System.out.println("|         ELIMINACIÓN DE VACAS        |");
    System.out.println("---------------------------------------");
    System.out.println("");
    System.out.println("Digite el codigo de la vaca");
    System.out.println("a eliminar: ");
    leer.nextLine();
    String buscaVaca = leer.nextLine();
    for (int i = 0; i < 100; i++) {
      if (buscaVaca.equals(nombreVacas[i][1])) {
        for (int j = 0; j < 6; j++) {
          nombreVacas[i][j] = "";
        }
      }
    }

  }

  // --Metodo para Consultar Vacas
  public static void consultarVaca() {
    System.out.println("---------------------------------------");
    System.out.println("|          LISTADO DE VACAS           |");
    System.out.println("---------------------------------------");
    System.out.println("");
    for (int i = 0; i < 100; i++) {
      if (!nombreVacas[i][0].equals("")) {
        System.out.println("Numero: " + nombreVacas[i][0]);
        System.out.println("Codigo de la vaca: " + nombreVacas[i][1]);
        System.out.println("Nombre de la vaca: " + nombreVacas[i][2]);
        System.out.println("Edad de la vaca: " + nombreVacas[i][3]);
        System.out.println("Peso de la vaca: " + nombreVacas[i][4]);
        System.out.println("Raza de la vaca: " + nombreVacas[i][5]);
        System.out.println("Estado productivo: " + nombreVacas[i][6]);
      }
    }
  }

  // --Metodo para Gestionar las vacas
  public static void gestionVacas() {
    int opcion = 0;
    do {
      System.out.println("----------------------------------------");
      System.out.println("|           GESTION DE VACAS           |");
      System.out.println("----------------------------------------");
      System.out.println("Ingrese la opcion (1-5) luego presione");
      System.out.println("la tecla enter: ");
      System.out.println("1. Registrar vaca");
      System.out.println("2. Modificar vaca");
      System.out.println("3. Eliminar vaca");
      System.out.println("4. Consultar vacas");
      System.out.println("5. Regresar");
      System.out.println("-----------------------------------------");
      System.out.println("");
      System.out.println("Opcion: ");
      opcion = leer.nextInt();
      leer.nextLine();

      switch (opcion) {
        case 1:
          registrarVaca();
          break;
        case 2:
          editarVaca();
          break;
        case 3:
          eliminarVaca();
          break;
        case 4:
          consultarVaca();
          break;
      }
    } while (opcion < 5);
  }

  // --Metodo para Registrar Alimentos
  public static void registrarAlimento() {
    System.out.println("----------------------------------------");
    System.out.println("|        REGISTRO DE ALIMENTOS         |");
    System.out.println("----------------------------------------");
    System.out.println("Digite la posicion para almacenar");
    System.out.println("el alimento (1-100): ");
    System.out.println("");
    int fila = siguienteVaca();
    leer.nextLine(); // Evitar error de lectura

    if (fila == -1) {
      System.out.println("Ese Id se encuentra ocupado");
      return;
    }

    if (nombreAlimento[fila][1].equals("")) {
      int id = (fila + 1) + alimento;

      System.out.println("");
      System.out.println("Digite el codigo del alimento: ");
      String codigoAlimento = leer.nextLine();

      System.out.println("");
      System.out.println("Digite el nombre del alimento: ");
      String nombreDelAlimento = leer.nextLine();

      System.out.println("");
      System.out.println("Digite el tipo de alimento              ");
      System.out.println("(Concentrado, pasto, suplemento, otro): ");
      String tipoAlimento = leer.nextLine();

      System.out.println("");
      System.out.println("Digite la cantidad de alimento: ");
      Integer cantidadAlimento = leer.nextInt();
      leer.nextLine();

      System.out.println("");
      System.out.println("Digite la medida del alimento ");
      System.out.println("(kg, sacos, otro):            ");
      String medidaAlimento = leer.nextLine();

      System.out.println("");
      System.out.println("Digite el costo del alimento");
      System.out.println("sin puntos ni comas:        ");
      Double costoAlimento = leer.nextDouble();
      // El precio se maneja por unidad de alimento

      nombreAlimento[fila][0] = String.valueOf(id);
      nombreAlimento[fila][1] = codigoAlimento;
      nombreAlimento[fila][2] = nombreDelAlimento;
      nombreAlimento[fila][3] = tipoAlimento;
      nombreAlimento[fila][4] = String.valueOf(cantidadAlimento);
      nombreAlimento[fila][5] = medidaAlimento;
      nombreAlimento[fila][6] = String.valueOf(costoAlimento);
    } else {
      System.out.println("La posicion esta ocupada");
    }
  }

  // --Metodo para Modificar Alimentos
  public static void modificarAlimento() {
    System.out.println("----------------------------------------");
    System.out.println("|       MODIFICACION DE ALIMENTOS      |");
    System.out.println("----------------------------------------");
    System.out.println("Digite el codigo del alimento");
    System.out.println("a modificar: ");
    System.out.println("");
    int fila = siguienteAlimento();
    leer.nextLine();

    String buscaAlimento = leer.nextLine();
    for (int i = 0; i < 100; i++) {
      if (buscaAlimento.equals(nombreAlimento[i][1])) {
        int id = (fila + 1) + alimento;

        System.out.println("");
        System.out.println("Digite el codigo del alimento: ");
        String idAlimento = leer.nextLine();

        System.out.println("");
        System.out.println("Digite el nombre del alimento: ");
        String nombreDelAlimento = leer.nextLine();

        System.out.println("");
        System.out.println("Digite el tipo de alimento              ");
        System.out.println("(Concentrado, pasto, suplemento, otro): ");
        String tipoAlimento = leer.nextLine();

        System.out.println("");
        System.out.println("Digite la cantidad de alimento: ");
        Integer cantidadAlimento = leer.nextInt();

        System.out.println("");
        System.out.println("Digite la medida del alimento ");
        System.out.println("(kg, sacos, otro):            ");
        String medidaAlimento = leer.nextLine();

        System.out.println("");
        System.out.println("Digite el costo del alimento");
        System.out.println("sin puntos ni comas:        ");
        Double costoAlimento = leer.nextDouble();
        // El precio se maneja por unidad de alimento

        nombreAlimento[fila][0] = String.valueOf(id);
        nombreAlimento[fila][1] = idAlimento;
        nombreAlimento[fila][2] = nombreDelAlimento;
        nombreAlimento[fila][3] = tipoAlimento;
        nombreAlimento[fila][4] = String.valueOf(cantidadAlimento);
        nombreAlimento[fila][5] = medidaAlimento;
        nombreAlimento[fila][6] = String.valueOf(costoAlimento);
      } else {
        System.out.println("La posicion esta vacia");
      }
    }
  }

  // --Metodo para Eliminar Alimentos
  public static void eliminarAlimento() {
    System.out.println("---------------------------------------");
    System.out.println("|       ELIMINACIÓN DE ALIMENTO       |");
    System.out.println("---------------------------------------");
    System.out.println("");
    System.out.println("Digite el codigo del alimento");
    System.out.println("a eliminar: ");
    leer.nextLine();
    String buscaAlimento = leer.nextLine();
    for (int i = 0; i < 100; i++) {
      if (buscaAlimento.equals(nombreAlimento[i][1])) {
        for (int j = 0; j < 6; j++) {
          nombreAlimento[i][j] = "";
        }
      }
    }
  }

  // --Metodo para consultar Alimentos
  public static void consultarAlimentos() {
    System.out.println("---------------------------------------");
    System.out.println("|        LISTADO DE ALIMENTOS         |");
    System.out.println("---------------------------------------");
    System.out.println("");
    for (int i = 0; i < 100; i++) {
      if (!nombreAlimento[i][0].equals("")) {
        System.out.println("Numero: " + nombreAlimento[i][0]);
        System.out.println("Codigo del alimento: " + nombreAlimento[i][1]);
        System.out.println("Nombre del alimento: " + nombreAlimento[i][2]);
        System.out.println("Tipo de alimento: " + nombreAlimento[i][3]);
        System.out.println("Cantidad de alimento: " + nombreAlimento[i][4]);
        System.out.println("Medida del alimento: " + nombreAlimento[i][5]);
        System.out.println("Costo del alimento: " + nombreAlimento[i][6]);
      }
    }
  }

  // --Metodo para Gestion de Alimentos
  public static void gestionAlimento() {
    int opcion = 0;
    do {
      System.out.println("----------------------------------------");
      System.out.println("|         GESTION DE ALIMENTOS         |");
      System.out.println("----------------------------------------");
      System.out.println("Ingrese una opción (1-5) luego presione ");
      System.out.println("la tecla enter.");
      System.out.println("");
      System.out.println("1. Registrar Alimento");
      System.out.println("2. Modificar Alimento");
      System.out.println("3. Eliminar Alimento");
      System.out.println("4. Consultar Alimentos");
      System.out.println("5. Regresar");
      System.out.println("----------------------------------------");
      System.out.println("");
      System.out.print("Opcion: ");
      opcion = leer.nextInt();

      switch (opcion) {
        case 1:
          registrarAlimento();
          break;
        case 2:
          modificarAlimento();
          break;
        case 3:
          eliminarAlimento();
          break;
        case 4:
          consultarAlimentos();
          break;
      }
    } while (opcion < 5);
  }

  // --Metodo para registrar momentos de alimentacion
  public static void registrarAlimentacion() {
    int opcion = 0;
    
    System.out.println("----------------------------------------");
    System.out.println("|       REGISTRO DE ALIMENTACION       |");
    System.out.println("----------------------------------------");
    System.out.println("Digite la posicion para almacenar");
    System.out.println("la alimentacion (1-100): ");
    System.out.println("");
    System.out.print("Opcion: ");
    opcion = leer.nextInt();
    int fila = siguienteAlimentacion();
    leer.nextLine(); // Evitar error de lectura

    if (fila == -1) {
      System.out.println("Ese Id se encuentra ocupado");
      return;
    }

    if (nombreAlimento[fila][1].equals("")) {
      int id = (fila + 1) + alimento;

      System.out.println("");
      System.out.println("Digite el codigo de la vaca: ");
      String codigoVaca = leer.nextLine();

      boolean vacaExiste = false;
      for (int i = 0; i < 100; i++) {
        if (codigoVaca.equals(nombreVacas[i][1])) {
          vacaExiste = true;
          break;
        }
      }
      if (!vacaExiste) {
        System.out.println("No existe una vaca con ese codigo");
        return;
      }

      System.out.println("");
      System.out.println("Digite el codigo del alimento: ");
      String codigoAlimento = leer.nextLine();

      int filaAlimento = -1;

      boolean alimentoExiste = false;
      for (int i = 0; i < 100; i++) {
        if (codigoAlimento.equals(nombreAlimento[i][1])) {
          alimentoExiste = true;
          filaAlimento = i;
          break;
        }
      }
      if (!alimentoExiste) {
        System.out.println("No existe un alimento con ese codigo");
        return;
      }

      System.out.println("");
      System.out.println("Digite la cantidad de alimento: ");
      Integer cantidadAlimento = leer.nextInt();

      leer.nextLine();
      System.out.println("");
      System.out.println("Digite la fecha de alimentacion");
      System.out.println("(dd/mm/aaaa):                  ");
      String fechaAlimentacion = leer.nextLine();

      System.out.println("");
      System.out.println("Digite la hora de alimentacion");
      System.out.println("(Hora.Minuto):                ");
      String horaAlimentacion = leer.nextLine();

      int stockActual = Integer.parseInt(nombreAlimento[filaAlimento][4]);

      if (stockActual < cantidadAlimento) {
        System.out.println("No hay suficiente stock de ese alimento");
        return;
      }

      nombreAlimento[filaAlimento][4] = String.valueOf(stockActual - cantidadAlimento);

      registroAlimentacion[fila][0] = String.valueOf(id);
      registroAlimentacion[fila][1] = codigoVaca;
      registroAlimentacion[fila][2] = codigoAlimento;
      registroAlimentacion[fila][3] = String.valueOf(cantidadAlimento);
      registroAlimentacion[fila][4] = fechaAlimentacion;
      registroAlimentacion[fila][5] = horaAlimentacion;
    } else {
      System.out.println("La posicion esta ocupada");
    }
  }

  // --Metodo para modifcar registros de alimentacion
  public static void modificarAlimentacion() {
    System.out.println("----------------------------------------");
    System.out.println("|      MODIFICACION DE ALIMENTACION    |");
    System.out.println("----------------------------------------");
    System.out.println("Digite el numero de registro");
    System.out.println("a modificar: ");
    System.out.println("");
    String buscaAlimentacion = leer.nextLine();

    boolean encontrada = false;
    for (int i = 0; i < 100; i++) {
      if (buscaAlimentacion.equals(registroAlimentacion[i][0])) {
        encontrada = true;

        System.out.println("");
        System.out.println("Digite el codigo de la vaca: ");
        String codigoVaca = leer.nextLine();

        boolean vacaExiste = false;
        for (int j = 0; j < 100; j++) {
          if (codigoVaca.equals(nombreVacas[j][1])) {
            vacaExiste = true;
            break;
          }
        }
        if (!vacaExiste) {
          System.out.println("No existe una vaca con ese codigo");
          return;
        }

        System.out.println("");
        System.out.println("Digite el codigo del alimento: ");
        String codigoAlimento = leer.nextLine();

        boolean alimentoExiste = false;
        for (int k = 0; k < 100; k++) {
          if (codigoAlimento.equals(nombreAlimento[k][1])) {
            alimentoExiste = true;
            break;
          }
        }
        if (!alimentoExiste) {
          System.out.println("No existe un alimento con ese codigo");
          return;
        }

        System.out.println("");
        System.out.println("Digite la cantidad de alimento: ");
        Integer cantidadAlimento = leer.nextInt();
        leer.nextLine();

        System.out.println("");
        System.out.println("Digite la fecha de alimentacion");
        System.out.println("(dd/mm/aaaa): ");
        String fechaAlimentacion = leer.nextLine();

        System.out.println("");
        System.out.println("Digite la hora de alimentacion");
        System.out.println("(Hora.Minuto): ");
        String horaAlimentacion = leer.nextLine();

        registroAlimentacion[i][1] = codigoVaca;
        registroAlimentacion[i][2] = codigoAlimento;
        registroAlimentacion[i][3] = String.valueOf(cantidadAlimento);
        registroAlimentacion[i][4] = fechaAlimentacion;
        registroAlimentacion[i][5] = horaAlimentacion;

        break;
      }
    }

    if (!encontrada) {
      System.out.println("No se encontro ningun registro con ese numero");
    }
  }

  // --Metodo para eliminar registros de alimentacion
  public static void eliminarAlimentacion() {
    System.out.println("---------------------------------------");
    System.out.println("|     ELIMINACIÓN DE ALIMENTACION     |");
    System.out.println("---------------------------------------");
    System.out.println("");
    System.out.println("Digite el numero de registro");
    System.out.println("a eliminar: ");
    leer.nextLine();
    String buscaAlimentacion = leer.nextLine();
    for (int i = 0; i < 100; i++) {
      if (buscaAlimentacion.equals(registroAlimentacion[i][0])) {
        for (int j = 0; j < 6; j++) {
          registroAlimentacion[i][j] = "";
        }
      }
    }
  }

  // --Metodo para consultar registros de alimentacion
  public static void consultarAlimentacion() {
    System.out.println("---------------------------------------");
    System.out.println("|        LISTADO DE ALIMENTOS         |");
    System.out.println("---------------------------------------");
    System.out.println("");
    for (int i = 0; i < 100; i++) {
      if (!registroAlimentacion[i][0].equals("")) {
        System.out.println("Numero: " + registroAlimentacion[i][0]);
        System.out.println("Codigo de la vaca: " + registroAlimentacion[i][1]);
        System.out.println("Codigo del alimento: " + registroAlimentacion[i][2]);
        System.out.println("Cantidad: " + registroAlimentacion[i][3]);
        System.out.println("Fecha de alimentacion: " + registroAlimentacion[i][4]);
        System.out.println("Hora de alimentacion: " + registroAlimentacion[i][5]);
      }
    }
  }

  // --Metodo para la gestion y registro de alimentacion
  public static void registroAlimentario() {
    int opcion = 0;
    do {
      System.out.println("----------------------------------------");
      System.out.println("|        GESTION DE ALIMENTACION       |");
      System.out.println("----------------------------------------");
      System.out.println("Ingrese una opción (1-5) luego presione ");
      System.out.println("la tecla enter.");
      System.out.println("");
      System.out.println("1. Registrar Alimentacion");
      System.out.println("2. Modificar Alimentacion");
      System.out.println("3. Eliminar Alimentacion");
      System.out.println("4. Consultar Alimentacion");
      System.out.println("5. Regresar");
      System.out.println("----------------------------------------");
      System.out.println("");
      System.out.print("Opcion: ");
      opcion = leer.nextInt();

      switch (opcion) {
        case 1:
          registrarAlimentacion();
          break;
        case 2:
          modificarAlimentacion();
          break;
        case 3:
          eliminarAlimentacion();
          break;
        case 4:
          consultarAlimentacion();
          break;
      }
    } while (opcion < 5);

  }

  public static void menuPrincipal() {

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 7; j++) {
        nombreVacas[i][j] = "";
      }
    }

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 7; j++) {
        nombreAlimento[i][j] = "";
      }
    }

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 6; j++) {
        registroAlimentacion[i][j] = "";
      }
    }

    int opcion = 0;
    do {
      System.out.println("----------------------------------------");
      System.out.println("|           LA VAQUITA FELIZ           |");
      System.out.println("----------------------------------------");
      System.out.println("Ingrese una opción (1-5) luego presione ");
      System.out.println("la tecla enter.");
      System.out.println("");
      System.out.println("1. Gestión de Vacas");
      System.out.println("2. Gestión de Alimentos");
      System.out.println("3. Registro de Alimentación");
      System.out.println("4. Registro de Producción");
      System.out.println("5. Reportes");
      System.out.println("----------------------------------------");
      System.out.println("");
      System.out.print("Opcion: ");
      opcion = leer.nextInt();

      switch (opcion) {
        case 1: gestionVacas();
            break;
        case 2: gestionAlimento();
            break;
        case 3: registroAlimentario();
            break;
          

      }
      if (opcion < 0) {
        System.exit(0);
      }
    } while (opcion < 6);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      menuPrincipal();
  }

}
