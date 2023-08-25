public class Saaa {
    public static void main (String[]args){
        Saaa sa = new Saaa();
        String pen = sa.askAPen(15);
        System.out.println(pen);
    }

    public String askAPen(int i){
        return "pen = Rs." + i;
    }
}
