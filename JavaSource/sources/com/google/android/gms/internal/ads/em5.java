package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public final class em5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7709a;

    /* renamed from: b, reason: collision with root package name */
    public final xp5 f7710b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f7711c;

    private em5(CopyOnWriteArrayList copyOnWriteArrayList, int i7, xp5 xp5Var) {
        this.f7711c = copyOnWriteArrayList;
        this.f7709a = 0;
        this.f7710b = xp5Var;
    }

    public final em5 a(int i7, xp5 xp5Var) {
        return new em5(this.f7711c, 0, xp5Var);
    }

    public final void b(Handler handler, fm5 fm5Var) {
        this.f7711c.add(new dm5(handler, fm5Var));
    }

    public final void c(fm5 fm5Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7711c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            dm5 dm5Var = (dm5) it.next();
            if (dm5Var.f7178a == fm5Var) {
                copyOnWriteArrayList.remove(dm5Var);
            }
        }
    }

    public em5() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
