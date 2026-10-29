package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: MyApplication */
public final class iu2 {

    /* renamed from: a, reason: collision with root package name */
    private final eh0 f10194a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10195b;

    public iu2(eh0 eh0Var, int i7) {
        this.f10194a = eh0Var;
        this.f10195b = i7;
    }

    public final String a() {
        return this.f10194a.f7627t;
    }

    public final String b() {
        return iy3.a(this.f10194a.f7624q.getString("ms"));
    }

    public final PackageInfo c() {
        return this.f10194a.f7629v;
    }

    public final List d() {
        return this.f10194a.f7628u;
    }

    public final String e() {
        return this.f10194a.f7631x;
    }

    public final int f() {
        return this.f10195b;
    }

    final boolean g() {
        return this.f10194a.A;
    }

    final boolean h() {
        return this.f10194a.B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final int i() {
        Bundle bundle = this.f10194a.f7624q.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 8;
                    }
                    break;
            }
        }
        return -1;
    }

    final int j() {
        return this.f10194a.E;
    }
}
