package introductionToJava.Task2;

public class Task2 {
    public static void main(String[] args) {

        //1.Напишите программу, чтобы найти вхождение в строке
        String firstLine = "JavaApi";
        String substring = "va";
        boolean result1 = firstLine.contains(substring);
        if (result1) System.out.printf("1.Подстрака %s входин в %s.\n\n", substring, firstLine);
        else System.out.printf("1. Подстрака %s не входин в %s.\n\n", substring, firstLine);

        //2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
        String first = "ABACDG";
        String second = "DGABAC";
        boolean result2 = first.length() == second.length() & (first + first).contains(second);
        if (result2) System.out.printf("2.Строка %s и строка %s, являються вращением друг друга.\n\n", first, second);
        else System.out.printf("2. Строка %s и строка %s, не являються вращением друг друга.\n\n", first, second);


        //3.Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        StringBuilder palindrome = new StringBuilder(firstLine);
        System.out.printf("3. Исходная строка -> %s развёрнутая строка -> %s.\n\n", firstLine, palindrome.reverse());

        //4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
        // Используем метод StringBuilder.append().

        int num1 = 3;
        int num2 = 56;
        StringBuilder example = new StringBuilder();
        example.append(num1).append(" + ").append(num2).append(" = ").append(num1+num2).append("\n");
        example.append(num1).append(" - ").append(num2).append(" = ").append(num1-num2).append("\n");
        example.append(num1).append(" * ").append(num2).append(" = ").append(num1*num2).append("\n");
        example.append(num1).append(" / ").append(num2).append(" = ").append(((float)num1/num2));
        System.out.printf("4. %s\n\n", example);

        //5.Замените символ “=” на слово “равно”.
        String div = example.toString().replace("=", "равно");
        System.out.printf("5. %s\n\n", div);

        //6.Сравнить время выполнения String и StringBuilder.
        String stringEquals = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            stringEquals += "=";
        }
        long end = System.currentTimeMillis();
        StringBuilder stringEquals1 = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            stringEquals1.append("=");
        }
        long end1 = System.currentTimeMillis();

        System.out.printf("6. Время работы String = %s мс\nвремя работы StringBuilder = %s мс", end-start, end1-start1);
    }

}
