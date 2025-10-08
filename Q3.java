public class Q3 {
    public static void main(String[] args) {
        //si n n'est pas fourni
        if (args.length < 1) {
            System.out.println("Usage: java Q3 <n>");
            return;
        }
        //prendre n en entrée de l'utilisateur
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
