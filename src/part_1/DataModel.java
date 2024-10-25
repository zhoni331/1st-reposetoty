package part_1;

public class DataModel {
    private String data;

    public DataModel(){
        this.data = "";
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public void appendData(String newData){
        this.data+= '|' +newData;
    }
}
