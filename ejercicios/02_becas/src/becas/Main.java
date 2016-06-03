/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becas;

import java.util.ArrayList;

/**
 *
 * @author kiriost
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Becario> becarios = new ArrayList();
        
        Beca fotocopias = new BecaFotocopias(250);
        BecaTransporte  transporte = new BecaTransporte();
        BecaBuffet buffetAlmuerzo = new BecaBuffet();
        BecaBuffet buffetCena = new BecaBuffet(false, 15);
        
        Becario juan = new Becario(buffetCena, "Juan");
        Becario pedro = new Becario(transporte, "Pedro");
        Becario gabriel = new Becario(buffetAlmuerzo, "Gabriel");
        Becario jaime = new Becario(buffetCena, "Jaime");
        Becario fulano = new Becario(fotocopias, "Fulano");
        Becario mengana = new Becario(new BecaTransporte(60, 7.8f), "Mengana");
        
        becarios.add(juan);
        becarios.add(pedro);
        becarios.add(gabriel);
        becarios.add(jaime);
        becarios.add(fulano);
        becarios.add(mengana);
        
        // Busca a Juan e imprime el tipo de Beca que posse
        System.out.println("BUSCO A JUAN");
        for (int i = 0; i < becarios.size(); i++) {
            Becario becario = becarios.get(i);
            String nombre = becario.getNombre();
            if(nombre.equals("Juan")) {
                String tipoBeca = becario.getTipo();
                System.out.println("Juan tiene una beca de " + tipoBeca);
            }
        }
        System.out.println("");
        
        /**
         * ¿Cómo podría imprimir todos los becarios que poseo en mi "base de
         * datos" y los datos de la beca que posee cada uno?
         * Intenta realizarlo sólo. De todas formas acá va una forma de hacerlo.
         * Tener en cuenta que Beca es un tipo de dato que viene de la clase
         * padre, si yo quisiera convertir una Beca a algo más concreto (hijo),
         * debería utilizar casting: (BecaFotocopias) beca; por ejemplo.
         */
        System.out.println("IMPRIMIR DATOS");
        for (int i = 0; i < becarios.size(); i++) {
            Becario becario = becarios.get(i); // Obtengo cada becario
            
            /**
             * Observar que se imprime con "print()", no con "println()". Es
             * decir, esto imprime el texto pero no coloca un "enter" o salto
             * de línea.
             */
            System.out.print("El becario " + becario.getNombre() + " tiene "
                    + "una beca del tipo ");
            /**
             * Obtengo su beca, me devuelve un tipo de dato Beca (padre)
             */
            Beca beca = becario.getBeca();
            String tipoBeca = beca.getTipo();
            
            /**
             * Imprimo el tipo de beca que posee. Observar que el String que me
             * representa el tipo de beca es convertido todo a mayúsuclas:
             * tipoBeca.toUpperCase() (método que me permite esto)
             */
            System.out.println(tipoBeca.toUpperCase() + ":");
            
            if(tipoBeca.equals("beca_almuerzo") || tipoBeca.equals("beca_cena")) {
                /**
                 * Esto es importante: beca del tipo Beca no tiene acceso a
                 * métodos propios de BecaBuffet, pero yo necesito llamar a
                 * estos métodos específicos para imprimir cuántos platos de
                 * comida tiene por día, por ejemplo.
                 * Realizo un "casting", convirtiendo objeto padre al hijo, más
                 * específico: Beca --> BecaBuffet.
                 */
                BecaBuffet becaBuffet = (BecaBuffet) beca;
                
                // Ahora puedo usar el objeto convertido en BecaBuffet
                System.out.println(" - Cant de platos: " + becaBuffet.getCantPlatos());
                if(becaBuffet.isAlmuerzo())
                    System.out.println(" - De almuerzo");
                else
                    System.out.println(" - De cena");
            }
            else if(tipoBeca.equals("fotocopias")) {
                /**
                 * Igual que en el if de arriba, necesito convertir mi tipo de
                 * dato menos específico, al cual le faltan los métodos que
                 * agregan los hijos, a un tipo de dato más específico.
                 * Como quiero imprimir los datos de la beca de fotocopias,
                 * convierto a BecaFotocopias
                 */
                BecaFotocopias becaFotocopia = (BecaFotocopias) beca;
                System.out.println(" - Monto: " + becaFotocopia.getMonto());
            }
            else if(tipoBeca.equals("transporte")) {
                BecaTransporte becaTransporte = (BecaTransporte) beca;
                System.out.println(" - Costo de pasaje: " + becaTransporte.getCostoPasaje());
                System.out.println(" - Cant de viajes: " + becaTransporte.getCantidadPasajes());
                
                // El monto total de acuerdo a la cant de viajes y costo de un pasaje
                float montoTotal = (becaTransporte.getCantidadPasajes() * becaTransporte.getCostoPasaje());
                System.out.println(" - Monto total: " + montoTotal);
            }
            else {
                /**
                 * Siempre es necesario pensar en posibles errores en nuestra
                 * aplicación, y no dejar esos errores o excepciones al azar.
                 */
                System.out.println("No se reconoce el tipo de beca");
            }
        }
    }
    
}
