package b7;

import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
public final class a extends CancellationException {

    /* renamed from: q, reason: collision with root package name */
    public final transient Object f3440q;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f3440q = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
