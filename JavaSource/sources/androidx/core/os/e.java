package androidx.core.os;

import android.os.OutcomeReceiver;
import e6.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: q, reason: collision with root package name */
    private final g6.e f1753q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g6.e eVar) {
        super(false);
        q6.i.e(eVar, "continuation");
        this.f1753q = eVar;
    }

    public void onError(Throwable th) {
        q6.i.e(th, "error");
        if (compareAndSet(false, true)) {
            g6.e eVar = this.f1753q;
            m.a aVar = e6.m.f23247q;
            eVar.h(e6.m.a(e6.n.a(th)));
        }
    }

    public void onResult(Object obj) {
        q6.i.e(obj, "result");
        if (compareAndSet(false, true)) {
            this.f1753q.h(e6.m.a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
