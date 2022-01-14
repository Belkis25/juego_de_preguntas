import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ------Bienvenido------");
        System.out.println("1. Configurar ");
        System.out.println("2. Salir ");
        System.out.println("------Seleccione una Opcion------");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1){

            System.out.println("Ingrese la cantidad de categorias (numero mayor o igual a 5) ");
            int cantidadCategorias = sc.nextInt();

            ArrayList<Categoria> categorias = new ArrayList();

            for (int k = 0; k < cantidadCategorias; k++) {

                System.out.println("Ingrese el nombre de la categoria");
                String nombreCategoria = sc.next();

                System.out.println("Ingrese la dificultad de la categoria (numerico del 1 al 5) ");
                int dificultad = sc.nextInt();

                System.out.println("Ingrese la cantidad de preguntas (numerico mayor o igual a 5) ");
                int cantPregunta = sc.nextInt();

                ArrayList<Preguntas> preguntas = new ArrayList();
                for (int i = 0; i < cantPregunta; i++) {
                    System.out.println("Ingrese la pregunta " + (i + 1));
                    String nombrePregunta = sc.next();

                    ArrayList<Respuestas> respuestas = new ArrayList();

                    for (int j = 0; j <= 4; j++) {
                        System.out.println("Ingrese la respuesta " + (j + 1));
                        String nombreRespuesta = sc.next();
                        System.out.println("La pregunta es la correcta? (S/N) ");
                        String esValida = sc.next();
                        Respuestas resp = new Respuestas();
                        resp.setMensaje(nombreRespuesta);
                        resp.setVerdadero(esValida.equalsIgnoreCase("S"));
                        respuestas.add(resp);
                    }
                    Preguntas pregun = new Preguntas();
                    pregun.setMensaje(nombrePregunta);
                    pregun.setListaRespuestas(respuestas);
                    preguntas.add(pregun);
                }
                Categoria categ = new Categoria();
                categ.setNombreCategoria(nombreCategoria);
                categ.setListaPreguntas(preguntas);
                categ.setDificultad(dificultad);
                categorias.add(categ);
            }
        }else
            System.out.println("Usted selecciono Salir");
        }
    }

