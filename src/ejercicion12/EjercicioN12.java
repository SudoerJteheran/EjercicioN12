/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion12;
//import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class EjercicioN12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        double salario_h;
        double  datos_salario[];
        //Scanner entrada = new Scanner(System.in);
        
        //System.out.println("Ingrese el salario por hora: ");
        //salario_h = entrada.nextDouble();
        salario_h = 5000;
        
        //System.out.println("Ingrese las horas semanales de trabajo: ");
        //horas = entrada.nextInt();
        horas = 48;
        
        datos_salario = datos_salario_semanal(salario_h, horas);
        
        System.out.println("El salario semanal bruto es: " + datos_salario[0]);
        System.out.println("La retención en la fuente semanal es: " + datos_salario[1]);
        System.out.println("El salario semanal neto es: " + datos_salario[2]);
    }
    static double[] datos_salario_semanal( double salario_hora, int horas){
        double retencion_fuente = 0.125;
        double datos[] = new double[3];
        
        datos[0] = salario_hora * horas;
        datos[1] = retencion_fuente * datos[0];
        datos[2] = datos[0]- datos[1];
    
        return datos;
    }
}
