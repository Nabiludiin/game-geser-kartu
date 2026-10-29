package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
final class aj5 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f5009a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f5010b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dj5 f5011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj5(dj5 dj5Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(dj5Var);
        this.f5011c = dj5Var;
        this.f5009a = contentResolver;
        this.f5010b = uri;
    }

    public final void a() {
        this.f5009a.registerContentObserver(this.f5010b, false, this);
    }

    public final void b() {
        this.f5009a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        dj5 dj5Var = this.f5011c;
        dj5Var.f(yi5.a(dj5Var.g(), dj5Var.j(), dj5Var.h()));
    }
}
