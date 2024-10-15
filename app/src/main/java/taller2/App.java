/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            System.out.println("Saldo: " + Calcular_saldo(2000000, 500000, 300000));  
        System.out.println("Saldo (base incorrecta): " + Calcular_saldo(1000000, 500000, 300000)); 
        System.out.println(Calcular_tip(100));  
        System.out.println(Calcular_tip(-50)); 
        System.out.println(Calcular_tip(0)); 
        System.out.println("Perímetro cuadrado: " + Calcular_perimetro_cuadrado(5));
        System.out.println("Puntos: " + Obtener_puntos(3, 1, 2));  
        System.out.println("Nota definitiva: " + Calcular_definitiva(4, 3.5f, 2, 4.5f, 3.5f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));  
        System.out.println("Nota para ganar: " + Calcular_para_ganar(0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 4, 3.5f, 4, 5));  
        System.out.println("Salario: " + Calcular_salario(40, 10, 5, 10000));  
        System.out.println("Área triángulo: " + Calcular_area_triangulo(5, 10));  
        System.out.println("Perímetro cuadrado: " + Calcular_perimetro_cuadrado(5));  
        System.out.println("Volumen cilindro: " + Calcular_volumen_cilindro(3, 5));  
        System.out.println("Área círculo: " + Calcular_area_circulo(3)); 
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int base_din, int total_recaudos, int total_retiros) {
        final int base_final = 2000000;
        if (base_din != base_final) {
            return -1;
        }
        return base_din + total_recaudos - total_retiros;
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float consumo) {
        if (consumo <= 0) {
            return "Error calculando consumo";
        }
        
        float propina = consumo * 0.10f;
        float impuesto = consumo * 0.08f;
        float total = consumo + propina + impuesto;
        
        return String.format("valor comida: $%.2f - valor propina: $%.2f - valor impoconsumo: $%.2f - total a pagar: $%.2f",
                consumo, propina, impuesto, total);
    }
    

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int partido_gan, int partido_perd, int partido_emp) {
        final int min_partidos = 0;
        final byte ptsxganar = 3;
        final byte ptsxempatar = 1;

        if (partido_gan < min_partidos || partido_perd < min_partidos || partido_emp < min_partidos) {
            return -1;
        }
        return partido_gan * ptsxganar + partido_emp * ptsxempatar;
    }
    

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
      public static float Calcular_definitiva(float nota1, float nota2, float nota3, 
     float nota4, float nota5, 
     float porcentaje1, float porcentaje2, 
     float porcentaje3, float porcentaje4, 
     float porcentaje5) 
     {
        final byte notamin = 0;
        final byte notamax = 5;

        if (nota1 < notamin || nota1 > notamax || 
            nota2 < notamin || nota2 > notamax || 
            nota3 < notamin || nota3 > notamax || 
            nota4 < notamin || nota4 > notamax || 
            nota5 < notamin || nota5 > notamax) {
            return -1;
        }

        if (porcentaje1 < 0 || porcentaje1 > 1 || 
            porcentaje2 < 0 || porcentaje2 > 1 || 
            porcentaje3 < 0 || porcentaje3 > 1 || 
            porcentaje4 < 0 || porcentaje4 > 1 || 
            porcentaje5 < 0 || porcentaje5 > 1) {
            return -1;
        }

        float sumaPorcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;
        if (sumaPorcentajes != 1) {
            return -1;
        }

        return nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + 
               nota4 * porcentaje4 + nota5 * porcentaje5; 
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float porcentaje1, float porcentaje2, float porcentaje3, 
     float porcentaje4, float porcentaje5, 
     float nota1, float nota2, float nota3, 
     float nota4) {
        final float nota_minima = 3.0f;

        if (porcentaje1 < 0 || porcentaje1 > 1 || 
            porcentaje2 < 0 || porcentaje2 > 1 || 
            porcentaje3 < 0 || porcentaje3 > 1 || 
            porcentaje4 < 0 || porcentaje4 > 1 || 
            porcentaje5 < 0 || porcentaje5 > 1) {
            return -1;
        }

        float sumaPorcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;
        if (sumaPorcentajes != 1) {
            return -1;
        }

        float totalNotas = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4;
        float notaNecesaria = (nota_minima - totalNotas) / porcentaje5;

        return notaNecesaria < 0 || notaNecesaria > 5 ? -1 : notaNecesaria;
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_salario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, float valorHoraNormal) {
        if (valorHoraNormal <= 0) {
            return -1;
        }
        float salarioNormal = horasNormales * valorHoraNormal;
        float salarioExtraDiurno = horasExtrasDiurnas * valorHoraNormal * 1.15f;
        float salarioExtraNocturno = horasExtrasNocturnas * valorHoraNormal * 1.35f;
        return salarioNormal + salarioExtraDiurno + salarioExtraNocturno;
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_area_triangulo(float base, float altura) {
        if (base <= 0 || altura <= 0) {
            return -1;
        }
        return 0.5f * base * altura;
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado) {
        if (lado <= 0) {
            return -1;
        }
        return lado * 4;
    }


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float radio, float altura) {
        if (radio <= 0 || altura <= 0) {
            return -1;
        }
        
        float pi = 3.1415927f;
        return pi * (radio * radio) * altura;
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio) {
        if (radio <= 0) {
            return -1;
        }
        
        float pi = 3.1415927f;
        return pi * (radio * radio);
    }



}
