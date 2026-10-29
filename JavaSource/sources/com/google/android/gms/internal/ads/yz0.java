package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* compiled from: MyApplication */
abstract class yz0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19922a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f19923b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f19924c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f19925d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f19926e;

    static {
        String str = hi2.f9535a;
        f19922a = Integer.toString(0, 36);
        f19923b = Integer.toString(1, 36);
        f19924c = Integer.toString(2, 36);
        f19925d = Integer.toString(3, 36);
        f19926e = Integer.toString(4, 36);
    }

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (a21 a21Var : (a21[]) spanned.getSpans(0, spanned.length(), a21.class)) {
            arrayList.add(b(spanned, a21Var, 1, a21Var.a()));
        }
        for (c41 c41Var : (c41[]) spanned.getSpans(0, spanned.length(), c41.class)) {
            arrayList.add(b(spanned, c41Var, 2, c41Var.a()));
        }
        for (z01 z01Var : (z01[]) spanned.getSpans(0, spanned.length(), z01.class)) {
            arrayList.add(b(spanned, z01Var, 3, null));
        }
        for (d51 d51Var : (d51[]) spanned.getSpans(0, spanned.length(), d51.class)) {
            arrayList.add(b(spanned, d51Var, 4, d51Var.a()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f19922a, spanned.getSpanStart(obj));
        bundle2.putInt(f19923b, spanned.getSpanEnd(obj));
        bundle2.putInt(f19924c, spanned.getSpanFlags(obj));
        bundle2.putInt(f19925d, i7);
        if (bundle != null) {
            bundle2.putBundle(f19926e, bundle);
        }
        return bundle2;
    }
}
