package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: MyApplication */
public abstract class xb3 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private yb3 f18730a;

    /* renamed from: b, reason: collision with root package name */
    protected final qb3 f18731b;

    public xb3(qb3 qb3Var) {
        this.f18731b = qb3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        yb3 yb3Var = this.f18730a;
        if (yb3Var != null) {
            yb3Var.b(this);
        }
    }

    public final void b(yb3 yb3Var) {
        this.f18730a = yb3Var;
    }
}
