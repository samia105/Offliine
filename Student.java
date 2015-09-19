public class Student {

    private String studentName;
    private String studentNo;
    private Room room;
    public Student(){}
    public Student(String studentName, String studentNo, Room room) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.room = room;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentNo() {
        return this.studentNo;
    }
    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }
    public Room getRoom() {
        return this.room;
    }
    public void setRoom(Room room){
        this.room = room;
    }
    void print(){
        System.out.println("Student No: "+getStudentNo()+", "+getStudentName()+", resides on "+room.getHallName()+" Hall, Room no, "+room.getRoomNo());
    }
};

