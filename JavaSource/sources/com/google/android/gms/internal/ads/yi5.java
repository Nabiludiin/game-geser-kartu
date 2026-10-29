package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
public final class yi5 {

    /* renamed from: c, reason: collision with root package name */
    public static final yi5 f19608c = new yi5(w04.n(pi5.f13891d));

    /* renamed from: d, reason: collision with root package name */
    private static final w04 f19609d = w04.p(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final z04 f19610e;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f19611a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final int f19612b;

    static {
        y04 y04Var = new y04();
        y04Var.a(5, 6);
        y04Var.a(17, 6);
        y04Var.a(7, 6);
        y04Var.a(30, 10);
        y04Var.a(18, 6);
        y04Var.a(6, 8);
        y04Var.a(8, 8);
        y04Var.a(14, 8);
        f19610e = y04Var.c();
    }

    private yi5(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            pi5 pi5Var = (pi5) list.get(i7);
            this.f19611a.put(pi5Var.f13892a, pi5Var);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f19611a.size(); i9++) {
            i8 = Math.max(i8, ((pi5) this.f19611a.valueAt(i9)).f13893b);
        }
        this.f19612b = i8;
    }

    static yi5 a(Context context, mb1 mb1Var, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), mb1Var, audioDeviceInfo);
    }

    static yi5 b(Context context, Intent intent, mb1 mb1Var, AudioDeviceInfo audioDeviceInfo) {
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager a8 = gl0.a(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = a8.getAudioDevicesForAttributes(mb1Var.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && (hi2.n(context) || hi2.o(context))) {
            directProfilesForAttributes = a8.getDirectProfilesForAttributes(mb1Var.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(m44.g(12)));
            for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
                AudioProfile a9 = ti5.a(directProfilesForAttributes.get(i8));
                encapsulationType = a9.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = a9.getFormat();
                    if (hi2.a(format) || f19610e.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = a9.getChannelMasks();
                            set.addAll(m44.g(channelMasks2));
                        } else {
                            channelMasks = a9.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(m44.g(channelMasks)));
                        }
                    }
                }
            }
            int i9 = w04.f17978s;
            t04 t04Var = new t04();
            for (Map.Entry entry : hashMap.entrySet()) {
                t04Var.g(new pi5(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new yi5(t04Var.j());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? a8.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        f14 f14Var = new f14();
        f14Var.h(8, 7);
        if (i7 >= 31) {
            f14Var.h(26, 27);
        }
        if (i7 >= 33) {
            f14Var.g(30);
        }
        g14 j7 = f14Var.j();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (j7.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return f19608c;
            }
        }
        f14 f14Var2 = new f14();
        f14Var2.g(2);
        if (Build.VERSION.SDK_INT >= 29 && (hi2.n(context) || hi2.o(context))) {
            int i10 = w04.f17978s;
            t04 t04Var2 = new t04();
            j34 c8 = f19610e.keySet().c();
            while (c8.hasNext()) {
                Integer num = (Integer) c8.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= hi2.d(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), mb1Var.a());
                    if (isDirectPlaybackSupported) {
                        t04Var2.g(num);
                    }
                }
            }
            t04Var2.g(2);
            f14Var2.i(t04Var2.j());
            return new yi5(f(m44.f(f14Var2.j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z7 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z7 || e()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            f14Var2.i(f19609d);
        }
        if (intent == null || z7 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new yi5(f(m44.f(f14Var2.j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            f14Var2.i(m44.g(intArrayExtra));
        }
        return new yi5(f(m44.f(f14Var2.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static Uri c() {
        if (e()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean e() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static w04 f(int[] iArr, int i7) {
        int i8 = w04.f17978s;
        t04 t04Var = new t04();
        for (int i9 : iArr) {
            t04Var.g(new pi5(i9, i7));
        }
        return t04Var.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.hi2.x(r9.f19611a, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(com.google.android.gms.internal.ads.eq5 r10, com.google.android.gms.internal.ads.mb1 r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f7775o
            r0.getClass()
            java.lang.String r1 = r10.f7771k
            int r1 = com.google.android.gms.internal.ads.th.h(r0, r1)
            com.google.android.gms.internal.ads.z04 r2 = com.google.android.gms.internal.ads.yi5.f19610e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lbf
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.f19611a
            boolean r1 = com.google.android.gms.internal.ads.hi2.x(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.f19611a
            boolean r1 = com.google.android.gms.internal.ads.hi2.x(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.f19611a
            boolean r6 = com.google.android.gms.internal.ads.hi2.x(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.f19611a
            boolean r7 = com.google.android.gms.internal.ads.hi2.x(r6, r1)
            if (r7 == 0) goto Lbf
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.pi5 r6 = (com.google.android.gms.internal.ads.pi5) r6
            r6.getClass()
            int r7 = r10.G
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lbf
        L73:
            boolean r10 = r6.a(r7)
            if (r10 != 0) goto L85
            goto Lbf
        L7a:
            int r10 = r10.H
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.b(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r11 = 3
            if (r7 == r11) goto L97
            r11 = 4
            if (r7 == r11) goto L97
            r11 = 5
            if (r7 != r11) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            r11 = 26
            if (r10 > r11) goto Lac
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lac
            r10 = 1
            if (r3 != r10) goto Lac
            r3 = 2
        Lac:
            int r10 = com.google.android.gms.internal.ads.hi2.b(r3)
            if (r10 == 0) goto Lbf
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lbf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yi5.d(com.google.android.gms.internal.ads.eq5, com.google.android.gms.internal.ads.mb1):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.yi5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.yi5 r9 = (com.google.android.gms.internal.ads.yi5) r9
            android.util.SparseArray r1 = r8.f19611a
            android.util.SparseArray r3 = r9.f19611a
            java.lang.String r4 = com.google.android.gms.internal.ads.hi2.f9535a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L1f
            boolean r1 = com.google.android.gms.internal.ads.qi5.a(r1, r3)
            if (r1 == 0) goto L48
            goto L41
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L48
            r5 = r2
        L2a:
            if (r5 >= r4) goto L41
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L48
            int r5 = r5 + 1
            goto L2a
        L41:
            int r1 = r8.f19612b
            int r9 = r9.f19612b
            if (r1 != r9) goto L48
            return r0
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yi5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i7;
        String str = hi2.f9535a;
        int i8 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f19611a;
        if (i8 >= 31) {
            i7 = sparseArray.contentHashCode();
        } else {
            int i9 = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                i9 = (((i9 * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
            }
            i7 = i9;
        }
        return this.f19612b + (i7 * 31);
    }

    public final String toString() {
        String obj = this.f19611a.toString();
        int i7 = this.f19612b;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 50 + obj.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i7);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
