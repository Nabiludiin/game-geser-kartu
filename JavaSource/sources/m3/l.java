package m3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Set f24823a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = this.f24823a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f24823a.clear();
    }
}
