public class WaterBottle {
    private int total;

    public WaterBottle(int total){
        this.total = total;
    }

    public int getDrink(){
        return this.total -= 10;
    }

    public int getEmpty(){
        return this.total = 0;
    }

    public int getFill(){
        return this.total = 100;
    }
}
