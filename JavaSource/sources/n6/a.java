package n6;

import java.io.Closeable;

/* compiled from: MyApplication */
public abstract class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                e6.a.a(th, th2);
            }
        }
    }
}
