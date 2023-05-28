package task2_10;

public class Box {
    private int length;
    private int width;
    private int height;
    private String typeBox;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //конструктор для задания 10
    Box(String input) {
        String[] values = input.substring(input.indexOf('[') + 1, input.indexOf(']')).split(",");
        if (values.length >= 1) {
            this.length = Integer.parseInt(values[0]);
        }
        if (values.length >= 2) {
            this.width = Integer.parseInt(values[1]);
        }
        if (values.length >= 3) {
            this.height = Integer.parseInt(values[2]);
        }
    }

    public String identifyBoxType(Box box) {
        if (box.width == box.height && box.width == box.length) {
            box.typeBox = "Куб";
        } else if ((box.width != 0 && box.length != 0 && box.height == 0) ||
                (box.height != 0 && box.length != 0 && box.width == 0) ||
                (box.width != 0 && box.height != 0 && box.length == 0)) {
            box.typeBox = "Конверт";
        } else if (box.width != 0 && box.length != 0 && box.height != 0) {
            box.typeBox = "Обычная коробка";
        } else {
            System.out.println("Такой коробки нет");
            box.typeBox = null;
        }
        return box.typeBox;
    }
}
