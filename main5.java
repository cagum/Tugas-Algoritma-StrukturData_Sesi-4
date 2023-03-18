public class main5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mochammad Cahya Gumilar-TI22B");
    
    int baris = 3;
        int kolom = 4;
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                if (j % 2 == 1) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}

