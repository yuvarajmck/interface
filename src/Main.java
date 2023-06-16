public class Main {
    public static void main(String[] args) {
        ConsolePrinter x = new ConsolePrinter();
        x.print("hello");
        show();
    }
    public void print(String msg){

    }
    public static void show(){
        //lambda func
        var demo = new Main();
        greet(demo::print);
        greet(msg->System.out.println(msg));
        greet(System.out::println);
        Printer printer = System.out::println;
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