package x6;

import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
public abstract class c1 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
