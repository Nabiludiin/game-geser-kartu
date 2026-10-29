package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class dj2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f7125a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7126b;

    /* renamed from: c, reason: collision with root package name */
    private final w03 f7127c;

    /* renamed from: d, reason: collision with root package name */
    private final View f7128d;

    public dj2(z64 z64Var, Context context, w03 w03Var, ViewGroup viewGroup) {
        this.f7125a = z64Var;
        this.f7126b = context;
        this.f7127c = w03Var;
        this.f7128d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        uy.a(this.f7126b);
        return this.f7125a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.cj2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return dj2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 3;
    }

    final /* synthetic */ fj2 c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f7128d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new fj2(this.f7126b, this.f7127c.f17960f, arrayList);
    }
}
