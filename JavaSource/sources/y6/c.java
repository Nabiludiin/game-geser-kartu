package y6;

import android.os.Handler;
import android.os.Looper;
import g6.i;
import java.util.concurrent.CancellationException;
import x6.p0;
import x6.q1;
import x6.t0;

/* compiled from: MyApplication */
public final class c extends d implements p0 {

    /* renamed from: s, reason: collision with root package name */
    private final Handler f27807s;

    /* renamed from: t, reason: collision with root package name */
    private final String f27808t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f27809u;

    /* renamed from: v, reason: collision with root package name */
    private final c f27810v;

    private c(Handler handler, String str, boolean z7) {
        super(null);
        this.f27807s = handler;
        this.f27808t = str;
        this.f27809u = z7;
        this.f27810v = z7 ? this : new c(handler, str, true);
    }

    private final void P(i iVar, Runnable runnable) {
        q1.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        t0.b().h(iVar, runnable);
    }

    @Override // x6.d0
    public boolean I(i iVar) {
        return (this.f27809u && q6.i.a(Looper.myLooper(), this.f27807s.getLooper())) ? false : true;
    }

    @Override // x6.x1
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public c M() {
        return this.f27810v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f27807s == this.f27807s && cVar.f27809u == this.f27809u;
    }

    @Override // x6.d0
    public void h(i iVar, Runnable runnable) {
        if (this.f27807s.post(runnable)) {
            return;
        }
        P(iVar, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f27807s) ^ (this.f27809u ? 1231 : 1237);
    }

    @Override // x6.d0
    public String toString() {
        String O = O();
        if (O != null) {
            return O;
        }
        String str = this.f27808t;
        if (str == null) {
            str = this.f27807s.toString();
        }
        if (!this.f27809u) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i7, q6.e eVar) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
