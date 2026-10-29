package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MyApplication */
final class q extends androidx.lifecycle.w {

    /* renamed from: j, reason: collision with root package name */
    private static final x.a f2340j = new a();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2344f;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f2341c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f2342d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f2343e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f2345g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2346h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2347i = false;

    /* compiled from: MyApplication */
    class a implements x.a {
        a() {
        }

        @Override // androidx.lifecycle.x.a
        public androidx.lifecycle.w a(Class cls) {
            return new q(true);
        }
    }

    q(boolean z7) {
        this.f2344f = z7;
    }

    static q i(androidx.lifecycle.y yVar) {
        return (q) new androidx.lifecycle.x(yVar, f2340j).a(q.class);
    }

    @Override // androidx.lifecycle.w
    protected void d() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2345g = true;
    }

    void e(Fragment fragment) {
        if (this.f2347i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2341c.containsKey(fragment.f2108v)) {
                return;
            }
            this.f2341c.put(fragment.f2108v, fragment);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f2341c.equals(qVar.f2341c) && this.f2342d.equals(qVar.f2342d) && this.f2343e.equals(qVar.f2343e)) {
                return true;
            }
        }
        return false;
    }

    void f(Fragment fragment) {
        if (n.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = (q) this.f2342d.get(fragment.f2108v);
        if (qVar != null) {
            qVar.d();
            this.f2342d.remove(fragment.f2108v);
        }
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.f2343e.get(fragment.f2108v);
        if (yVar != null) {
            yVar.a();
            this.f2343e.remove(fragment.f2108v);
        }
    }

    Fragment g(String str) {
        return (Fragment) this.f2341c.get(str);
    }

    q h(Fragment fragment) {
        q qVar = (q) this.f2342d.get(fragment.f2108v);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f2344f);
        this.f2342d.put(fragment.f2108v, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f2341c.hashCode() * 31) + this.f2342d.hashCode()) * 31) + this.f2343e.hashCode();
    }

    Collection j() {
        return new ArrayList(this.f2341c.values());
    }

    androidx.lifecycle.y k(Fragment fragment) {
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.f2343e.get(fragment.f2108v);
        if (yVar != null) {
            return yVar;
        }
        androidx.lifecycle.y yVar2 = new androidx.lifecycle.y();
        this.f2343e.put(fragment.f2108v, yVar2);
        return yVar2;
    }

    boolean l() {
        return this.f2345g;
    }

    void m(Fragment fragment) {
        if (this.f2347i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2341c.remove(fragment.f2108v) == null || !n.D0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void n(boolean z7) {
        this.f2347i = z7;
    }

    boolean o(Fragment fragment) {
        if (this.f2341c.containsKey(fragment.f2108v)) {
            return this.f2344f ? this.f2345g : !this.f2346h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2341c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2342d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2343e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
