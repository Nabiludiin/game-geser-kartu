package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class vy {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, g00.d("gad:dynamite_module:experiment_id", ""));
        c(arrayList, t00.f15908a);
        c(arrayList, t00.f15909b);
        c(arrayList, t00.f15910c);
        c(arrayList, t00.f15911d);
        c(arrayList, t00.f15912e);
        c(arrayList, t00.f15928u);
        c(arrayList, t00.f15913f);
        c(arrayList, t00.f15920m);
        c(arrayList, t00.f15921n);
        c(arrayList, t00.f15922o);
        c(arrayList, t00.f15923p);
        c(arrayList, t00.f15924q);
        c(arrayList, t00.f15925r);
        c(arrayList, t00.f15926s);
        c(arrayList, t00.f15927t);
        c(arrayList, t00.f15914g);
        c(arrayList, t00.f15915h);
        c(arrayList, t00.f15916i);
        c(arrayList, t00.f15917j);
        c(arrayList, t00.f15918k);
        c(arrayList, t00.f15919l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, i10.f9799a);
        return arrayList;
    }

    private static void c(List list, g00 g00Var) {
        String str = (String) g00Var.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
