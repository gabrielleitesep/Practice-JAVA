public class EX5 {
    public static void main(String[] args) {
        
        String[] array1 = {"Manga", "Caqui", "Morango", "Amora"};
        String[] array2 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break; 
                }    
            }
        }
    }
    
}
