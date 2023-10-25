import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.println("putin:");
            String string = scanner.nextLine();
            try {

                System.out.println("output:");
                System.out.println(calc(string));
                System.out.println();
            } catch (Exception e) {
                System.out.println("throws Exception");
                System.out.println();
            }
        }
    }
    public static String calc(String input) {
        input = input.trim();                           //удаляем пробелы до и просле введенного текстового выражения
        String[] operands = input.split("[+-/*]");//создаем массив заполненный элементами разбитыми по математическим операторам
        for (int i = 0; i < operands.length; i++) {     //создаем условия для проверки ввода числовых значений в консоль
            int num = parseInt(operands[i]);            //путем перевода текстовых значений из массива в целочисленные
            if (num<1 || num>10){                       //создаем условия для проверки ждения введеных числовых значений в диопазон от 1 до 10
                System.out.println(operands[-1]);
            }
        }
        String[] operators = input.split("[0-9]+");//создаем массив заполненный элементами разбитыми по математическим операндам
        if (operators.length > 2) {                      //создаем условие, при котором просим вывести отрицательное значение массива,
            System.out.println(operands[-1]);            //если операторов больше 1
        } else if (operands.length !=2) {                //создаем условие, при котором просим вывести отрицательное значение массива,
            System.out.println(operands[-1]);            //если операндов больше 2
        }
        int result = parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            switch (operators[i]) {
                case "+":
                    result += parseInt(operands[i]);
                    break;
                case "-":
                    result -= parseInt(operands[i]);
                    break;
                case "*":
                    result *= parseInt(operands[i]);
                    break;
                case "/":
                    result /= parseInt(operands[i]);
                    break;
            }
        }
        String output = String.valueOf(result);
        return output;
    }
}


