package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class hi3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9544b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static hi3 f9545c;

    /* renamed from: a, reason: collision with root package name */
    private final fi3 f9546a;

    private hi3(Context context, ExecutorService executorService, li3 li3Var) {
        ti3 ti3Var = new ti3(null);
        ti3Var.c(context);
        ti3Var.b(executorService);
        ti3Var.d(li3Var);
        this.f9546a = (fi3) ((ri3) ti3Var.a()).G.b();
    }

    public static hi3 a(Context context, ExecutorService executorService, li3 li3Var) {
        hi3 hi3Var;
        synchronized (f9544b) {
            try {
                if (f9545c == null) {
                    f9545c = new hi3(context, executorService, li3Var);
                }
                hi3Var = f9545c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hi3Var;
    }

    public final a5.d b() {
        return this.f9546a.a();
    }

    public final String c(Context context) {
        return this.f9546a.b(context);
    }

    public final String d(Context context, String str, View view, Activity activity) {
        return this.f9546a.c(context, null, view, activity);
    }

    public final String e(Context context, String str, View view, Activity activity) {
        return this.f9546a.d(context, str, view, null);
    }

    public final void f(List list) {
        this.f9546a.e(list);
    }

    public final void g(InputEvent inputEvent) {
        this.f9546a.f(inputEvent);
    }

    public final int h() {
        return this.f9546a.h();
    }
}
