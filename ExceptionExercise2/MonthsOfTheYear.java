package Exercise2;

import java.util.InputMismatchException;
//Importing Java library to allow user interaction (keyboard input);
import java.util.Scanner;

public class MonthsOfTheYear {

    public static void main(String[] args) {

        //Array Declaration, containing the months of the year;
        String[] months = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Scanner keyboard = new Scanner(System.in);
        int monthSelection = 0;
        try {
            while (monthSelection != -1) {

                //User input - Month Selection;
                System.out.println("Selecione o mês desejado: ");
                monthSelection = keyboard.nextInt();

                //Output - Selected month;
                System.out.println("O mês selecionado foi: " + months[monthSelection - 1]);
            }

        } catch (ArrayIndexOutOfBoundsException exception) {
            if (monthSelection == -1) {
                System.out.println("Vocês escolheu sair. Até mais!");

            } else {
                System.out.println("Por favor, insira um valor entre 1 e 12");

            }
        } catch (InputMismatchException exception) {
            System.out.println("Por gentileza, utilize apenas números. Letras e outros caracteres não são aceitos.");

        }

    }

}

