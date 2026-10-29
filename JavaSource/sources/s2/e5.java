package s2;

import java.util.Comparator;
import java.util.List;

/* compiled from: MyApplication */
final /* synthetic */ class e5 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ e5 f26087q = new e5();

    private /* synthetic */ e5() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = k2.t.f24428f;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
