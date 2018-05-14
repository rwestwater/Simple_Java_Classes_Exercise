public class Printer {
    private int toner;
    private int pages;
    private int copies;

    public Printer(int toner, int pages, int copies) {
    this.toner = toner;
    this.pages = pages;
    this.copies = copies;
    }

    public int getPages(){
        return this.pages;
    }

    public int getCopies(){
        return this.copies;
    }

    public int getToner(){
        return this.toner;
    }

    public int getRefill(){
        return this.pages = 100;
    }

    public int getPrint() {
        if (this.pages >= this.copies){
            this.pages -= this.copies;
            this.toner -= this.copies;
        }
        return this.pages;
    }

}
