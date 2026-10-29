package m3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Map f24865a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f24866b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z7, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f24865a) {
            hashMap = new HashMap(this.f24865a);
        }
        synchronized (this.f24866b) {
            hashMap2 = new HashMap(this.f24866b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).g(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((w4.j) entry2.getKey()).d(new l3.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z7) {
        this.f24865a.put(basePendingResult, Boolean.valueOf(z7));
        basePendingResult.c(new s(this, basePendingResult));
    }

    final void d(w4.j jVar, boolean z7) {
        this.f24866b.put(jVar, Boolean.valueOf(z7));
        jVar.a().c(new t(this, jVar));
    }

    final void e(int i7, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, g.F);
    }

    final boolean g() {
        return (this.f24865a.isEmpty() && this.f24866b.isEmpty()) ? false : true;
    }
}
