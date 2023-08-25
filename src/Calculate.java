
public class Calculate {
    int Number;
    int Number1;

    public void Calculate(int Number , int Number1){
        this.Number= Number;
        this.Number1 = Number1;
    }
    public int Addition(){
        return Number + Number1;

    }

    public int Substract(){
        return Number - Number1;

    }
    public int Multiply(){
        return Number * Number1;

    }
    public int Division(){
        return Number / Number1;

    }
    public static void main(String[]args){

        Calculate ca = new Calculate();
        ca.Calculate(40,120);


        int Add = ca.Addition();
        int Sub = ca.Substract();
        int Multi = ca.Multiply();
        int Div = ca.Division();
        System.out.println("Addition=" + Add);
        System.out.println("Subtract=" + Sub);
        System.out.println("Multiply=" + Multi);
        System.out.println("Division=" + Div);

    }
}
