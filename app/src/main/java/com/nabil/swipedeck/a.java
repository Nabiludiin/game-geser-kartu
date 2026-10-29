package com.nabil.swipedeck;

import android.content.Context;
import android.view.View;
import v1.b;
import v1.c;

public class a {

    private View f4240a;

    private c f4243d;

    private b f4244e;

    private SwipeDeck f4245f;

    private long f4246g;

    Context f4248i;

    int f4241b = -1;

    int f4242c = -1;

    private int f4247h = SwipeDeck.L;


    class RunnableC0076a implements Runnable {
        RunnableC0076a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c();
        }
    }

    a(Context context, View view, SwipeDeck swipeDeck, b bVar) {
        this.f4248i = context;
        this.f4240a = view;
        this.f4245f = swipeDeck;
        this.f4244e = bVar;
        n();
    }

    public void c() {
        this.f4245f.removeView(this.f4240a);
        this.f4245f.l(this);
    }

    private void n() {
        Context context = this.f4248i;
        View view = this.f4240a;
        b bVar = this.f4244e;
        int paddingLeft = this.f4245f.getPaddingLeft();
        int paddingTop = this.f4245f.getPaddingTop();
        SwipeDeck swipeDeck = this.f4245f;
        this.f4243d = new c(context, view, bVar, paddingLeft, paddingTop, swipeDeck.f4228t, swipeDeck.f4227s, swipeDeck);
    }

    void b() {
        this.f4240a.postDelayed(new RunnableC0076a(), this.f4247h);
    }

    View d() {
        return this.f4240a;
    }

    public long e() {
        return this.f4246g;
    }

    int f() {
        return this.f4241b;
    }

    void g(View view, View view2) {
        view.setAlpha(0.0f);
        view2.setAlpha(0.0f);
        this.f4243d.p(view, view2);
    }

    public void h(long j7) {
        this.f4246g = j7;
    }

    void i(int i7, int i8) {
        View findViewById = this.f4240a.findViewById(i7);
        findViewById.setAlpha(0.0f);
        View findViewById2 = this.f4240a.findViewById(i8);
        findViewById2.setAlpha(0.0f);
        this.f4243d.r(findViewById, findViewById2);
    }

    void j(int i7) {
        this.f4242c = i7;
    }

    public void k(int i7) {
        this.f4241b = i7;
    }

    void l(int i7, int i8) {
        View findViewById = this.f4240a.findViewById(i7);
        findViewById.setAlpha(0.0f);
        View findViewById2 = this.f4240a.findViewById(i8);
        findViewById2.setAlpha(0.0f);
        this.f4243d.t(findViewById, findViewById2);
    }

    void m(boolean z7) {
        if (z7 && this.f4245f.f4231w) {
            this.f4240a.setOnTouchListener(this.f4243d);
        } else {
            this.f4240a.setOnTouchListener(null);
        }
    }
}
