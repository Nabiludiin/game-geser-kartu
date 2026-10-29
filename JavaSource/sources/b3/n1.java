package b3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class n1 extends LinkedHashMap {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ q1 f3308q;

    n1(q1 q1Var) {
        Objects.requireNonNull(q1Var);
        this.f3308q = q1Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        q1 q1Var = this.f3308q;
        synchronized (q1Var) {
            try {
                if (size() <= q1Var.g()) {
                    return false;
                }
                q1Var.h().add(new Pair((String) entry.getKey(), ((o1) entry.getValue()).f3314b));
                return size() > q1Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
