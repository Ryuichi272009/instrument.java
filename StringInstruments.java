  
public class StringInstruments extends Instruments {
    protected int numString;

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public StringInstruments(){
        super();
        numString = 0;
    }

    public StringInstruments(String name, double price,int numString){
        super(name, price);
        this.numString = numString;
    }
    @Override
    public void print(){
        super.print();
        System.out.println();
        System.out.println("numString: "+numString);
        System.out.println();
    }
}

