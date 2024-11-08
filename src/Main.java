public class Main {
    public static void main(String[] args) {
        // Создаем объекты через метод createObject
        Printable objectA = createObject("ChildClass2");
        Printable objectB = createObject("ChildClass3");
        Printable objectC = createObject("ChildClass4");

        // Добавляем объекты в массив
        Printable[] objects = {objectA, objectB, objectC};

        // Вызываем метод print() для каждого объекта в массиве
        for (Printable obj : objects) {
            obj.print();
        }
    }

    // Метод createObject для создания объектов дочерних классов
    public static Printable createObject(String className) {
        switch (className) {
            case "ChildClass2":
                return new ChildClass2(1, "John Doe");
            case "ChildClass3":
                return new ChildClass3(2, 5000.0);
            case "ChildClass4":
                return new ChildClass4(3, "Sales");
            default:
                return null;
        }
    }
}
