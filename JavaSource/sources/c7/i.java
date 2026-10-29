package c7;

/* compiled from: MyApplication */
public final class i extends RuntimeException {

    /* renamed from: q, reason: collision with root package name */
    private final transient g6.i f3783q;

    public i(g6.i iVar) {
        this.f3783q = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f3783q.toString();
    }
}
