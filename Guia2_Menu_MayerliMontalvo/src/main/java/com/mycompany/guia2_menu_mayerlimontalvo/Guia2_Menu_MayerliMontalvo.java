/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2_menu_mayerlimontalvo;



/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;

public class Guia2_Menu_MayerliMontalvo {

    public static void main(String[] args) {
        int opcion;
        String menu;
        do{
            menu=JOptionPane.showInputDialog( 
                "Bienvenido al programa de la segunda Guía: \n" +
                "\n 1- Calcular el área y volumen de una circunferencia - Ejercicio 1" +
                "\n 2- Calcular los descuentos de un trabajador - Ejercicio 2" +
                "\n 3- Calcular el monto de compra, el monto de descuento y el número de unidades de obsequio - Ejercicio 3" +
                "\n 4- Posiciones de las letras en el alfabeto  - Ejercicio 4" +
                "\n 5- Salir"+
                "\n Seleccione una opcion"
            );
            opcion= Integer.parseInt(menu);
            
            switch(opcion){ 
            
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion 1 ");
                    //Definiendo constante pi
                    final double Pi= 3.1415926535;
                    double radio;
                    String radioString;
                    // Variables de area y volumen
                    double area;
                    double volumen;
                    
                    radioString= JOptionPane.showInputDialog("-Ingrese el valor del radio de la circunferencia: ");
                    
                    //parciando la variable radio
                    radio= Double.parseDouble(radioString);
                    
                    //Realizando operaciones
                    //Area
                    area= Pi*radio*radio;
                    //Volumen
                    volumen= (4.0/3.0)*Pi*radio*radio*radio;
                    //Mostrando los resultados al usuario
                    JOptionPane.showMessageDialog(null, "Los resultados del radio "+ radio+" son los siguientes: "+
                            "\n Area= "+area+"m²"+
                            "\n Volumen= "+ volumen+"m³");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion 2 ");
                    //Definiendo variables
                    String nombre;
                    //variables de sueldo
                    double sueldo;
                    String sueldoString;
                    //Variables de genero
                    String opcionGMenu;
                    int genero;
                    
                    //variables de las operaciones
                    double descuentoAFP=0;
                    double descuentoISSS;
                    double descuentoRenta=0;
                    double descuentoTotal;
                    double sueldoRestante;
                    
                    //Ingresando el nombre
                    nombre=JOptionPane.showInputDialog("-Ingrese el nombre: ");
                    
                    //Ingresesando el sueldo
                    sueldoString=JOptionPane.showInputDialog("-Ingrese el sueldo: ");
                    //Parciando sueldo
                    sueldo=Double.parseDouble(sueldoString);
                    
                    //Menu para seleccionar el genero
                    opcionGMenu=JOptionPane.showInputDialog( 
                    "- Ingrese la opcion de su genero: " +
                    "\n 1- Hombre"+
                    "\n 2- Mujer"
                     );
                    genero= Integer.parseInt(opcionGMenu);
                    switch (genero){
                        case 1:
                            //Hombre
                            //Descuento 
                            if (sueldo > 300.0){
                                descuentoAFP= sueldo*0.0625;
                                
                            }
                            descuentoISSS= sueldo*0.03;
                            descuentoRenta= sueldo*0.1;
                            descuentoTotal= descuentoAFP+ descuentoISSS+descuentoRenta;
                            //Salario restante 
                            sueldoRestante= sueldo- descuentoTotal;
                            
                            
                            JOptionPane.showMessageDialog(null, "Para el trabajador "+ nombre+" con un sueldo de $"+sueldo+ " sus descuentos son los siguientes: "+
                                    "\n- Descuento de AFP: $"+ descuentoAFP+
                                    "\n- Descuento ISSS: $"+ descuentoISSS+
                                    "\n- Descuento de Renta: $"+ descuentoRenta+
                                    "\n- Descuento Total: $"+ descuentoTotal+
                                    "\n- Salario Restante: $"+ sueldoRestante
                            );
                            
                            break;
                        case 2:
                             //Mujer
                            //Descuento 
                            if (sueldo > 300.0){
                                descuentoAFP= sueldo*0.0625;
                                
                            }
                            descuentoISSS= sueldo*0.02;
                            
                            descuentoTotal= descuentoAFP + descuentoISSS + descuentoRenta;
                            //Salario restante 
                            sueldoRestante= sueldo- descuentoTotal;
                            
                            
                            JOptionPane.showMessageDialog(null, "Para la trabajadora "+ nombre+" con un sueldo de $"+sueldo+ " sus descuentos son los siguientes: "+
                                    "\n- Descuento de AFP: $"+ descuentoAFP+
                                    "\n- Descuento ISSS: $"+ descuentoISSS+
                                    "\n- Descuento de Renta: $"+ descuentoRenta+
                                    "\n- Descuento Total: $"+ descuentoTotal+
                                    "\n- Salario Restante: $"+ sueldoRestante
                            );
                            
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                            
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opcion 3 ");
                    
                    StringBuilder resultadosResumen = new StringBuilder();
                            
                    for(int cliente=1; cliente<=10; cliente++){
                        //Definiendo variable
                        //Precio de la docena  a la que se aplican los descuentos
                        double precioDocena=0;
                        String precioString;
                        //variable de cantidad
                        int cantidad=0;
                        String cantidadDocena;
                        //Variable de unidades obsequiadas
                        int unidadesObsequio=0;
                        //Monto de compra
                        double monto=0;
                        //monto de de descuentos
                        //Descuento de 10%
                        double monto1= 0.1;
                        //Descuento de 15%
                        double monto2=0.15;
                        //Descuento de la cantidad
                        double montoDescuento=0;
                        
                        //Ingresar el precio de la docena del producto deseado
                        precioString=JOptionPane.showInputDialog("-Ingrese el precio sin descuentos de la docena del producto a comprar: ");
                        //Parceo del precio
                        precioDocena= Double.parseDouble(precioString);
                        
                        //Ingresar la cantidad de docenas a comprar
                        cantidadDocena= JOptionPane.showInputDialog("-Ingrese la cantidad de docenas a comprar de dicho producto: ");
                        //Parceo de cantidad
                        cantidad=Integer.parseInt(cantidadDocena);
                        
                        resultadosResumen.append("cliente").append(cliente).append(":\n");
                        
                        //Operaciones
                        if(cantidad< 3){
                            //Aplicar descuento de 10%, 0.1
                            resultadosResumen.append("Monto de descuento: $").append( montoDescuento= precioDocena * cantidad * monto1).append("\n");
                            resultadosResumen.append("Monto: $").append(monto= precioDocena*cantidad - montoDescuento).append("\n");
                            resultadosResumen.append("Unidades obsequio:").append( unidadesObsequio).append("\n");
                            JOptionPane.showMessageDialog(null,"Para la cantidad de "+ cantidad+" docenas"+" y un precio por docena de $"+precioDocena+" los resultados son los siguientes:"
                                    + "\n- Monto de la compra: "+monto
                                    +"\n- Monto de descuento: "+montoDescuento
                                    
                            );
                            if(cantidad ==3){
                                 //Aplicar descuento de 15%, 0.15
                                resultadosResumen.append("Monto de descuento: $").append(montoDescuento= precioDocena * cantidad * monto2).append("\n");
                                resultadosResumen.append("Monto: $").append(monto= precioDocena*cantidad - montoDescuento).append("\n");
                                resultadosResumen.append("Unidades obsequio:").append(unidadesObsequio).append("\n");
                                JOptionPane.showMessageDialog(null,"Para la cantidad de "+ cantidad+" docenas"+" y un precio por docena de $"+precioDocena+" los resultados son los siguientes:"
                                    + "\n- Monto de la compra: "+monto
                                    +"\n- Monto de descuento: "+montoDescuento
                                    
                                );
                            }
                          
                        }
                        else{
                            //Aplicar descuento de 15%, 0.15
                                resultadosResumen.append("Monto de descuento: $").append(montoDescuento= precioDocena * cantidad * monto2).append("\n");
                                resultadosResumen.append("Monto: $").append(monto= precioDocena*cantidad - montoDescuento).append("\n");
                                resultadosResumen.append("Unidades obsequio:").append(unidadesObsequio= cantidad -3).append("\n");
                                
                                JOptionPane.showMessageDialog(null,"Para la cantidad de "+ cantidad+" docenas"+" y un precio por docena de $"+precioDocena+" los resultados son los siguientes:"
                                    + "\n- Monto de la compra: "+monto
                                    +"\n- Monto de descuento: "+montoDescuento
                                    +"\n- Unidades Obsequio: "+unidadesObsequio
                                    
                                );
                                
                        }
                        
                    }
                    JOptionPane.showMessageDialog(null, "Los resultados del dia es: \n\n"+ resultadosResumen);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Opcion 4 ");
                    StringBuilder resultado = new StringBuilder();
                    String usuario;
                    char alfabeto[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
                    usuario=JOptionPane.showInputDialog("NOTA: ingresar solo minusculas \n"+"-Ingrese su nombre: ");
                    for (int i=0; i< usuario.length(); i++){
                        char letra= usuario.charAt(i);
                        int posicion=-1;
                        for (int j=0; j< alfabeto.length; j++){
                            if(letra==alfabeto[j]){
                                posicion=j+1;
                                break;
                            }
                        }
                        resultado.append(letra).append(" Posicion ").append(posicion).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultado.toString());
                        
                    
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa ... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while(opcion != 5);
    }
}
