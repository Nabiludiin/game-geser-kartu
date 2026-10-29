package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: MyApplication */
public abstract class m93 {
    public static m93 e(n93 n93Var, o93 o93Var) {
        lb3.a();
        return new q93(n93Var, o93Var, UUID.randomUUID().toString());
    }

    public abstract void a();

    public abstract void b(View view);

    public abstract void c();

    public abstract void d(View view, u93 u93Var, String str);
}
