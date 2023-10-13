public class praktikum {
    public static void main(String[] args) {
        System.out.println("Nama : Abdullah Al Wafi");
        System.out.println("NIM  : 0110222103");
        System.out.println("Rombel : SE01\n");
        System.out.print("Lantai yang anda tuju adalah ");
        int floar = 13;

        int actualFloar = 0;
        if (floar == 13)
            actualFloar = floar + 1;
        else if (floar > 13)
            actualFloar = floar - 1 ;
        else 
            actualFloar = floar;
        System.out.print(actualFloar);
    }
}