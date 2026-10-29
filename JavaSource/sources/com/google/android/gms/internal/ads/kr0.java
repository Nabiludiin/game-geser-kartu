package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* compiled from: MyApplication */
abstract /* synthetic */ class kr0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f11209a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f11209a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11209a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11209a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11209a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11209a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
