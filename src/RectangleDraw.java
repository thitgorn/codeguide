
/// <summary>
/// Class draws a rectangle on a windows form object.
/// </summary>
public class RectangleDraw {
	public void Draw(Form form, RectangleShape rectangleShape) {
		SolidBrush myBrush = new SolidBrush(System.Drawing.Color.Red);
		Graphics formGraphics = form.CreateGraphics();
		formGraphics.FillRectangle(myBrush, new Rectangle(0, 0, rectangleShape.Width, rectangleShape.Height));
	}
}

/// Class calculates the rectangle's area.
/// </summary>
public class RectangleShape {
	public int Height
	{ get; set; }
	public int Width
	{ get; set; }

	public int Area() {
		return Width * Height;
	}
}

/// <summary>
/// Consumes the RectangleShape */
/// </summary>
public class GeometricsCalculator {
	public void CalculateArea(RectangleShape rectangleShape) {
		int area = rectangleShape.Area();
	}
}

/// <summary>
/// Consumes the RectangleDraw and RectangleShape */
/// </summary>
public class GraphicsManager {
	public Form form
	{ get; set; }

	public void DrawOnScreen(RectangleDraw rectangleDraw, RectangleShape rectangleShape) {
		rectangleDraw.Draw(form, rectangleShape);
	}
}