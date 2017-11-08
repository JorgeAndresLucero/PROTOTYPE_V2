/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prootipo;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jorge Andrés
 */
public class Humano {
    int x,x1,x2,x3;
    
    int y,y1;
    JPanel MiHum;
    Main m = new Main();
    Humano(JPanel MiH){
        this.x=0;
        this.y=0;
        
        this.MiHum=MiH;
       
        
    }
   
        
    public void dibujar_Humano(Graphics g,int xi,int yi,String Direccion){
        this.x=xi;
        this.y=yi;
        this.MiHum.update(g);
        
        
        
      
          ImageIcon MiImagen = new ImageIcon(Direccion);
  if(m.numero ==1){
      g.drawImage(MiImagen.getImage(), xi, yi, MiHum);
      
  }
  else{
        if( m.numero == 2){
        g.drawImage(MiImagen.getImage(), xi, yi, MiHum);
       g.drawImage(MiImagen.getImage(), 100,0 , MiHum);
    
        } else {
            if(m.numero == 3){
       g.drawImage(MiImagen.getImage(), xi, yi, MiHum);
       g.drawImage(MiImagen.getImage(), 100,0 , MiHum); 
       g.drawImage(MiImagen.getImage(), 200,0 , MiHum); 
            }
            else {
                if(m.numero == 4){
       g.drawImage(MiImagen.getImage(), xi, yi, MiHum);
       g.drawImage(MiImagen.getImage(), 100,0 , MiHum); 
       g.drawImage(MiImagen.getImage(), 200,0 , MiHum);
       g.drawImage(MiImagen.getImage(), 300,0 , MiHum);
                }
                else{
                    if(m.numero==5){
       g.drawImage(MiImagen.getImage(), xi+30, yi, MiHum);
       g.drawImage(MiImagen.getImage(), 100,0 , MiHum); 
       g.drawImage(MiImagen.getImage(), 200,0 , MiHum);
       g.drawImage(MiImagen.getImage(), 300,0 , MiHum);
       g.drawImage(MiImagen.getImage(), 400,0 , MiHum);
     
                    }
                }
                
            }
        }
      
    }
    }
    
    public int CoordX(){
        return this.x;
        
    }
    
     public int CoordY(){
        return this.y;
        
    }
    
}
