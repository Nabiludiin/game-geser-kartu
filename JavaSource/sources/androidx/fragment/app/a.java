package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: MyApplication */
final class a extends v implements n.m {

    /* renamed from: t, reason: collision with root package name */
    final n f2145t;

    /* renamed from: u, reason: collision with root package name */
    boolean f2146u;

    /* renamed from: v, reason: collision with root package name */
    int f2147v;

    a(n nVar) {
        super(nVar.o0(), nVar.r0() != null ? nVar.r0().i().getClassLoader() : null);
        this.f2147v = -1;
        this.f2145t = nVar;
    }

    private static boolean w(v.a aVar) {
        Fragment fragment = aVar.f2389b;
        return (fragment == null || !fragment.B || fragment.X == null || fragment.Q || fragment.P || !fragment.a0()) ? false : true;
    }

    Fragment A(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f2371c.size() - 1; size >= 0; size--) {
            v.a aVar = (v.a) this.f2371c.get(size);
            int i7 = aVar.f2388a;
            if (i7 != 1) {
                if (i7 != 3) {
                    switch (i7) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2389b;
                            break;
                        case 10:
                            aVar.f2395h = aVar.f2394g;
                            break;
                    }
                }
                arrayList.add(aVar.f2389b);
            }
            arrayList.remove(aVar.f2389b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2377i) {
            return true;
        }
        this.f2145t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.v
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.v
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.v
    public void h() {
        i();
        this.f2145t.a0(this, true);
    }

    @Override // androidx.fragment.app.v
    void j(int i7, Fragment fragment, String str, int i8) {
        super.j(i7, fragment, str, i8);
        fragment.I = this.f2145t;
    }

    @Override // androidx.fragment.app.v
    public v k(Fragment fragment) {
        n nVar = fragment.I;
        if (nVar == null || nVar == this.f2145t) {
            return super.k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void m(int i7) {
        if (this.f2377i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f2371c.size();
            for (int i8 = 0; i8 < size; i8++) {
                v.a aVar = (v.a) this.f2371c.get(i8);
                Fragment fragment = aVar.f2389b;
                if (fragment != null) {
                    fragment.H += i7;
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2389b + " to " + aVar.f2389b.H);
                    }
                }
            }
        }
    }

    int n(boolean z7) {
        if (this.f2146u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
            o("  ", printWriter);
            printWriter.close();
        }
        this.f2146u = true;
        if (this.f2377i) {
            this.f2147v = this.f2145t.i();
        } else {
            this.f2147v = -1;
        }
        this.f2145t.X(this, z7);
        return this.f2147v;
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2379k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2147v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2146u);
            if (this.f2376h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2376h));
            }
            if (this.f2372d != 0 || this.f2373e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2372d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2373e));
            }
            if (this.f2374f != 0 || this.f2375g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2374f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2375g));
            }
            if (this.f2380l != 0 || this.f2381m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2380l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2381m);
            }
            if (this.f2382n != 0 || this.f2383o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2382n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2383o);
            }
        }
        if (this.f2371c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2371c.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.a aVar = (v.a) this.f2371c.get(i7);
            switch (aVar.f2388a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2388a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2389b);
            if (z7) {
                if (aVar.f2390c != 0 || aVar.f2391d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2390c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2391d));
                }
                if (aVar.f2392e != 0 || aVar.f2393f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2392e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2393f));
                }
            }
        }
    }

    void q() {
        int size = this.f2371c.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.a aVar = (v.a) this.f2371c.get(i7);
            Fragment fragment = aVar.f2389b;
            if (fragment != null) {
                fragment.y1(false);
                fragment.w1(this.f2376h);
                fragment.A1(this.f2384p, this.f2385q);
            }
            switch (aVar.f2388a) {
                case 1:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, false);
                    this.f2145t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2388a);
                case 3:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.Y0(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.A0(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, false);
                    this.f2145t.j1(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.w(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, false);
                    this.f2145t.k(fragment);
                    break;
                case 8:
                    this.f2145t.h1(fragment);
                    break;
                case 9:
                    this.f2145t.h1(null);
                    break;
                case 10:
                    this.f2145t.g1(fragment, aVar.f2395h);
                    break;
            }
            if (!this.f2386r && aVar.f2388a != 1 && fragment != null && !n.P) {
                this.f2145t.L0(fragment);
            }
        }
        if (this.f2386r || n.P) {
            return;
        }
        n nVar = this.f2145t;
        nVar.M0(nVar.f2299q, true);
    }

    void r(boolean z7) {
        for (int size = this.f2371c.size() - 1; size >= 0; size--) {
            v.a aVar = (v.a) this.f2371c.get(size);
            Fragment fragment = aVar.f2389b;
            if (fragment != null) {
                fragment.y1(true);
                fragment.w1(n.c1(this.f2376h));
                fragment.A1(this.f2385q, this.f2384p);
            }
            switch (aVar.f2388a) {
                case 1:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, true);
                    this.f2145t.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2388a);
                case 3:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.g(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.j1(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, true);
                    this.f2145t.A0(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.k(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f2390c, aVar.f2391d, aVar.f2392e, aVar.f2393f);
                    this.f2145t.f1(fragment, true);
                    this.f2145t.w(fragment);
                    break;
                case 8:
                    this.f2145t.h1(null);
                    break;
                case 9:
                    this.f2145t.h1(fragment);
                    break;
                case 10:
                    this.f2145t.g1(fragment, aVar.f2394g);
                    break;
            }
            if (!this.f2386r && aVar.f2388a != 3 && fragment != null && !n.P) {
                this.f2145t.L0(fragment);
            }
        }
        if (this.f2386r || !z7 || n.P) {
            return;
        }
        n nVar = this.f2145t;
        nVar.M0(nVar.f2299q, true);
    }

    Fragment s(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i7 = 0;
        while (i7 < this.f2371c.size()) {
            v.a aVar = (v.a) this.f2371c.get(i7);
            int i8 = aVar.f2388a;
            if (i8 != 1) {
                if (i8 == 2) {
                    Fragment fragment3 = aVar.f2389b;
                    int i9 = fragment3.N;
                    boolean z7 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.N == i9) {
                            if (fragment4 == fragment3) {
                                z7 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2371c.add(i7, new v.a(9, fragment4));
                                    i7++;
                                    fragment2 = null;
                                }
                                v.a aVar2 = new v.a(3, fragment4);
                                aVar2.f2390c = aVar.f2390c;
                                aVar2.f2392e = aVar.f2392e;
                                aVar2.f2391d = aVar.f2391d;
                                aVar2.f2393f = aVar.f2393f;
                                this.f2371c.add(i7, aVar2);
                                arrayList.remove(fragment4);
                                i7++;
                            }
                        }
                    }
                    if (z7) {
                        this.f2371c.remove(i7);
                        i7--;
                    } else {
                        aVar.f2388a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i8 == 3 || i8 == 6) {
                    arrayList.remove(aVar.f2389b);
                    Fragment fragment5 = aVar.f2389b;
                    if (fragment5 == fragment2) {
                        this.f2371c.add(i7, new v.a(9, fragment5));
                        i7++;
                        fragment2 = null;
                    }
                } else if (i8 != 7) {
                    if (i8 == 8) {
                        this.f2371c.add(i7, new v.a(9, fragment2));
                        i7++;
                        fragment2 = aVar.f2389b;
                    }
                }
                i7++;
            }
            arrayList.add(aVar.f2389b);
            i7++;
        }
        return fragment2;
    }

    public String t() {
        return this.f2379k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2147v >= 0) {
            sb.append(" #");
            sb.append(this.f2147v);
        }
        if (this.f2379k != null) {
            sb.append(" ");
            sb.append(this.f2379k);
        }
        sb.append("}");
        return sb.toString();
    }

    boolean u(int i7) {
        int size = this.f2371c.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = ((v.a) this.f2371c.get(i8)).f2389b;
            int i9 = fragment != null ? fragment.N : 0;
            if (i9 != 0 && i9 == i7) {
                return true;
            }
        }
        return false;
    }

    boolean v(ArrayList arrayList, int i7, int i8) {
        if (i8 == i7) {
            return false;
        }
        int size = this.f2371c.size();
        int i9 = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = ((v.a) this.f2371c.get(i10)).f2389b;
            int i11 = fragment != null ? fragment.N : 0;
            if (i11 != 0 && i11 != i9) {
                for (int i12 = i7; i12 < i8; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    int size2 = aVar.f2371c.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        Fragment fragment2 = ((v.a) aVar.f2371c.get(i13)).f2389b;
                        if ((fragment2 != null ? fragment2.N : 0) == i11) {
                            return true;
                        }
                    }
                }
                i9 = i11;
            }
        }
        return false;
    }

    boolean x() {
        for (int i7 = 0; i7 < this.f2371c.size(); i7++) {
            if (w((v.a) this.f2371c.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f2387s != null) {
            for (int i7 = 0; i7 < this.f2387s.size(); i7++) {
                ((Runnable) this.f2387s.get(i7)).run();
            }
            this.f2387s = null;
        }
    }

    void z(Fragment.g gVar) {
        for (int i7 = 0; i7 < this.f2371c.size(); i7++) {
            v.a aVar = (v.a) this.f2371c.get(i7);
            if (w(aVar)) {
                aVar.f2389b.x1(gVar);
            }
        }
    }
}
