package task4;

public class Car {
    private Color color;
    private Mark mark;

    public Car(Color color, Mark mark) {
        this.color = color;
        this.mark = mark;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //setter color by String
    public void setColor(String color){
        for (Color colorElement : Color.values()) {
            if (colorElement.toString().equalsIgnoreCase(color)){
                this.color = colorElement;
            }
        }
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
    //Method for change color
    public void changeColor(Car car, String newColor){
            if (car.mark == Mark.KIA && car.color.toString().equalsIgnoreCase(newColor) == false &&
                    (newColor.equalsIgnoreCase(Color.YELLOW.toString()) ||
                    (newColor.equalsIgnoreCase(Color.GREY.toString())) ||
                    (newColor.equalsIgnoreCase(Color.WHITE.toString())))) {
                car.setColor(newColor);
            }
            if (car.mark == Mark.BMW && car.color.toString().equalsIgnoreCase(newColor) == false &&
                    (newColor.equalsIgnoreCase(Color.ORANGE.toString()) ||
                    (newColor.equalsIgnoreCase(Color.BLACK.toString())) ||
                    (newColor.equalsIgnoreCase(Color.PURPLE.toString())))) {
                car.setColor(newColor);
            }
            if (car.mark == Mark.AUDI && car.color.toString().equalsIgnoreCase(newColor) == false &&
                    (newColor.equalsIgnoreCase(Color.BLUE.toString()) ||
                    (newColor.equalsIgnoreCase(Color.GREEN.toString())) ||
                    (newColor.equalsIgnoreCase(Color.RED.toString())))) {
                car.setColor(newColor);
            }
    }
}
