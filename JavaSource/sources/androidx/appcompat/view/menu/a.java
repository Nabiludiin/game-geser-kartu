package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class a implements j {

    /* renamed from: q, reason: collision with root package name */
    protected Context f405q;

    /* renamed from: r, reason: collision with root package name */
    protected Context f406r;

    /* renamed from: s, reason: collision with root package name */
    protected e f407s;

    /* renamed from: t, reason: collision with root package name */
    protected LayoutInflater f408t;

    /* renamed from: u, reason: collision with root package name */
    protected LayoutInflater f409u;

    /* renamed from: v, reason: collision with root package name */
    private j.a f410v;

    /* renamed from: w, reason: collision with root package name */
    private int f411w;

    /* renamed from: x, reason: collision with root package name */
    private int f412x;

    /* renamed from: y, reason: collision with root package name */
    protected k f413y;

    /* renamed from: z, reason: collision with root package name */
    private int f414z;

    public a(Context context, int i7, int i8) {
        this.f405q = context;
        this.f408t = LayoutInflater.from(context);
        this.f411w = i7;
        this.f412x = i8;
    }

    protected void a(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f413y).addView(view, i7);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z7) {
        j.a aVar = this.f410v;
        if (aVar != null) {
            aVar.b(eVar, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void c(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f413y;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f407s;
        int i7 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList E = this.f407s.E();
            int size = E.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                g gVar = (g) E.get(i9);
                if (q(i8, gVar)) {
                    View childAt = viewGroup.getChildAt(i8);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n7 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n7.setPressed(false);
                        n7.jumpDrawablesToCurrentState();
                    }
                    if (n7 != childAt) {
                        a(n7, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(j.a aVar) {
        this.f410v = aVar;
    }

    public abstract void h(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f406r = context;
        this.f409u = LayoutInflater.from(context);
        this.f407s = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f408t.inflate(this.f412x, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f410v;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f407s;
        }
        return aVar.c(mVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    public j.a m() {
        return this.f410v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a j7 = view instanceof k.a ? (k.a) view : j(viewGroup);
        h(gVar, j7);
        return (View) j7;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f413y == null) {
            k kVar = (k) this.f408t.inflate(this.f411w, viewGroup, false);
            this.f413y = kVar;
            kVar.b(this.f407s);
            c(true);
        }
        return this.f413y;
    }

    public void p(int i7) {
        this.f414z = i7;
    }

    public abstract boolean q(int i7, g gVar);
}
