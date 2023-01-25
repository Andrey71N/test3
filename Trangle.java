public class Trangle {

    public static void main(String[] args) {

        System.out.printf("Площадь треугольника %.2f",geroneSquare(3, 4, 5));

        // %2f синтаксис говорит Java вернуть вашу переменную с двумя десятичными знаками ( .2) в десятичном представлении числа с плавающей запятой ( f) с начала спецификатора формата ( %).

    }

    public static double geroneSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

        //Класс Math содержит методы для выполнения основных числовых операций, таких как элементарная экспонента, логарифм, квадратный корень и тригонометрические функции.
    }

}
