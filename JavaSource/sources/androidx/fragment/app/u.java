package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
class u {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2366a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f2367b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private q f2368c;

    u() {
    }

    void a(Fragment fragment) {
        if (this.f2366a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2366a) {
            this.f2366a.add(fragment);
        }
        fragment.B = true;
    }

    void b() {
        this.f2367b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f2367b.get(str) != null;
    }

    void d(int i7) {
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                tVar.t(i7);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2367b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.f2367b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment k7 = tVar.k();
                    printWriter.println(k7);
                    k7.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2366a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = (Fragment) this.f2366a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        t tVar = (t) this.f2367b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    Fragment g(int i7) {
        for (int size = this.f2366a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2366a.get(size);
            if (fragment != null && fragment.M == i7) {
                return fragment;
            }
        }
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (k7.M == i7) {
                    return k7;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2366a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2366a.get(size);
                if (fragment != null && str.equals(fragment.O)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (str.equals(k7.O)) {
                    return k7;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment k7;
        for (t tVar : this.f2367b.values()) {
            if (tVar != null && (k7 = tVar.k().k(str)) != null) {
                return k7;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.W;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2366a.indexOf(fragment);
        for (int i7 = indexOf - 1; i7 >= 0; i7--) {
            Fragment fragment2 = (Fragment) this.f2366a.get(i7);
            if (fragment2.W == viewGroup && (view2 = fragment2.X) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2366a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f2366a.get(indexOf);
            if (fragment3.W == viewGroup && (view = fragment3.X) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                arrayList.add(tVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    t m(String str) {
        return (t) this.f2367b.get(str);
    }

    List n() {
        ArrayList arrayList;
        if (this.f2366a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2366a) {
            arrayList = new ArrayList(this.f2366a);
        }
        return arrayList;
    }

    q o() {
        return this.f2368c;
    }

    void p(t tVar) {
        Fragment k7 = tVar.k();
        if (c(k7.f2108v)) {
            return;
        }
        this.f2367b.put(k7.f2108v, tVar);
        if (k7.S) {
            if (k7.R) {
                this.f2368c.e(k7);
            } else {
                this.f2368c.m(k7);
            }
            k7.S = false;
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k7);
        }
    }

    void q(t tVar) {
        Fragment k7 = tVar.k();
        if (k7.R) {
            this.f2368c.m(k7);
        }
        if (((t) this.f2367b.put(k7.f2108v, null)) != null && n.D0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k7);
        }
    }

    void r() {
        ArrayList arrayList = this.f2366a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            t tVar = (t) this.f2367b.get(((Fragment) obj).f2108v);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f2367b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment k7 = tVar2.k();
                if (k7.C && !k7.Y()) {
                    q(tVar2);
                }
            }
        }
    }

    void s(Fragment fragment) {
        synchronized (this.f2366a) {
            this.f2366a.remove(fragment);
        }
        fragment.B = false;
    }

    void t() {
        this.f2367b.clear();
    }

    void u(List list) {
        this.f2366a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f8 = f(str);
                if (f8 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f8);
                }
                a(f8);
            }
        }
    }

    ArrayList v() {
        ArrayList arrayList = new ArrayList(this.f2367b.size());
        for (t tVar : this.f2367b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                s r7 = tVar.r();
                arrayList.add(r7);
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k7 + ": " + r7.C);
                }
            }
        }
        return arrayList;
    }

    ArrayList w() {
        synchronized (this.f2366a) {
            try {
                if (this.f2366a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f2366a.size());
                ArrayList arrayList2 = this.f2366a;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    Fragment fragment = (Fragment) obj;
                    arrayList.add(fragment.f2108v);
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f2108v + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void x(q qVar) {
        this.f2368c = qVar;
    }
}
