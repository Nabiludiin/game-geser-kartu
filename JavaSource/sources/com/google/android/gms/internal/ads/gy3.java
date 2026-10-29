package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class gy3 {

    /* renamed from: a, reason: collision with root package name */
    private final fy3 f9255a;

    private gy3(fy3 fy3Var) {
        ex3 ex3Var = dx3.f7348r;
        this.f9255a = fy3Var;
    }

    public static gy3 a(final ex3 ex3Var) {
        return new gy3(new fy3() { // from class: com.google.android.gms.internal.ads.dy3
            @Override // com.google.android.gms.internal.ads.fy3
            public final /* synthetic */ Iterator a(gy3 gy3Var, CharSequence charSequence) {
                return new xx3(gy3Var, charSequence, ex3.this);
            }
        });
    }

    public static gy3 b(Pattern pattern) {
        final jx3 jx3Var = new jx3(pattern);
        rx3.f(!((ix3) jx3Var.a("")).f10257a.matches(), "The pattern may not match the empty string: %s", jx3Var);
        return new gy3(new fy3() { // from class: com.google.android.gms.internal.ads.by3
            @Override // com.google.android.gms.internal.ads.fy3
            public final /* synthetic */ Iterator a(gy3 gy3Var, CharSequence charSequence) {
                return new yx3(gy3Var, charSequence, gx3.this.a(charSequence));
            }
        });
    }

    public static gy3 c(int i7) {
        final int i8 = 4000;
        return new gy3(new fy3(i8) { // from class: com.google.android.gms.internal.ads.cy3
            @Override // com.google.android.gms.internal.ads.fy3
            public final /* synthetic */ Iterator a(gy3 gy3Var, CharSequence charSequence) {
                return new zx3(gy3Var, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Iterator f(CharSequence charSequence) {
        return this.f9255a.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new ay3(this, charSequence);
    }

    public final List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator f8 = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (f8.hasNext()) {
            arrayList.add((String) f8.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
