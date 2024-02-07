package Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ClockTimer) {
            draw();
        }
    }

    private void draw() {
        System.out.println("Time: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}
