public class Sphere {

double diameter;


Sphere(double d) {
diameter = d;
}
// gettr method
double getDiameter() {
return diameter;
}
// for volume and radius
// Volume: 4/3 Pi * R3
double getVolume() {
double radius = diameter / 2.0;
double volume = 4/3* Math.PI * radius * radius * radius;
return volume;
}

double getSurface() {
double radius = diameter / 2.0;
double surface = 4.0 * Math.PI * radius * radius;
return surface;
}

// main method
public static void main(String[] arg) {

Sphere sphere1 = new Sphere(1.0);
Sphere sphere2 = new Sphere(2.0);
// surface and volume
System.out.println("Sphere 1: Diameter: " + sphere1.getDiameter() + " Surface: " + sphere1.getSurface() + " Volume: " + sphere1.getVolume());
System.out.println("Sphere 2: Diameter: " + sphere2.getDiameter() + " Surface: " + sphere2.getSurface() + " Volume: " + sphere2.getVolume());
}
}
