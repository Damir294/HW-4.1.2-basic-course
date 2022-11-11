public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1904; i <= 2096; i += 4) {// все года делятся на 4 без остатка
            System.out.println(i + " год является весокосным");
        }
        //Задание 2
        for (int i = 7; i <= 100; i += 7) {// из условия задачи последовательность чисел  больше предыдущего на 7
            System.out.println(i);
        }
        //Задание 3
        for (int i = 1; i <= 512; i = i * 2){// из условия задачи каждое число умоножается на 2
            System.out.println(i);
        }
    }
}