package lesson_1.task_2;

/*
Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює,
то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
 */
public class Car implements Comparable <Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car o) {    // public int compareTo(Car o) {
        int temp = this.speed - o.speed;   // int temp = this.speed - o.speed;
        /*if (temp == 0) {
            return this.price - ((Car)o).price;
        } else {
            return temp;
        }*/
        if (temp == 0) {
            int priceComparison = this.price - o.price;
            if (priceComparison == 0) {
                int modelComparison = this.model.compareTo(o.model);
                if (modelComparison == 0) {
                    return this.color.compareTo(o.color);
                } else {
                    return modelComparison;
                }
            } else {
                return priceComparison;
            }
        } else {
            return temp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}
