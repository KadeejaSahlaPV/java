import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class RectangleApplet extends Applet {

    private int x, y, width, height;
    private Color color;

    @Override
    public void init() {
        // Get parameters from the HTML file
        String xParam = getParameter("x");
        String yParam = getParameter("y");
        String widthParam = getParameter("width");
        String heightParam = getParameter("height");
        String colorParam = getParameter("color");

        // Parse parameters
        x = Integer.parseInt(xParam);
        y = Integer.parseInt(yParam);
        width = Integer.parseInt(widthParam);
        height = Integer.parseInt(heightParam);
        color = Color.decode(colorParam);
    }

    @Override
    public void paint(Graphics g) {
        // Set the color
        g.setColor(color);

        // Draw the rectangle
        g.fillRect(x, y, width, height);
    }
}


<!DOCTYPE html>
<html>
<head>
    <title>Rectangle Applet Example</title>
</head>
<body>
    <applet code="RectangleApplet.class" width="400" height="300">
        <param name="x" value="50">
        <param name="y" value="50">
        <param name="width" value="200">
        <param name="height" value="100">
        <param name="color" value="#FF0000"> <!-- Color in hexadecimal format -->
    </applet>
</body>
</html>
