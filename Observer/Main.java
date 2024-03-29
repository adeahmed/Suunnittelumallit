package Observer;
public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        while (true) {
            timer.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
