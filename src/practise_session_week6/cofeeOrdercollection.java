package practise_session_week6;
class cofeeOrdercollection {
    private cofeeOrders[] cofeeorders;
    private int last = 0;

    public cofeeOrdercollection(int size){
            cofeeorders = new cofeeOrders[size];
    }
    public void addcofeeOrder(cofeeOrders cofeeorder){
        if (last < cofeeorders.length){
            cofeeorders[last] = cofeeorder;
            last++;
        }
    }
    public iterator createIterator(){
        return new cofeeOrderiterator(cofeeorders);
    }
}
