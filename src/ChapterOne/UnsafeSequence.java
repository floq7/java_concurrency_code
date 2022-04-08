package ChapterOne;

/**
 * @author gaoqiuqi on 4/7/22
 * @date 4/7/22 20:18
 */

public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }

}

