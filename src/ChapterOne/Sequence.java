package ChapterOne;

public class Sequence {
    private int nextValue;

    public synchronized int getNext() {
        return nextValue++;
    }

}
