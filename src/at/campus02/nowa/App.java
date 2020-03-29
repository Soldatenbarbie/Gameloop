package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figure;
    private int faktor;
    private Figure figureToPrint;

    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    public void Run() {
        initialize();
        printState();

        while(!exit) {
            readUserInput();
            updateState();
            printState();

            exit = !askContinue();
        }
    }

    private void initialize() {
        //anscheinend gehts auch ohne hier was zu schreiben?
    }

    private void readUserInput() {
        inputFigure();
        inputFaktor();
    }

    private void inputFigure() {
        //TODO: Hier die auszugebende Figur einlesen
        //die variable figure muss den wert des scanners bekommen
        System.out.println( " Bitte Eingabe Zahl (1-6) ");
        figure = input.nextInt();
        System.out.println(" Deine Figur ist " + figure);
        System.out.println("dies ist ein" + "\r\n"+ "linebreak");
    }

    private void inputFaktor() {
        //TODO: Hier den Faktor einlesen
        //die variable faktor muss den wert aus dem scanner bekommen
        // können wir fürs erste ignorieren. Ist für den bonus teil
    }

    private void updateState() {
        switch (figure){
            case 1:
                figureToPrint = new FigureH(faktor);
                break;
            //TODO: hier entsprechend erweitern
            default: break;
        }
    }

    private void printState() {
        if (figureToPrint != null){
            output.println(figureToPrint);
        }
    }

    private boolean askContinue(){
        return true;
    }
}
