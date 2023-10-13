public class pengulangan {
    public static void main(String[] args) {
        System.out.println("Nama : Abdullah Al Wafi");
        System.out.println("NIM  : 0110222103");
        System.out.println("Rombel : SE01\n");
        System.out.print("Lantai yang ada di gedung ini ialah ");
        for (int lantai = 1; lantai <= 20; lantai++) {
            if (lantai == 13) {
                lantai++;
                System.out.print(lantai + ", ");
            } else if (lantai == 20) {
                System.out.print("dan " + lantai);
            } else {
                System.out.print(lantai + ", ");
            }
        }
    }
}