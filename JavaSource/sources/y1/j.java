package y1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: MyApplication */
abstract class j {
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
