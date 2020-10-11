/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadrosConFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ramses
 */
public class CuadroFiguras extends JPanel{
    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    
    public CuadroFiguras()
    {
 // inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(600, 700);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    
    
    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
 
        //color al rectancgulo que contiene las figuras
          g.setColor(Color.BLACK);
          //dimensiones y coordenadas del cuadrado
        g.drawRoundRect(50 ,50 ,650 ,400 ,35 ,35 );
        
        //creacion de rectangulos interiores
        //Tres rectangulos superiores
        g.drawRect(75,75 , 166, 150);
        g.drawRect(291,75 , 166, 150);
        g.drawRect(507,75 , 166, 150);
        
        //Tres rectangulos inferiores        
        g.drawRect(75,250 , 166, 150);
        g.drawRect(291,250 , 166, 150);
        g.drawRect(507,250 , 166, 150);
        
        //Primer dibujo  casa
        //dibujando el rectangulo principal
         g.setColor(Color.red);
        g.drawLine(100, 125, 200, 125);
        g.drawLine(200, 125, 200, 175);
        g.drawLine(100, 125, 100, 175);
        g.drawLine(100, 175, 200, 175);
        //dibujando puerta y sombra
        g.drawLine(125, 175, 125,145);
        g.drawLine(150, 175, 150,145);
        g.drawLine(150, 145, 125,145);
        
        g.drawLine(125, 175, 95,195);
        g.drawLine(150, 175, 125,195);
        
        //dibujando techo
       g.drawLine(100, 125, 150, 105);
       g.drawLine(200, 125, 150, 105);
       
       //agregando texto
       g.drawString("Dibujando Líneas",135 ,210);
        
       
       
       
       //Segundo dibujo
       
       //Dibujando rectangulos
       g.drawRect(305, 150, 15, 35);
       g.drawRect(335, 135, 15, 50);
       g.drawRect(365, 120, 15, 65);
       g.drawRect(395, 105, 15, 80);
       g.drawRect(425, 90, 15, 95);
       
       //Agregando texto
       g.drawString("Dibujando Rectangulos", 305, 205);
       
        
       
       
       //Tercer dibujo
       
       //Dibujando óvalos con rectangulos
       g.drawRoundRect(525,130 ,130 ,30 ,95 ,55 );
       g.drawRoundRect(575,95 ,25 ,100 ,205 ,205 );
       g.drawRoundRect(555,115 ,65 ,30 ,95 ,55 );
       
       
       //Agregando texto
       g.setFont(new Font("Times New Roman",Font.PLAIN,11 ));
       g.drawString("Dibujando óvalos con Rectangulos ", 515, 205);
       
       
       //Cuarto dibujo
       
       //Dibujando circulos 
       g.drawOval(105, 265, 100, 100);
       g.drawOval(135, 295, 15, 15);
       g.drawOval(165, 295, 15, 15);
       g.fillOval(139, 299, 7, 7);
       g.fillOval(169, 299, 7, 7);
       g.drawOval(145, 318, 25, 25);
       
       //Agregando texto
       g.setFont(new Font("Times New Roman",Font.PLAIN,15 ));
       g.drawString("Dibujando con Circulos ", 102, 385);
       
       
       
        //Quinto dibujo
        
        //Dibujando óvalos con circulos
        g.drawOval(305, 290, 135, 35);
        g.drawOval(360, 260, 25, 100);
        g.drawOval(335, 275, 75, 35);
        
       //Agregando texto
       g.setFont(new Font("Times New Roman",Font.PLAIN,12 ));
       g.drawString("Dibujando óvalos con circulos ", 305, 385);
       
       
       //Sexto dibujo
       
       //Dibujando triangulos
       g.drawLine(545, 335,605 ,305 );
       g.drawLine(605, 305,655 ,335 );
       g.drawLine(545, 335,655 ,335 );
       
       g.drawLine(605, 305,605 ,285 );
       g.drawLine(605, 305,655 ,305 );
       g.drawLine(655, 305,605 ,285 );
       
       
       g.drawLine(535,315 ,535 , 275);
       g.drawLine(565,315 ,535 , 315);
       g.drawLine(565,315 ,535 , 275);
       
        //Agregando texto
       g.setFont(new Font("Times New Roman",Font.PLAIN,15 ));
       g.drawString("Dibujando Triangulos ", 525, 385);
       
        
        

}
}
