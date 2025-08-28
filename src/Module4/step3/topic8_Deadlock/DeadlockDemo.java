package Module4.step3.topic8_Deadlock;
//смотрел реализацию с видео из обучения
import javax.sql.rowset.FilteredRowSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;

public final class DeadlockDemo implements Runnable{
    private static final String MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK = "Thread '%s' is trying to acquire lock '%s'\n";
    private static final String MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK = "Thread '%s' acquired lock '%s'\n";
    private static final String MESSAGE_TEMPLATE_RELEASE_LOCK = "Thread '%s' released lock '%s'\n";

    private static final String NAME_FIRST_LOCK = "firstLock";
    private static final String NAME_SECOND_LOCK = "secondLock";


    private final Lock firstLock;
    private final Lock secondLock;
    public DeadlockDemo(final Lock firstLock, final Lock secondLock){
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    public static void main(String[] args) {
        final Lock firstGivenLock = new ReentrantLock();
        final Lock secondGivenLock = new ReentrantLock();
        final Thread firstGivenThread = new Thread(new DeadlockDemo(firstGivenLock, secondGivenLock));
        final Thread secondGivenThread = new Thread(new DeadlockDemo(secondGivenLock, firstGivenLock));

        firstGivenThread.start();
        secondGivenThread.start();
    }

    @Override
    public void run() {
        final String currentThreadName = currentThread().getName();
    System.out.printf(MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
        this.firstLock.lock();
        try{
            System.out.printf(MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK, currentThreadName, NAME_FIRST_LOCK);
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.printf(MESSAGE_TEMPLATE_TRY_ACQUIRE_LOCK, currentThreadName, NAME_SECOND_LOCK);
            this.secondLock.lock();
            try {
                System.out.printf(MESSAGE_TEMPLATE_SUCCESS_ACQUIRE_LOCK, currentThreadName, NAME_SECOND_LOCK);
            }finally {
                this.secondLock.unlock();
                System.out.printf(MESSAGE_TEMPLATE_RELEASE_LOCK, currentThreadName, NAME_SECOND_LOCK);
            }
        }catch (final InterruptedException interruptedException){
            Thread.currentThread().interrupt();
        }finally {
            this.firstLock.unlock();
            System.out.printf(MESSAGE_TEMPLATE_RELEASE_LOCK, currentThreadName, NAME_FIRST_LOCK);
        }
    }
}
