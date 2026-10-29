package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final int f9393a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9394b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9395c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9396d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9397e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9398f;

    private ha(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f9393a = i7;
        this.f9394b = i8;
        this.f9395c = i9;
        this.f9396d = i10;
        this.f9397e = i11;
        this.f9398f = i12;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static ha a(String str) {
        rx3.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = split.length;
            if (i7 >= length) {
                if (i9 == -1 || i10 == -1 || i12 == -1) {
                    return null;
                }
                return new ha(i8, i9, i10, i11, i12, length);
            }
            String a8 = zw3.a(split[i7].trim());
            switch (a8.hashCode()) {
                case 100571:
                    if (!a8.equals("end")) {
                        break;
                    } else {
                        i10 = i7;
                        break;
                    }
                case 3556653:
                    if (!a8.equals("text")) {
                        break;
                    } else {
                        i12 = i7;
                        break;
                    }
                case 102749521:
                    if (!a8.equals("layer")) {
                        break;
                    } else {
                        i8 = i7;
                        break;
                    }
                case 109757538:
                    if (!a8.equals("start")) {
                        break;
                    } else {
                        i9 = i7;
                        break;
                    }
                case 109780401:
                    if (!a8.equals("style")) {
                        break;
                    } else {
                        i11 = i7;
                        break;
                    }
            }
            i7++;
        }
    }
}
