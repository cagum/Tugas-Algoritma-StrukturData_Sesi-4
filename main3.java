public class main3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mochammad Cahya Gumilar-TI22B");


        int limit=8, past, current, fibonacci;
        past = 1;
        current = 0;
        fibonacci = 1;
        for (int i =1; i <= limit; i++){
        System.out.print(current + ", ");
        fibonacci = past + current;
        past = current;
        current = fibonacci;
        }
    }    
    
}
