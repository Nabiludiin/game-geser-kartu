package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class ga3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8741a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8742b;

    /* renamed from: c, reason: collision with root package name */
    private final AudioManager f8743c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f8744d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f8745e;

    /* renamed from: f, reason: collision with root package name */
    private final ExecutorService f8746f;

    /* renamed from: g, reason: collision with root package name */
    private final ta3 f8747g;

    public ga3(Handler handler, Context context, ca3 ca3Var, ta3 ta3Var) {
        super(handler);
        this.f8744d = new AtomicReference(Float.valueOf(-1.0f));
        this.f8745e = new AtomicBoolean(false);
        this.f8746f = Executors.newSingleThreadExecutor();
        this.f8741a = handler;
        this.f8742b = context;
        this.f8743c = (AudioManager) context.getSystemService("audio");
        this.f8747g = ta3Var;
    }

    private final void h() {
        this.f8746f.submit(new fa3(this));
    }

    public final void a() {
        h();
        this.f8742b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f8742b.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float c() {
        AudioManager audioManager = this.f8743c;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f8 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f8 = streamVolume / streamMaxVolume;
            if (f8 > 1.0f) {
                return 1.0f;
            }
        }
        return f8;
    }

    final /* synthetic */ Handler d() {
        return this.f8741a;
    }

    final /* synthetic */ AtomicReference e() {
        return this.f8744d;
    }

    final /* synthetic */ AtomicBoolean f() {
        return this.f8745e;
    }

    final /* synthetic */ ta3 g() {
        return this.f8747g;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        if (this.f8745e.getAndSet(true)) {
            return;
        }
        h();
    }
}
