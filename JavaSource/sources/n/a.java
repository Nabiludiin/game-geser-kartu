package n;

import java.util.HashMap;
import java.util.Map;
import n.b;

/* compiled from: MyApplication */
public class a extends b {

    /* renamed from: u, reason: collision with root package name */
    private HashMap f24913u = new HashMap();

    public boolean contains(Object obj) {
        return this.f24913u.containsKey(obj);
    }

    @Override // n.b
    protected b.c e(Object obj) {
        return (b.c) this.f24913u.get(obj);
    }

    @Override // n.b
    public Object j(Object obj, Object obj2) {
        b.c e8 = e(obj);
        if (e8 != null) {
            return e8.f24919r;
        }
        this.f24913u.put(obj, i(obj, obj2));
        return null;
    }

    @Override // n.b
    public Object k(Object obj) {
        Object k7 = super.k(obj);
        this.f24913u.remove(obj);
        return k7;
    }

    public Map.Entry l(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f24913u.get(obj)).f24921t;
        }
        return null;
    }
}
