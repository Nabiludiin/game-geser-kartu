package s2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.g40;
import com.google.android.gms.internal.ads.h40;
import com.google.android.gms.internal.ads.ze0;
import java.util.Random;

/* compiled from: MyApplication */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    private static final z f26271f = new z();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26272g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final w2.g f26273a;

    /* renamed from: b, reason: collision with root package name */
    private final w f26274b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26275c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f26276d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f26277e;

    protected z() {
        w2.g gVar = new w2.g();
        w wVar = new w(new z4(), new x4(), new a4(), new g40(), new dj0(), new ze0(), new h40(), new a5());
        String r7 = w2.g.r();
        w2.a aVar = new w2.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.f26273a = gVar;
        this.f26274b = wVar;
        this.f26275c = r7;
        this.f26276d = aVar;
        this.f26277e = random;
    }

    public static w2.g a() {
        return f26271f.f26273a;
    }

    public static w b() {
        return f26271f.f26274b;
    }

    public static String c() {
        return f26271f.f26275c;
    }

    public static w2.a d() {
        return f26271f.f26276d;
    }

    public static Random e() {
        return f26271f.f26277e;
    }
}
