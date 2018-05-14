public class Calculator {
    private int num1;
    private int num2;


    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getAdd(){
        return this.num1 + this.num2;
    }

    public int getSubtract(){
        return this.num1 - this.num2;
    }

    public int getDivide(){
        return this.num1 / this.num2;
    }

    public int getMultiply(){
        return this.num1 * this.num2;
    }
}
