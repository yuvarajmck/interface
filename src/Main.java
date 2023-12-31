public class Main {
    public static void main(String[] args) {
        ConsolePrinter x = new ConsolePrinter();
        x.print("hello");
        show();
    }
    public static void show(){
        //lambda func
        greet(msg->System.out.println(msg));
        greet(new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg );
            }
        });
    }

    public static void greet(Printer printer){
        printer.print("hello");
    }
}