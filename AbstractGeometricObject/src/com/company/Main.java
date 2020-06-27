package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? "
                + equalArea(geoObject1, geoObject2));

        // Pokazivanje kruga
        displayGeometricObject(geoObject1);

        // Pokazivanje pravougaonika
        displayGeometricObject(geoObject2);
    }

    /**
     * Metod za upoređenje površina dva geometrijska oblika
     */
    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * Metod za pikazivanje gometrijskog oblika
     */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
    }

