package b3;

import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.ou;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: MyApplication */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3200a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3201b;

    /* renamed from: c, reason: collision with root package name */
    private final al0 f3202c;

    /* synthetic */ a0(z zVar, byte[] bArr) {
        this.f3200a = zVar.d();
        this.f3201b = zVar.e();
        this.f3202c = zVar.f();
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f3200a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f3200a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ou c() {
        String str = this.f3200a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return ou.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return ou.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return ou.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return ou.BANNER;
                }
                break;
        }
        return ou.AD_INITIATER_UNSPECIFIED;
    }

    final String d() {
        return this.f3201b;
    }

    final al0 e() {
        return this.f3202c;
    }
}
