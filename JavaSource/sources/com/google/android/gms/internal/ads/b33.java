package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: MyApplication */
public final class b33 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f5520a = new HashMap();

    public final a33 a(r23 r23Var, Context context, i23 i23Var, g33 g33Var) {
        HashMap hashMap = this.f5520a;
        a33 a33Var = (a33) hashMap.get(r23Var);
        if (a33Var != null) {
            return a33Var;
        }
        o23 o23Var = new o23(u23.M0(r23Var, context));
        a33 a33Var2 = new a33(o23Var, new j33(o23Var, i23Var, g33Var));
        hashMap.put(r23Var, a33Var2);
        return a33Var2;
    }
}
