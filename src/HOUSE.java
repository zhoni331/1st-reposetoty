public class HOUSE {
    private int numrooms;
    private int numfloors;
    private String pool;
    private String garage;

    private HOUSE(Builder builder){
        this.numrooms = builder . numrooms;
        this.numfloors = builder . numfloors;
        this.pool = builder . pool;
        this.garage = builder . garage;
    }
    public void house(String massege){
        System.out.println("House has " + numfloors + " floors" + ", " + numrooms + " rooms."
        + " Also it " + pool + " and " + garage);
    }

    public static class Builder{
        private int numrooms = 5;
        private int numfloors = 2;
        private String pool = "no pool";
        private String garage = "no garage";

        public Builder setnumrooms(int numrooms){
            this.numrooms = numrooms;
            return this;
        }
        public Builder setnumfloors(int numfloors){
            this.numfloors = numfloors;
            return this;
        }
        public Builder haspool(String pool){
            this.pool = pool;
            return this;
        }
        public Builder hasgarage(String garage){
            this.garage = garage;
            return this;
        }
        public HOUSE build(){ return new HOUSE(this);}
    }

    public static void main(String[] args){
        HOUSE house1 = new HOUSE.Builder()
                .setnumfloors(5)
                .setnumrooms(12)
                .haspool("has pool")
                .hasgarage("has no garage")
                .build();

        house1.house("This is info about house");
    }
}
