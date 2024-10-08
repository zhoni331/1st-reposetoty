package practise_session_week6;

class cofeeOrderiterator implements iterator{
    private cofeeOrders[] cofeeorders;
    private int position = 0;

    public cofeeOrderiterator(cofeeOrders[] cofeeorders){
        this.cofeeorders = cofeeorders;
    }
    @Override
    public boolean hasNext(){
        return position < cofeeorders.length && cofeeorders[position] != null;

    }
    @Override
    public cofeeOrders next(){
        return cofeeorders[position++];
    }
}
