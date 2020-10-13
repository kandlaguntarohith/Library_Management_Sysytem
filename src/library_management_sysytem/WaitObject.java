package library_management_sysytem;

public class WaitObject {
    public final int userId;
    public final int priorty;

    public WaitObject(int userId, int priorty) {
        this.userId = userId;
        this.priorty = priorty;
    }
}