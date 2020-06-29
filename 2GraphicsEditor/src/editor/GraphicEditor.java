package editor;

import shapeInterface.*;

public class GraphicEditor
{
    public void DrawShape(IShape shape)
    {
        System.out.println(shape.Drow());
    }
}