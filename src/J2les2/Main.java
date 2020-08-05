package J2les2;


         //1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
        // при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
       // должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

       // 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

public class Main {
    public static void main(String[] args) {
        String[][] strings = new String[][] {
                {"0", "2", "4", "8"},
                {"4", "9", "5", "9"},
                {"4", "2", "6", "0"},
                {"5", "3", "5", "2"},

        };
        ArrayService arrayService = new ArrayService();
        try {
            System.out.println(arrayService.counter(strings));
            arrayService.checkArraySize(strings);

        }catch (MyArrayDataExeption e) {
            System.out.println(e.getMessage());
        }catch (MyArraySizeExeption e) {
            System.out.println(e.getMessage());
        }








    }
}
