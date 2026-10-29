package c4;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: MyApplication */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f3501a;

    /* renamed from: b, reason: collision with root package name */
    public int f3502b;

    /* renamed from: c, reason: collision with root package name */
    public int f3503c;

    /* renamed from: d, reason: collision with root package name */
    public int f3504d;

    /* renamed from: e, reason: collision with root package name */
    public int f3505e;

    /* renamed from: f, reason: collision with root package name */
    public int f3506f;

    /* renamed from: g, reason: collision with root package name */
    public int f3507g;

    private p(int i7, IBinder iBinder) {
        this.f3503c = -1;
        this.f3504d = 0;
        this.f3505e = 0;
        this.f3506f = 0;
        this.f3507g = 0;
        this.f3502b = i7;
        this.f3501a = null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f3502b);
        bundle.putInt("popupLocationInfo.displayId", this.f3503c);
        bundle.putInt("popupLocationInfo.left", this.f3504d);
        bundle.putInt("popupLocationInfo.top", this.f3505e);
        bundle.putInt("popupLocationInfo.right", this.f3506f);
        bundle.putInt("popupLocationInfo.bottom", this.f3507g);
        return bundle;
    }
}
