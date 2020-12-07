package snpp;
public class Arrays01 {
    public static void main(String[] args) {
        int ita_nro[] = new int[4];
        for (int it_cont = 0; it_cont<4; it_cont++) {
            ita_nro[it_cont]=it_cont*5;
            System.out.println("ita_nro = " + ita_nro[it_cont]);
        }
    }
    
}
