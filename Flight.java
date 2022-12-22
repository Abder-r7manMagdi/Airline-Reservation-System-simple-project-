
public class Flight  {
    String from;
    String to;
    String time;
    int price;
    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Flight(String from, String to, String time, int price){
        this.from=from;
        this.to=to;
        this.time=time;
        this.price=price;
    }
    public void shaw(){
        System.out.println("Flight data:");
        System.out.println("From:"+this.from+"\tTo:"+this.to+"\tAt: "+this.time+"\tPrice:"+this.price);

    }
}
