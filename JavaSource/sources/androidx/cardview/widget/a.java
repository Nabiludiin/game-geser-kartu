package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: MyApplication */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.d();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f8, float f9, float f10) {
        bVar.a(new d(colorStateList, f8));
        View e8 = bVar.e();
        e8.setClipToOutline(true);
        e8.setElevation(f9);
        n(bVar, f10);
    }

    @Override // androidx.cardview.widget.c
    public void b(b bVar, float f8) {
        o(bVar).h(f8);
    }

    @Override // androidx.cardview.widget.c
    public float c(b bVar) {
        return bVar.e().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void e(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void f(b bVar, float f8) {
        bVar.e().setElevation(f8);
    }

    @Override // androidx.cardview.widget.c
    public float g(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList h(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float j(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float k(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void l(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f8) {
        o(bVar).g(f8, bVar.c(), bVar.b());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.c()) {
            bVar.f(0, 0, 0, 0);
            return;
        }
        float g8 = g(bVar);
        float d8 = d(bVar);
        int ceil = (int) Math.ceil(e.a(g8, d8, bVar.b()));
        int ceil2 = (int) Math.ceil(e.b(g8, d8, bVar.b()));
        bVar.f(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.c
    public void i() {
    }
}
