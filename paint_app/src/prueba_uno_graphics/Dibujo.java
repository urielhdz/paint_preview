/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_uno_graphics;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Stack;


/**
 *
 * @author Uriel
 */
public class Dibujo extends Canvas implements ActionListener, MouseListener, MouseMotionListener{
    private ArrayList rectangles  = new ArrayList();
    private ArrayList circles  = new ArrayList();
    private ArrayList lineas  = new ArrayList();
    public Color color;
    private Stack<String> undo =new Stack<>();
    private Stack<ArrayList> redo =new Stack<>();
    public int strk_width;
    private Path2D shape;
    Image img;
    public boolean m_alzada= false, rectangle=false,circle=false,d_image=false;
    private int uX,uY,x,y;
    Dibujo()
    {
        this.color = Color.BLACK;
        this.setBackground(Color.white);
        this.shape = new Path2D.Float();
        this.strk_width = 5;
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Graphics2D draw = (Graphics2D) g;
        draw.setColor(Color.white);
        
        draw.fillRect(0, 0, this.getWidth(), this.getHeight());
        /* Dibujar todas las figuras */
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        /* Agregar nuevo punto al shape */
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /* Agregar las figuras a los correspondientes arraylisy y a la pila para deshacer */
    }

    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {
        /* Dibujar preview de las figuras y el shape */

    }
    private ArrayList addItem(int v1,int v2,int v3,int v4)
    {
       /* Funcion para agregar nuevos items */
        ArrayList ayuda = new ArrayList();
        return ayuda;
    }
    public void changeColor(Color clr)
    {
        
        /* Funcionalidad al cambio de color */
        
    }
    public void undo(){
        /* Funcionalidad para deshacer */
    }
    public void redo(){
        /* Funcionalidad para rehacer */
    }
    public void erase()
    {
        /* Método para borrar todo */
    }
    public void setImg(Image imagen){
        /* Definir la imagen a dibujar */
    }
    public void changeStrk(int v)
    {
        /* Cambiar el tamaño del stroke y agregamos un shape a su  ArrayList */
    }
    public boolean isnt_empty()
    {
        if(this.lineas.size() > 0 || this.rectangles.size() > 0 || this.circles.size() > 0)
            return true;
        else
            return false;
    }
    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
