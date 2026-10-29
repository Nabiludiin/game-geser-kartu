package y1;

import android.content.Context;
import java.io.Closeable;

/* compiled from: MyApplication */
abstract class u implements Closeable {

    /* compiled from: MyApplication */
    interface a {
        a a(Context context);

        u build();
    }

    u() {
    }

    abstract g2.d a();

    abstract t c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
