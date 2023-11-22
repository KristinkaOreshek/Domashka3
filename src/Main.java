// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int popolnenie = 1100;//сумма пополнения
        int summaI = 100; //исходная сумма баланса
        int bonusi = 11;
        int bonus;
        if (popolnenie > 1000) {
            bonus = popolnenie + summaI + bonusi;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}