package tipos_datos;

import java.util.Date;

public class Datos {

    public static void main(String[] args) {
        // Un boolean puede tener solo dos valores:
        // Verdadero ó falso; 0 ó 1; Sí ó no.
        System.out.println("-- Boolean");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (10 > 2);
        boolean and = b1 && b2;
        boolean or = b1 || b2;

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
        System.out.println("b1 and b2: " + b3);
        System.out.println("b1 or b2: " + b3);

        // Byte: tipo de dato entero más pequeño
        // Usa 8 bits. Si tiene signo puede tomar valores de –128 a 127.
        // Usado para trabajar leyendo archivos binarios. Valores enteros.
        System.out.println("-- Byte");

        byte by1 = 100;
        byte by2 = 20;

        System.out.println("by1: " + by1);
        System.out.println("by2: " + by2);
        System.out.println("by1 + by2: " + (by1 + by2));

        // Char: tipo de 16 bit usado para representar caracteres ASCII y
        // Unicode. Valores desde 0 hasta 65,536.
        System.out.println("-- Char");

        char ch1 = 'a';
        char ch2 = 65; // ASCII code of 'A'

        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);

        // Int: tipo de 32 bit con signo. Toma valores desde –2,147,483,648
        // a 2,147,483,647. Tipo más comúnmente usado. Valores enteros.
        System.out.println("-- Int");

        int i = 0;
        int j = 100;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("i + j:" + (i + j));

        // Short: tipo de 16 bits con signo. Valores desde –32,768 a 32,767.
        System.out.println("-- Short");

        short s1 = 50;
        short s2 = 42;

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);

        // Long: tipo de 64 bits con signo. Valores enteros.
        System.out.println("-- Long");
        
        long timeInMilliseconds = new Date().getTime();
        System.out.println("Tiempo en milisegundos: " + timeInMilliseconds);

        // Float: tipo de 32 bit de precición simple. Valores reales.
        System.out.println("-- Float");
        
        float f = 10.4f;
        System.out.println("f:" + f);

        // Double: tipo de 64 bit con doble precision. Valores reales.
        System.out.println("-- Double");
        
        double d = 1232.44;
        System.out.println("d:" + d);

    }

}
