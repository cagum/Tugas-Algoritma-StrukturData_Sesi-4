public class main6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mochammad Cahya Gumilar-TI22B");

    char[][] pola = {
        {'A', 'B', 'A', 'B'},
        {'B', 'A', 'B'},
        {'A', 'B'},
        {'B'}
    };
    
    for (int i = 0; i < pola.length; i++) {
        for (int j = 0; j < pola[i].length; j++) {
            System.out.print(pola[i][j] + " ");
        }
        System.out.println();
    }
}
}
    

