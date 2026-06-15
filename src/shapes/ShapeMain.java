// Enter code here
package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total collection count
        int totalShapes = scanner.nextInt();
        Shape[] shapeCollection = new Shape[totalShapes];

        // Parse input tokens sequentially
        for (int i = 0; i < totalShapes; i++) {
            String shapeType = scanner.next();
            String itemColor = scanner.next();
            boolean itemFilled = scanner.nextBoolean();

            if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                double w = scanner.nextDouble();
                double l = scanner.nextDouble();
                shapeCollection[i] = new Rectangle(itemColor, itemFilled, w, l);
            } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
                double r = scanner.nextDouble();
                shapeCollection[i] = new Circle(itemColor, itemFilled, r);
            }
        }

        // Output complete textual representations
        for (Shape currentShape : shapeCollection) {
            System.out.println(currentShape + "\n");
        }

        // Perform programmatic Downcast verification
        System.out.println("--- Downcast Check ---");
        for (Shape currentShape : shapeCollection) {
            if (currentShape instanceof Rectangle) {
                Rectangle rectObj = (Rectangle) currentShape;
                System.out.println("Rectangle width=" + rectObj.getWidth() + " length=" + rectObj.getLength());
            } else if (currentShape instanceof Circle) {
                Circle circObj = (Circle) currentShape;
                System.out.println("Circle radius=" + circObj.getRadius());
            }
        }

        // ANSWER: error: Shape is abstract; cannot be instantiated

        scanner.close();
    }
}
