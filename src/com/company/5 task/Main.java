package com.company;

public class Main {

    public static void main(String[] args) {
        Annotation[] annotations = new Annotation[]{
                new Annotation(new Circle(100, 100, 10), "Tree"),
                new Annotation(new Rectangle(100, 100, 150, 200), "Car")
        };

        AnnotatedImage image = new AnnotatedImage(" ", annotations);

        for (Annotation annotation : image.getAnnotations()) {
            System.out.println(annotation);
        }
        Annotation findLabel = image.findByLabel("River");
        Annotation findPoint = image.findByPoint(250, 120);
        System.out.println(findLabel);
        System.out.println(findPoint);
        for (Annotation annotation : image.getAnnotations()) {
            annotation.getFigure().move(100, 100);
            System.out.println(annotation);
        }
    }
}
