package app;

import model.*;
import shapeInterface.*;
import editor.*;

public class Startup
{
	public static void main(String args[])
    {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Square square = new Square();

        GraphicEditor editor=new GraphicEditor();
        editor.DrawShape(circle);
        editor.DrawShape(rect);
        editor.DrawShape(square);
    }
}
