package x6;

import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
public final class n1 extends CancellationException {

    /* renamed from: q, reason: collision with root package name */
    public final transient m1 f27415q;

    public n1(String str, Throwable th, m1 m1Var) {
        super(str);
        this.f27415q = m1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return q6.i.a(n1Var.getMessage(), getMessage()) && q6.i.a(n1Var.f27415q, this.f27415q) && q6.i.a(n1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        q6.i.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f27415q.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f27415q;
    }
}
