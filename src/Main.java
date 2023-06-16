public class Main {
    public static void main(String[] args) {
        ConsolePrinter x = new ConsolePrinter();
        x.print("hello");
        show();
    }
    public static void show(){
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer){
        printer.print("hello");
    }
}