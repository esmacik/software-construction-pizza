public class Order {
    private OrderContext _fsm;

    public Order() {
        _fsm = new OrderContext(this);
    }

    public OrderContext getContext() {
        return _fsm;
    }

    public void turn_off() {
        throw new RuntimeException("Not Implemented!");
    }

    public void HighTemp() {
        _fsm.HighTemp();
        throw new RuntimeException("Not Implemented!");
    }

    public void MediumTemp() {
        _fsm.MediumTemp();
        throw new RuntimeException("Not Implemented!");
    }

    public void MediumTemp_Half_Power() {
        _fsm.MediumTemp_Half_Power();
        throw new RuntimeException("Not Implemented!");
    }

    public void Timer() {
        _fsm.Timer();
        throw new RuntimeException("Not Implemented!");
    }

    public void number() {
        _fsm.number();
        throw new RuntimeException("Not Implemented!");
    }

    public void Closed_Door() {
        _fsm.Closed_Door();
        throw new RuntimeException("Not Implemented!");
    }
}