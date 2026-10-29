package s6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import q6.i;

/* compiled from: MyApplication */
public final class a extends r6.a {
    @Override // r6.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
