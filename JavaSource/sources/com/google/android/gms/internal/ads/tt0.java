package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: MyApplication */
public final class tt0 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f16354a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16355b;

    /* renamed from: c, reason: collision with root package name */
    private Context f16356c;

    public tt0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void a(Intent intent, int i7) {
        if (this.f16354a == null) {
            intent.setFlags(268435456);
            this.f16355b.startActivity(intent);
            return;
        }
        String valueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(valueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(valueOf);
        sb.append(" and requestCode: 236");
        v2.n1.k(sb.toString());
        this.f16354a.startActivityForResult(intent, 236);
    }

    public final Activity b() {
        return this.f16354a;
    }

    public final Context c() {
        return this.f16356c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f16356c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16355b = applicationContext;
        this.f16354a = context instanceof Activity ? (Activity) context : null;
        this.f16356c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f16354a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f16355b.startActivity(intent);
        }
    }
}
