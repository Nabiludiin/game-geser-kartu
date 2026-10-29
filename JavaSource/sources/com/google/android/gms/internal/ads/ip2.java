package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ip2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10114a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10115b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10116c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10117d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10118e;

    public ip2(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f10114a = str;
        this.f10115b = z7;
        this.f10116c = z8;
        this.f10117d = z9;
        this.f10118e = z10;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        String str = this.f10114a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z7 = this.f10115b;
        bundle.putInt("test_mode", z7 ? 1 : 0);
        boolean z8 = this.f10116c;
        bundle.putInt("linked_device", z8 ? 1 : 0);
        if (z7 || z8) {
            if (((Boolean) s2.b0.c().d(uy.oa)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f10118e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        String str = this.f10114a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z7 = this.f10115b;
        bundle.putInt("test_mode", z7 ? 1 : 0);
        boolean z8 = this.f10116c;
        bundle.putInt("linked_device", z8 ? 1 : 0);
        if (z7 || z8) {
            if (((Boolean) s2.b0.c().d(uy.ka)).booleanValue()) {
                bundle.putInt("risd", !this.f10117d ? 1 : 0);
            }
            if (((Boolean) s2.b0.c().d(uy.oa)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f10118e);
            }
        }
    }
}
