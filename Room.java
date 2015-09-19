public class Room {
    private String hallName;
    private int roomNo;
    private boolean status; // room allotment status
public Room(){}
    public Room(String hallName, int roomNo){
        this.hallName = hallName;
        this.roomNo = roomNo;
        this.status = false;
    }
    public String getHallName(){
        return this.hallName;
    }
    public void setHallName(String hallName){
        this.hallName = hallName;
    }
    public int getRoomNo(){
        return this.roomNo;
    }
    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public void print(){
        if(getStatus()){
            System.out.println("Room No, " +getRoomNo()+" of "+getHallName()+" Hall is currently not available for allotment.");
        } else {
            System.out.println("Room No, "+getRoomNo()+" of "+getHallName()+" Hall is currently available for allotment.");
        }
    }
};