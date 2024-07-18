import java.util.HashSet;
public class Finder {
        public static void main(String[] args) {
            int[] numbers = {2, 4, 6, 8, 2, 6, 8, 10, 10, 12, 12, 14, 16, 4};
            // Tekrar eden çift sayıları tutmak için bir HashSet kullanıyoruz
            HashSet<Integer> duplicates = new HashSet<>();
            // Daha önce görülen çift sayıları tutmak için bir HashSet kullanıyoruz
            HashSet<Integer> seen = new HashSet<>();
            for (int number : numbers) {
                // Çift sayıları kontrol ediyoruz
                if (number % 2 == 0) {
                    // Eğer sayı daha önce görüldüyse, duplicates setine ekliyoruz
                    if (seen.contains(number)) {
                        duplicates.add(number);
                    } else {
                        // Daha önce görülmemişse, seen setine ekliyoruz
                        seen.add(number);
                    }
                }
            }

            // Tekrar eden çift sayıları ekrana yazdırıyoruz
            System.out.println("Tekrar eden çift sayılar: " + duplicates);
        }

}
